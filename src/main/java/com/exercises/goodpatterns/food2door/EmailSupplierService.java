package com.exercises.goodpatterns.food2door;

public class EmailSupplierService implements InformationSupplierService {

	@Override
	public void inform(Supplier supplier) {
		System.out.println("Contractor informed");		
	}
}
