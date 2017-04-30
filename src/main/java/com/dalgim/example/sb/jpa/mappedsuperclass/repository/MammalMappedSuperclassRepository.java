package com.dalgim.example.sb.jpa.mappedsuperclass.repository;

import com.dalgim.example.sb.jpa.mappedsuperclass.model.MammalMappedSuperclass;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Mateusz Dalgiewicz on 30.04.2017.
 */
@Repository
public interface MammalMappedSuperclassRepository extends CrudRepository<MammalMappedSuperclass, Long> {

}
