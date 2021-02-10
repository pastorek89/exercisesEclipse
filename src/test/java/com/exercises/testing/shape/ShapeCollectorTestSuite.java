package com.exercises.testing.shape;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ShapeCollectorTestSuite {
	@BeforeClass
	public static void before() {
		System.out.println("Test Case Shape: begin");
	}
	@AfterClass
	public static void after() {
		System.out.println("Test Case Shape: after");
	}
	@Test
	public void testAddFigure() {
		//Given
		Shape circle = new Circle(2.0);		
		ShapeCollector shape = new ShapeCollector();	
		//When
		shape.addFigure(circle);
		//Then
		Assert.assertEquals(1,shape.getShapes().size());		
	}
	@Test
	public void testDeleteFigure() {
		//Given
		Shape triangle = new Triangle(2.0,3.0);
		Shape circle = new Circle(2.0);
		List<Shape> shapes = new ArrayList<>();
		shapes.add(circle);
		shapes.add(triangle);
		//When
		boolean result = shapes.remove(circle);
		//Then
		Assert.assertTrue(result);
		Assert.assertEquals(1,shapes.size());	
	}
	@Test
    public void testGetFigure() {
        //Given
        Shape shape = new Triangle(1, 4.5);
        List<Shape> shapes = new ArrayList<>();
        shapes.add(shape);
        //When
        Shape result = shapes.get(0);
        //Then
        Assert.assertEquals(shape, result);
    }
    @Test
    public void testShowFigures() {
        //Given
        Shape shape = new Triangle(1, 4.5);
        List<Shape> shapes = new ArrayList<>();
        shapes.add(shape);
        //When
        String tester = shape.getShapeName();
        //Then
        Assert.assertEquals("Triangle",tester);

    }
}
