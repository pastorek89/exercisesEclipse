package com.exercises.goodpatterns.food2door;

import java.time.LocalDate;

public class SupplyProcessService {
	private Supplier supplier;
	private InformationSupplierService informationSupplierService;
	private SupplyRepository supplyRepository;
	
	public SupplyProcessService(Supplier supplier, InformationSupplierService informationSupplierService,
			SupplyRepository supplyRepository) {
		this.supplier = supplier;
		this.informationSupplierService = informationSupplierService;
		this.supplyRepository = supplyRepository;
	}
	
	public void supply() {
		supplier.process();
		informationSupplierService.inform(supplier);
		supplyRepository.createSupply(supplier, LocalDate.of(2017, 02, 20));
	}
	
	
}
