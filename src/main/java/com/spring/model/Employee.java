package com.spring.model;

import javax.persistence.*;

/**
 * Created by User on 5/12/2020.
 */
@Entity
public class Employee {

    @Id
    @GeneratedValue
    @Column(name = "id" ,nullable = false)
    private Long id;

    @Column(name = "name" ,nullable = false)
    private String name;
    @Column(name = "email" ,nullable = false ,unique = true)
    private String email;
    @Column(name = "password" ,nullable = false)
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
