package com.xworkz.oops;

public class BookManufacturing {

	public static void main(String[] args) {
		Book chandras = new Book();
		chandras.brand = "chandras";
		chandras.type = "ruled";
		chandras.price = 40;
		chandras.size = "small";
		
		System.out.println(chandras.brand);
		System.out.println(chandras.type);
		System.out.println(chandras.price);
		System.out.println(chandras.size);
		chandras.write();
		
		Book chandrasSpectrum = new Book();
		chandrasSpectrum.brand = "chandras";
		chandrasSpectrum.type = "unruled";
		chandrasSpectrum.price = 50;
		chandrasSpectrum.size = "large";
		
		System.out.println(chandrasSpectrum.brand);
		System.out.println(chandrasSpectrum.type);
		System.out.println(chandrasSpectrum.price);
		System.out.println(chandrasSpectrum.size);
		chandrasSpectrum.write();
		
		

	}

}
