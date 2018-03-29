package com.mahadi.dao;

import com.mahadi.validation.ValidEmail;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Mahadi on 10/15/2017.
 */
public class Notice {

    private int id;

    @NotNull(message = "Field Must be not empty !")
    @Size(min=4, max=30, message = "You Must be write 4 between 30 characters")
    private String name;

    @NotNull
    @ValidEmail
    private String email;

    @NotNull(message = "Field Must No be empty !")
    @Size(min=10, max=200, message = "You Must be write 10 between 200 characters")
    private String text;

    public Notice() {

    }

    public Notice(int id, String name, String email, String text) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    @Override
    public String toString() {
        return "Notice{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
