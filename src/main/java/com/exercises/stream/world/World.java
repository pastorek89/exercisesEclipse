package com.exercises.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
	private final List<Continent> continentsInTheWorld = new ArrayList<>();
	
	public void addContinent(Continent continent) {
		continentsInTheWorld.add(continent);
	}
	
	public boolean removeContinent(Continent continent) {
		return continentsInTheWorld.remove(continent);
	}
	
	public BigDecimal getPeopleQuantity() {
		BigDecimal result = continentsInTheWorld.stream()
				.flatMap(continent -> continent.getCountriesOnContinent().stream())
				.map(Country::getPeopleQuantity)
				.reduce(BigDecimal.ZERO, (sum,actual) -> sum.add(actual));
		return result;
	}
}
