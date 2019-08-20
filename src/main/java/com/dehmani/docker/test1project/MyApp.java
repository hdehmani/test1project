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
		customer.setId(999);

		System.out.println("Hello World from Customer " + customer.getFirstname() + " " + customer.getLastname()
				+ " with id = " + customer.getId() + "!");
	}
}
