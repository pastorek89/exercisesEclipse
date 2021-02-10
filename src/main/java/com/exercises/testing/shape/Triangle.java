package com.exercises.testing.shape;

public class Triangle implements Shape{
	
	double a,h;	

	public Triangle(double a, double h) {
		this.a = a;
		this.h = h;
	}
	
	public String getShapeName() {
		return "Triangle";
	}
		
	public double getField() {
		return 0.5 * a * h;
	}

}
