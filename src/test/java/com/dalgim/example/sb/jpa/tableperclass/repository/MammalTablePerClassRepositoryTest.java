package com.dalgim.example.sb.jpa.tableperclass.repository;

import com.dalgim.example.sb.jpa.tableperclass.model.MammalTablePerClass;
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
public class MammalTablePerClassRepositoryTest {

    @Autowired
    private MammalTablePerClassRepository mammalTablePerClassRepository;

    @Before
    public void setUp() throws Exception {
        MammalTablePerClass mammalTablePerClass = new MammalTablePerClass();
        mammalTablePerClass.setName("Elephant");
        mammalTablePerClass.setLivingEnvironment("Land");

        mammalTablePerClassRepository.save(mammalTablePerClass);
    }

    @Test
    public void selectSQL() throws Exception {
        assertNotNull(mammalTablePerClassRepository.findOne(1L));
    }
}