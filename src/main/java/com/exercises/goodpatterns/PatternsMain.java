package com.exercises.goodpatterns;

import com.exercises.goodpatterns.challenges.EmailService;
import com.exercises.goodpatterns.challenges.GoldClientBorekOrderService;
import com.exercises.goodpatterns.challenges.OrderRequest;
import com.exercises.goodpatterns.challenges.OrderRequestRetriever;
import com.exercises.goodpatterns.challenges.ProductOrderDto;
import com.exercises.goodpatterns.challenges.ProductOrderService;
import com.exercises.goodpatterns.challenges.RepoToDatabase;
import com.exercises.goodpatterns.food2door.DatabaseRepository;
import com.exercises.goodpatterns.food2door.EmailSupplierService;
import com.exercises.goodpatterns.food2door.ExtraFoodShop;
import com.exercises.goodpatterns.food2door.SupplyProcessService;

public class PatternsMain {

	public static void main(String[] args) {
		/*MovieStore movieStore = new MovieStore();
		movieStore.getMovies().entrySet().stream()
				.flatMap(map -> map.getValue().stream())
				.map(n -> n + "!")
				.forEach(System.out::print);	*/
		
		OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
		OrderRequest order = orderRequestRetriever.retrieve();
		
		ProductOrderService orderService = new ProductOrderService(new EmailService(), 
								new GoldClientBorekOrderService(), new RepoToDatabase());
		ProductOrderDto productOrderDto = orderService.processOrder(order);
		System.out.println(productOrderDto);	
		
		SupplyProcessService supplyProcessService = new SupplyProcessService(new ExtraFoodShop(), 
								new EmailSupplierService(), new DatabaseRepository());
		
		supplyProcessService.supply();
	}
}
