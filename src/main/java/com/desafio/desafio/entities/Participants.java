package com.desafio.desafio.entities;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_participants")
public class Participants {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;

    @ManyToMany(mappedBy = "participants")
    private List<Activity> activities = new ArrayList<>();

    public Participants() {}

    public Participants(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public List<Activity> getActivities() {
        return activities;
    }


}