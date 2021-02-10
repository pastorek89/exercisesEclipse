package com.exercises.testing.shape;

public class Circle implements Shape {
	double r;
		
	public Circle(double r) {		
		this.r = r;
	}

	public String getShapeName() {
		return "Circle";
	}

	public double getField() {
		return Math.PI * r * r;
	}
	

}
