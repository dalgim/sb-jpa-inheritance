package com.dalgim.example.sb.jpa.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

/**
 * Created by Mateusz Dalgiewicz on 30.04.2017.
 */
@Entity
@Getter
@Setter
public class Fish extends Animal {

    private String waterType;
    private String reserviorType;
}
