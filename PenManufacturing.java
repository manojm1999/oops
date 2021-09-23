package com.xworkz.oops;

public class PenManufacturing {

	public static void main(String[] args) {
		Pen flair = new Pen();
		flair.brand = "cello";
		flair.color = "blue";
		flair.price = 20;
		
		System.out.println(flair.brand);
		System.out.println(flair.color);
		System.out.println(flair.price);
		flair.write();
		
		Pen flairWritoMeter = new Pen();
		flairWritoMeter.brand = "cello";
		flairWritoMeter.color = "black";
		flairWritoMeter.price = 25;
		
		System.out.println(flairWritoMeter.brand);
		System.out.println(flairWritoMeter.color);
		System.out.println(flairWritoMeter.price);
		flairWritoMeter.write();


	}

}
