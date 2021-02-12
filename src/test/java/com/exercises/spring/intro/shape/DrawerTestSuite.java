package com.exercises.spring.intro.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DrawerTestSuite {

	@Test
	public void testDoDrawingWithCircle() {
		//Given
		Shape circle = new Circle();
		Drawer drawer = new Drawer(circle);
		//When
		String actual = drawer.doDrawing();
		//Then
		Assertions.assertEquals("This is a circle", actual);
	}
	
	@Test
	public void testDoDrawingWithTriangle() {
		//Given
		Shape triangle = new Triangle();
		Drawer drawer = new Drawer(triangle);
		//When
		String actual = drawer.doDrawing();
		//Then
		Assertions.assertEquals("This is a triangle", actual);
	}
}
