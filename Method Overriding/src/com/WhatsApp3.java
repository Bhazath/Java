package com;

public class WhatsApp3 extends WhatsApp2 { 
	
	@Override
	void display() {
		super.display();
		System.out.println("Blue Ticks Supported");
	}
	
	void call() {
		super.call();
		System.out.println("Vido Call Supported");
	}
	
	void story() {
		System.out.println("Can Upload Images as Story");
	}
}
