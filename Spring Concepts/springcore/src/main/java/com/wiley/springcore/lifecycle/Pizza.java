package com.wiley.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Pizza {
	private double price;

	public Pizza() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pizza(double price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pizza [price=" + price + "]";
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	@PostConstruct
	public void init() {
		System.out.println("Inside the init method");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Inside the destroy method");
	}
}
