package com.exercises.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
	Temperatures temperatures;
	double sumAllTemperatures = 0.0;
	int quantityOfSensors = 0;
	
	public WeatherForecast(Temperatures temperatures) {
		this.temperatures = temperatures;
	}
	
	public HashMap<Integer, Double> calculateForecast() {
		HashMap<Integer, Double> resultMap = new HashMap<Integer,Double>();
		for(Map.Entry<Integer, Double> temperature : temperatures.getTemperatures().entrySet()) {
			resultMap.put(temperature.getKey(), temperature.getValue() + 1);				
		}		
		return resultMap;		
	}
	
	public double calculateAverageTemperature() {		
		for(Map.Entry<Integer, Double> temperature : temperatures.getTemperatures().entrySet()) {
			sumAllTemperatures += temperature.getValue();
			quantityOfSensors++;
		}
		return sumAllTemperatures/quantityOfSensors;
	}
}
