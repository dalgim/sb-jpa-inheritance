package com.dalgim.example.sb.jpa.repository;

import com.dalgim.example.sb.jpa.model.Animal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Mateusz Dalgiewicz on 30.04.2017.
 */
@Repository
public interface AnimalRepository extends CrudRepository<Animal, Long> {
}
