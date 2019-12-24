package com.serjer.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Generator {
	private long factorA;
	private long factorB;
	private long divider;
	private long iterationNumber;
	private int lastBitsNumber;
}
