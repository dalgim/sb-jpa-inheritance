package com.dalgim.example.sb.jpa.singletable.repository;

import com.dalgim.example.sb.jpa.singletable.model.MammalSingleTable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Mateusz Dalgiewicz on 30.04.2017.
 */
@Repository
public interface MammalSingleTableRepository extends CrudRepository<MammalSingleTable, Long> {
}
