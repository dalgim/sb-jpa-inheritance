package com.dalgim.example.sb.jpa.joined.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;

/**
 * Created by Mateusz Dalgiewicz on 30.04.2017.
 */
@Getter
@Setter
@Entity
public class MammalJoined extends AnimalJoined {

    private String livingEnvironment;
}