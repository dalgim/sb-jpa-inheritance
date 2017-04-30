package com.dalgim.example.sb.jpa.joined.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * Created by Mateusz Dalgiewicz on 30.04.2017.
 */
@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class AnimalJoined {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Short age;
}
