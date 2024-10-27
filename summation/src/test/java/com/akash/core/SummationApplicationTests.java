package com.akash.core;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.akash.services.SummationService;

@SpringBootTest
class SummationApplicationTests {
	
	@Autowired
	SummationService test;
	@Test
	void testAddMethod() {
		assertEquals(7,test.add(2,5));
	}

}
