package com.dalgim.example.sb.jpa;

import com.dalgim.example.sb.jpa.model.Animal;
import com.dalgim.example.sb.jpa.repository.AnimalRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SbJpaInheritanceApplicationTests {

	@Autowired
	private AnimalRepository animalRepository;

	@Test
	public void contextLoads() {
	}

}
