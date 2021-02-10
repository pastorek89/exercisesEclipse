package com.exercises.testing.weather.mock;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.HashMap;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.exercises.testing.weather.stub.Temperatures;
import com.exercises.testing.weather.stub.WeatherForecast;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {
	@Mock
	 private Temperatures temperaturesMock;
	
	private HashMap<Integer,Double> prepareTestData() {		       
        HashMap<Integer,Double> temperaturesMap = new HashMap<Integer,Double>();
        temperaturesMap.put(0,4.0);
        temperaturesMap.put(1,5.5);
        temperaturesMap.put(2,3.0);
        temperaturesMap.put(2,3.0);
        temperaturesMap.put(2,3.0);
        temperaturesMap.put(2,3.0);
        temperaturesMap.put(3,4.0);
        temperaturesMap.put(4,3.5);
        return temperaturesMap;
	}
    @Test
    public void testCalculateForecastWithMock() {
    	//Given
    	HashMap<Integer,Double> temperaturesMap = prepareTestData();
    	when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();
        //Then
        assertEquals(5, quantityOfSensors);
    }    
    @Test
    public void testCalculateAverageTemperatureWithMock() {
    	//Given
     	HashMap<Integer,Double> temperaturesMap = prepareTestData();
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        double averageTemperature = weatherForecast.calculateAverageTemperature();
        //Then
        assertEquals(4.0,averageTemperature,0.01);
    }
}