package com.example.demo;

import com.example.demo.pojo.CoExample;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Restfulldemo1ApplicationTests {

	@Autowired
	private CoExample coExample;

	@Test
	void contextLoads() {
	}

	@Test
	public void get_age(){
		System.out.println(coExample.getAge());
	}

	@Test
	public void get_name(){
		System.out.println(coExample.getName());
	}

	@Test
	public void get_address(){
		System.out.println(coExample.getAddress());
	}

}
