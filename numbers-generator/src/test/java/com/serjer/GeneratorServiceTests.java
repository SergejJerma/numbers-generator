package com.serjer;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.serjer.model.Generator;
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
	public void testIsOverlapMethod() {
		long number1 = 245556042;
		long number2 = 1431495498;
		long number3 = 1431495499;
		long number4 = 10;
	
		int lastBitsNumber = 8;
		
		assertTrue(generatorService.isOverlap(number1, number2, lastBitsNumber));
		assertFalse(generatorService.isOverlap(number1, number3, lastBitsNumber));
		assertFalse(generatorService.isOverlap(number1, number4, lastBitsNumber));
  }
	
	@Test
	public void testCalculateMatchesMethod(){
	   
	    assertEquals(3868, generatorService
	    					.calculateMatches(65, 8921, 
	    									 new Generator(16807, 48271, 2147483647, 1000000, 8)));
	    assertEquals(3926, generatorService
	    					.calculateMatches(635, 12, 
	    									 new Generator(16807, 48271, 2147483647, 1000000, 8)));
	 
	}
	
}
