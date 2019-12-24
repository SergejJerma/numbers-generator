package com.serjer.service;

import org.springframework.stereotype.Service;

import com.serjer.model.Generator;

@Service
public class GeneratorService {

	public long generateNextValue(long number, long factor, long divider) {
		return (number * factor % divider);
	}
	
	public boolean isOverlap(long num1, long num2, int comparisonCriteria) {
		String a = Long.toBinaryString(num1);
		String b = Long.toBinaryString(num2);
		
		return a.length() >= comparisonCriteria &&
			   b.length() >= comparisonCriteria &&
			   	 a.substring(a.length() - comparisonCriteria, a.length())
					.equals(
				 b.substring(b.length() - comparisonCriteria, b.length()));
	}
	
	public long calculateMatches(long num1, long num2, Generator generator) {
		int matches = 0;
		
		for (int i = 0; i < generator.getIterationNumber(); i++) {
			
			num1 = generateNextValue(num1, generator.getFactorA(), generator.getDivider());
			num2 = generateNextValue(num2, generator.getFactorB(), generator.getDivider());
				
			if(isOverlap(num1, num2, generator.getComparisonCriteria())) 
				matches++;
		}
		return matches;
	}	
	
}
