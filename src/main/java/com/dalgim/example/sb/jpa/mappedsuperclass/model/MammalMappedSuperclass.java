package com.dalgim.example.sb.jpa.mappedsuperclass.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;

/**
 * Created by Mateusz Dalgiewicz on 30.04.2017.
 */
@Entity
@Getter
@Setter
public class MammalMappedSuperclass extends AnimalMappedSuperclass {

    private String livingEnvironment;
}