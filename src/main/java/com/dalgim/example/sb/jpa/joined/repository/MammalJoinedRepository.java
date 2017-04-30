package com.dalgim.example.sb.jpa.joined.repository;

import com.dalgim.example.sb.jpa.joined.model.MammalJoined;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Mateusz Dalgiewicz on 30.04.2017.
 */
@Repository
public interface MammalJoinedRepository extends CrudRepository<MammalJoined, Long> {
}
