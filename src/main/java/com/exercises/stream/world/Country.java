package com.exercises.stream.world;

import java.math.BigDecimal;

public final class Country {
	private final String countryName;
	private final BigDecimal peopleQuantity;
	
	public Country(final String countryName, final BigDecimal peopleQuantity) {
		this.countryName = countryName;
		this.peopleQuantity = peopleQuantity;
	}
	
	public BigDecimal getPeopleQuantity() {
		return peopleQuantity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((countryName == null) ? 0 : countryName.hashCode());
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
		Country other = (Country) obj;
		if (countryName == null) {
			if (other.countryName != null)
				return false;
		} else if (!countryName.equals(other.countryName))
			return false;
		return true;
	}	
}
	
