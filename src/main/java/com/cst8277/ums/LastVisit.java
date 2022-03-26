package com.cst8277.ums;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name = "last_visit")
public class LastVisit {
    @Id//primary key indicator:  JPA recognizes it as the object’s ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)//@GeneratedValue indicates that the ID should AUTO INCREMENTED
    private int id;
    private String in;
    private String out;

    public int getId() {
        return id;
    }
    //No setId needed as it is an Auto Generated Column

    public String getIn() {
        return in;
    }

    public void setIn(String in) {
        this.in = in;
    }

    public String getOut() {
        return out;
    }

    public void setOut(String out) {
        this.out = out;
    }
}
