package com.example.model;

import lombok.Data;
import lombok.Generated;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String surname;
    private String mail;
}
