package com.mahadi.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Mahadi on 11/2/2017.
 */
@Component("userDao")
public class UserDao {

    //    private JdbcTemplate jdbc;
    private NamedParameterJdbcTemplate jdbc;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Autowired
    public void setDataSource(DataSource jdbc){
        this.jdbc = new NamedParameterJdbcTemplate(jdbc);
    }

    @Transactional
    public Boolean create(User user) {
       // BeanPropertySqlParameterSource sqlParameterSource = new BeanPropertySqlParameterSource(user);

        MapSqlParameterSource parameterSource = new MapSqlParameterSource();

        parameterSource.addValue("username", user.getUsername());
        parameterSource.addValue("password", passwordEncoder.encode(user.getPassword()));
        parameterSource.addValue("email", user.getEmail());
        parameterSource.addValue("enabled", user.isEnabled());
        parameterSource.addValue("authority", user.getAuthority());

        jdbc.update("INSERT INTO users(username, password, email, enabled)VALUES(:username, :password, :email, :enabled)", parameterSource );
        return jdbc.update("INSERT INTO authorities(username, authority)VALUES(:username, :authority)", parameterSource )== 1;
    }

    public boolean exits(String username){

        return jdbc.queryForObject("select count(*) from users where username = :username",
                new MapSqlParameterSource("username", username), Integer.class) > 0;

    }

    public List<User> getAllUsers() {
        return jdbc.query("SELECT * FROM users, authorities WHERE users.username = authorities.username",
                BeanPropertyRowMapper.newInstance(User.class));
    }
}
