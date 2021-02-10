package com.exercises.testing.weather.stub;

import java.util.HashMap;

public class TemperaturesStub implements Temperatures {
	@Override
	public HashMap<Integer, Double> getTemperatures() {
		HashMap<Integer, Double> stubResult = new HashMap<Integer,Double>();
		//dummy data
		stubResult.put(1, 12.5);
		stubResult.put(2, 5.3);
		stubResult.put(3, 23.5);
		stubResult.put(4, 46.5);
		stubResult.put(5, 13.5);
		return stubResult;
	}
}
