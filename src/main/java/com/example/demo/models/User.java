package com.example.demo.models;

import javax.persistence.*;

/**
 * Created by ding_ on 6/6/2021
 */
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
}
