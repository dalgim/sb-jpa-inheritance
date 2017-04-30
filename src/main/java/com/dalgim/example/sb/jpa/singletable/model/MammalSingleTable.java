package com.dalgim.example.sb.jpa.singletable.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Created by Mateusz Dalgiewicz on 30.04.2017.
 */
@Getter
@Setter
@Entity
@DiscriminatorValue("MM")
public class MammalSingleTable extends AnimalSingleTable {

    private String livingEnvironment;
}