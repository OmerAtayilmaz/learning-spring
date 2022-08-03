package com.learning.secondapp.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="actors")
public class Actor implements Serializable {
    private Long id;
    private String name;
    private String surname;
    private boolean isActive;
    private String username;
    private String password;
    private byte age;
}
