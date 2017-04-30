package com.dalgim.example.sb.jpa.mappedsuperclass.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.MappedSuperclass;

/**
 * Created by Mateusz Dalgiewicz on 30.04.2017.
 */
@Getter
@Setter
@MappedSuperclass
public abstract class AnimalMappedSuperclass {

    private String name;
    private Short age;
}
