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

		color.setColor("GREEN");
		color.setNumber(111222);

		System.out.println("The current world Customer " + customer.getFirstname() + " " + customer.getLastname()
				+ " with id = " + customer.getId() + " and color = " + color.getColor() + " with color number = "
				+ color.getNumber() + " says HELLO!!");
	}
}
