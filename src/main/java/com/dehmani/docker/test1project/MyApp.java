package com.dehmani.docker.test1project;

/**
 * Hello world!
 *
 */
public class MyApp {
	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.setFirstname("Amir");
		customer.setLastname("Dehmani");
		customer.setGender("male");
		customer.setId(777);
		
		Color color = new Color();
		
		color.setColor("blue");

		System.out.println("Hello World from Customer " + customer.getFirstname() + " " + customer.getLastname()
				+ " with id = " + customer.getId() + " and color = " + color.getColor() + "!");
	}
}
