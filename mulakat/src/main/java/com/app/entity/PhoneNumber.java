package com.app.entity;

import java.io.Serializable;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "numbers")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@ToString
public class PhoneNumber implements Serializable {
    @Id
    @SequenceGenerator(name="seq_user_phonenumber",allocationSize = 1)
    @GeneratedValue(generator = "seq_user_phonenumber",strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name="phonenumber")
    private String phonenumber;

    @Column(name="status")
    private boolean isActive;

    @ManyToOne
    @JoinColumn(name="user_phonenumber_id")
    private User user;

    @Column(name="user_id")
    private Long user_id;


}
