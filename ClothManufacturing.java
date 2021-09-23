package com.xworkz.oops;

public class ClothManufacturing {
	
	public static void main(String[] args) {
		Cloth adidas = new Cloth();
		adidas.brand = "adidas";
		adidas.size = "medium";
		adidas.type = "shirt";
		adidas.price = 500;
		
		System.out.println(adidas.brand);
		System.out.println(adidas.size);
		System.out.println(adidas.type);
		System.out.println(adidas.price);
		adidas.wear();
		
		Cloth adidasNew = new Cloth();
		adidasNew.brand = "adidas";
		adidasNew.size = "small";
		adidasNew.type = "tshirt";
		adidasNew.price = 400;
		
		System.out.println(adidasNew.brand);
		System.out.println(adidasNew.size);
		System.out.println(adidasNew.type);
		System.out.println(adidasNew.price);
		adidasNew.wear();
	}

}
