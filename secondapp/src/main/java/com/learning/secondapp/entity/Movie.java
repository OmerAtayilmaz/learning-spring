package com.learning.secondapp.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name="movie")
public class Movie implements Serializable {
    private Long id;
    private String name;
    private Date beginToPlay;
    private int totalRevenue;
}
