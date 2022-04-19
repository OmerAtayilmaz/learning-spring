package com.app.entity;
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
@Table(name = "person_adress")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@ToString
public class PhoneNumber implements Serializable {
    @Id
    @SequenceGenerator(name = "seq_person_adress", allocationSize = 1)
    @GeneratedValue(generator = "seq_person_adress", strategy = GenerationType.SEQUENCE)
    private Long id;

    //nullable = false,updatable = true,length = 50
    @Column(unique = true,name = "adress")
    private String adress;

    @Column(name="isActive",unique = false,nullable = true,updatable = true)
    private boolean isActive;


}
