package com.mahadi.dao;

import com.mahadi.validation.ValidEmail;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Created by Mahadi on 11/2/2017.
 */
public class User {

    @NotBlank(message = "Username can not be blank.")
    @Size(min = 4, max = 15, message = "Username must be between 4 and 15 characters long.")
    @Pattern(regexp = "^\\w{4,}$", message = "Username can consist of numbers, letters and underscore.")
    private String username;

    @NotBlank(message = "Username can not be blank.")
    @Pattern(regexp = "^\\S+$", message = "Password cannot contain space.")
    @Size(min = 4, max = 15, message = "Username must be between 4 and 15 characters.")
    private String password;

    @ValidEmail(message = "This does not seem a valid email.")
    private String email;


    private boolean enabled = false;
    private String authority;

    public User() {

    }

    public User(String unsername, String password, String email, boolean enabled, String authority){

        this.username  = unsername;
        this.password  = password;
        this.email     = email;
        this.enabled   = enabled;
        this.authority = authority;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
