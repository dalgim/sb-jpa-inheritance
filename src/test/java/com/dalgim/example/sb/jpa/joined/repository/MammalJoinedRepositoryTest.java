package com.dalgim.example.sb.jpa.joined.repository;

import com.dalgim.example.sb.jpa.joined.model.MammalJoined;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by Mateusz Dalgiewicz on 30.04.2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MammalJoinedRepositoryTest {

    @Autowired
    private MammalJoinedRepository mammalJoinedRepository;


    @Before
    public void setUp() throws Exception {
        MammalJoined mammalJoined = new MammalJoined();
        mammalJoined.setName("Elephant");
        mammalJoined.setLivingEnvironment("Land");

        mammalJoinedRepository.save(mammalJoined);
    }

    @Test
    public void selectSQL() throws Exception {
        assertNotNull(mammalJoinedRepository.findOne(1L));
    }
}