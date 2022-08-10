package com.trendyol.app.entity;

import javax.persistence.*;

@Entity
@Table(name="order")
public class Order {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long order_id;


    //Relations

}
