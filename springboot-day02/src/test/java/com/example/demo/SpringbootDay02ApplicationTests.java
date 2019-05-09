package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.bean.Person;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootDay02ApplicationTests {
	
	@Autowired
	private Person person;
	
	@Test
	public void contextLoads() {
		System.out.println(person);
	}

}
