package com.dalgim.example.sb.jpa.mappedsuperclass.repository;

import com.dalgim.example.sb.jpa.mappedsuperclass.model.MammalMappedSuperclass;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Mateusz Dalgiewicz on 30.04.2017.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MappedSuperClassMammalMappedSuperclassRepositoryTest {

    @Autowired
    private MammalMappedSuperclassRepository mappedSuperclassMammalMappedSuperclassRepository;

    @Before
    public void setUp() throws Exception {
        MammalMappedSuperclass mammalMappedSuperclass = new MammalMappedSuperclass();
        mammalMappedSuperclass.setName("Elephant");
        mammalMappedSuperclass.setLivingEnvironment("Land");

        mappedSuperclassMammalMappedSuperclassRepository.save(mammalMappedSuperclass);
    }

    @Test
    public void selectSQL() throws Exception {
        MammalMappedSuperclass mamal = mappedSuperclassMammalMappedSuperclassRepository.findOne(1L);
    }

}