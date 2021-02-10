package com.exercises.goodpatterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop implements Supplier {
	List<String> invitations = new ArrayList<String>();
	@Override
	public void process() {
			System.out.println("Gluten Free Shop invites you to local party!");
			invitations.add("Blabla");
	}
}
