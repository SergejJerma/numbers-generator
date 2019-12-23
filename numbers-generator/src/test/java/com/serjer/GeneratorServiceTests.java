package com.serjer;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.serjer.service.GeneratorService;


@SpringBootTest
class GeneratorServiceTests {
	
	@Autowired
	private GeneratorService generatorService;
	
		
	@Test
	public void testGenerateNextValueMethod() {
		long number = 1092455;
		long factor = 16807;
		long divider = 2147483647;
		
		assertEquals(1181022009, generatorService.generateNextValue(number, factor, divider));
		}
	
	@Test
	public void testisOverlap() {
		long number1 = 245556042;
		long number2 = 1431495498;
		long number3 = 1431495499;
		long number4 = 10;
		int comparationCriteria = 8;
		
		assertTrue(generatorService.isOverlap(number1, number2, comparationCriteria));
		assertFalse(generatorService.isOverlap(number1, number3, comparationCriteria));
		assertFalse(generatorService.isOverlap(number1, number4, comparationCriteria));
  }
	
}
