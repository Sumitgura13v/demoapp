package com.demo.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String pancard;
    private LocalDate joiningdate;
    private LocalDate enddate;
    private String city;

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

    public String getPancard() {
        return pancard;
    }

    public void setPancard(String pancard) {
        this.pancard = pancard;
    }

    public LocalDate getJoiningdate() {
        return joiningdate;
    }

    public void setJoiningdate(LocalDate joiningdate) {
        this.joiningdate = joiningdate;
    }

    public LocalDate getEnddate() {
        return enddate;
    }

    public void setEnddate(LocalDate enddate) {
        this.enddate = enddate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Client(int id, String name, String pancard, LocalDate joiningdate, LocalDate enddate, String city) {
        this.id = id;
        this.name = name;
        this.pancard = pancard;
        this.joiningdate = joiningdate;
        this.enddate = enddate;
        this.city = city;
    }

    public Client() {
    }
}
