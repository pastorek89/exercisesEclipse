package com.exercises.goodpatterns.food2door;

import java.time.LocalDate;

public interface SupplyRepository {
	void createSupply(Supplier supplier, LocalDate date);
}
