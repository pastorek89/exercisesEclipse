package com.exercises.testing;

import com.exercises.testing.calculator.Calculator;

public class TestingMain {

	public static void main(String[] args) {
		Calculator calc = new Calculator(5,43);
		System.out.println(calc.add());
	}
}
