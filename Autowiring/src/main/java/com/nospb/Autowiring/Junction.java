package com.nospb.Autowiring;

public class Junction {
	
	
	private Bus bus;
	
	public Junction() {
		System.out.println("this is main bus junction ");
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}
	
	public void ready() {
		System.out.println("it is working");
		bus.type();
	}
}
