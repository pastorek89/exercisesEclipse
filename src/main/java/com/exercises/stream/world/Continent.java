package com.exercises.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
	private final String continentName;
	private final List<Country> countriesOnContinent = new ArrayList<>();
	
	public Continent(final String continentName) {
		this.continentName = continentName;
	}	
	
	public String getContinentName() {
		return continentName;
	}

	public List<Country> getCountriesOnContinent() {
		return new ArrayList<Country>(countriesOnContinent);
	}

	public void addCountry(Country country) {
		countriesOnContinent.add(country);
	}
	
	public boolean removeCountry(Country country) {
		return countriesOnContinent.remove(country);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((continentName == null) ? 0 : continentName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Continent other = (Continent) obj;
		if (continentName == null) {
			if (other.continentName != null)
				return false;
		} else if (!continentName.equals(other.continentName))
			return false;
		return true;
	}	
}
