package com.firstapp.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Table(name="data")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of ={"id"})
@ToString
public class FirstEntity implements Serializable {

    @Id
    @SequenceGenerator(name="seq_user",allocationSize = 1)
    @GeneratedValue(generator = "seq_user",strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;

    @Column(name = "surname")
    private String surname;


}
