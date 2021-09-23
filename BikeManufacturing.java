package com.xworkz.oops;

public class BikeManufacturing {

	public static void main(String[] args) {
		Bike activa = new Bike();
		activa.brand = "honda";
		activa.color = "blue";
		activa.model = 3;
		activa.price = 70000;
		
		System.out.println(activa.brand);
		System.out.println(activa.color);
		System.out.println(activa.model);
		System.out.println(activa.price);
		activa.ride();
		
		Bike activa_2 = new Bike();
		activa_2.brand = "honda";
		activa_2.color = "black";
		activa_2.model = 4;
		activa_2.price = 80000;
		
		System.out.println(activa_2.brand);
		System.out.println(activa_2.color);
		System.out.println(activa_2.model);
		System.out.println(activa_2.price);
		activa_2.ride();


	}

}
