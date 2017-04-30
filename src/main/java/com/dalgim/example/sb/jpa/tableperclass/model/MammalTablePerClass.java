package com.dalgim.example.sb.jpa.tableperclass.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;

/**
 * Created by Mateusz Dalgiewicz on 30.04.2017.
 */
@Getter
@Setter
@Entity
public class MammalTablePerClass extends AnimalTablePerClass {

    private String livingEnvironment;
}
