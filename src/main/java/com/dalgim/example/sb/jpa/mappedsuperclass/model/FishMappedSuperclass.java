package com.dalgim.example.sb.jpa.mappedsuperclass.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Mateusz Dalgiewicz on 30.04.2017.
 */
@Entity
@Getter
@Setter
public class FishMappedSuperclass extends AnimalMappedSuperclass {

    @Id
    @GeneratedValue
    private Long id;
    private String waterType;
    private String reserviorType;
}
