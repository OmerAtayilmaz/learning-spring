package com.learning.secondapp.entity;


import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="actor_movie")
public class ActorMovie implements Serializable {
    private Long id;
    private Long movieId;
    private Long actorId;
}
