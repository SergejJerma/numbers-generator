package com.serjer.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.serjer.model.Generator;

@Component
public class GeneratorRepo {

	private final List<Generator> generatorList = new ArrayList<>(List.of(new Generator(16807, 48271, 2147483647, 1000000, 8)));

	public List<Generator> getGeneratorList() {
		return generatorList;
	}
	

}
