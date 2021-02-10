package com.exercises.goodpatterns.challenges;

public class Product {
	private String name;
	private int quantity;
	public Product(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}
	public int getQuantity() {
		return quantity;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", quantity=" + quantity + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Product other = (Product) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}	
}