package com.firstapp.demo.student;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;

import lombok.EqualsAndHashCode;
import lombok.ToString;


@Entity
@Table(name="student")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of ={"id"})
@ToString
public class Student implements Serializable  {
    @Id
    @SequenceGenerator(name="seq_user",allocationSize = 1)
    @GeneratedValue(generator = "seq_user",strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "number")
    private String number;


    @Column(name="age")/* @Transient geçici, virtual veri oluşturmamızı sağlar, birthDate alıp age'i gösterebiliriz. get methodundan hesaplama yapılmalıdır*/
    private int age;

    /* return Period.between(this.birthDate,LocalDate.now()).getYears();
    * */

    @Column(name = "localdate")
    private LocalDate localdate;


}
