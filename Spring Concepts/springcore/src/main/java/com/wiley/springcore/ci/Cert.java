package com.wiley.springcore.ci;

public class Cert {
	public String name;

	@Override
	public String toString() {
		return "Cert [name=" + name + "]";
	}
	
	public Cert(String name) {
		super();
		this.name = name;
	}
}
