package com.cst8277.ums;

import javax.persistence.*;

@Entity
@Table(name = "role")
public class Role {
    @Id //primary key indicator:  JPA recognizes it as the object’s ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)//@GeneratedValue indicates that the ID should AUTO INCREMENTED by mySQL
    private int id;
    private String name;
    private String description;

    //role toString for front-end
    @Override
    public String toString() {
        return "Role [Id= " + id + ", Name= " + name + ", Description= " + description + "]";
    }

    //getters and setters
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

