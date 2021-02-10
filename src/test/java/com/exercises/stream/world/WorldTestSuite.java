package com.exercises.stream.world;

import java.math.BigDecimal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WorldTestSuite {

	@Test
	public void testGetPeopleQuantity() {
		//Given
		World world = new World();
		
		Continent africa = new Continent("Africa");
		Continent asia = new Continent("Asia");
		Continent europe = new Continent("Europe");
		
		africa.addCountry(new Country("Zambia", new BigDecimal("9876543")));
		africa.addCountry(new Country("Ghana", new BigDecimal("9876543")));
		africa.addCountry(new Country("Egypt", new BigDecimal("9876543")));
		africa.addCountry(new Country("Zair", new BigDecimal("9876543")));
		africa.addCountry(new Country("Tunesia", new BigDecimal("9876543")));
		
		asia.addCountry(new Country("China", new BigDecimal("65432")));
		asia.addCountry(new Country("Japan", new BigDecimal("65432")));
		asia.addCountry(new Country("Mongolia", new BigDecimal("65432")));
		asia.addCountry(new Country("South Korea", new BigDecimal("65432")));
		
		europe.addCountry(new Country("Poland", new BigDecimal("40000000")));
		
		world.addContinent(europe);
		world.addContinent(asia);
		world.addContinent(africa);
		//When
		BigDecimal totalPeopleQuantity = world.getPeopleQuantity();
		//Then
		Assertions.assertEquals(new BigDecimal("89644443"), totalPeopleQuantity);
		
	}
}
