package com.dalgim.example.sb.jpa.singletable.repository;

import com.dalgim.example.sb.jpa.singletable.model.MammalSingleTable;
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
public class SingleTableMammalSingleTableRepositoryTest {


    @Autowired
    private MammalSingleTableRepository mammalSingleTableRepository;


    @Before
    public void setUp() throws Exception {
        MammalSingleTable mammalSingleTable = new MammalSingleTable();
        mammalSingleTable.setName("Elephant");
        mammalSingleTable.setLivingEnvironment("Land");

        mammalSingleTableRepository.save(mammalSingleTable);
    }

    @Test
    public void selectSQL() throws Exception {
       assertNotNull(mammalSingleTableRepository.findOne(1L));
    }
}