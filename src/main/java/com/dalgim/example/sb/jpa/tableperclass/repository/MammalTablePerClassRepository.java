package com.dalgim.example.sb.jpa.tableperclass.repository;

import com.dalgim.example.sb.jpa.tableperclass.model.MammalTablePerClass;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Mateusz Dalgiewicz on 30.04.2017.
 */
@Repository
public interface MammalTablePerClassRepository extends CrudRepository<MammalTablePerClass, Long> {
}
