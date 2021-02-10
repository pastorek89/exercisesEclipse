package com.exercises.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
	private List<Shape> shapes = new ArrayList<>();
	
	public void addFigure(Shape shape) {
		shapes.add(shape);
	}
	
	public boolean deleteFigure(Shape shape) {
		if(shapes.contains(shape)) {
			shapes.remove(shape);
			return true;
		}
		return false;
	}
	
	public Shape getFigure(int index) {
		return shapes.get(index);
	}
	
	public void showFigures() {
		for(Shape figure : shapes) {			
			System.out.println(figure.getShapeName());
		}		
	}
	public List<Shape> getShapes() {
		return shapes;
	}
	
}
