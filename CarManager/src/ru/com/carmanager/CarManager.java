package ru.com.carmanager;

public class CarManager {

	public static void main(String[] args) {
		
		Car prius = new Car("Toyota Prius", 2008, 15000, 1200, Color.GREEN);

		Car laguna = new Car("Renault Laguna", 2000, 9700, 1600, Color.WHITE);
		
		Car laguna2 = new Car("Renault Laguna", 2000, 9700, 1600, Color.WHITE);

		System.out.println(prius);
		System.out.println(laguna);
		
		System.out.println(prius == laguna2); // false
		System.out.println(laguna == laguna2); // false
		// cause comparison by id
		
		System.out.println(prius.equals(laguna2)); 
		System.out.println(laguna.equals(laguna2));
		// No info about HOW make comparison?
		


	}

}
