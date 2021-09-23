package com.xworkz.oops;

public class OneplusManufacturing {

	public static void main(String[] args) {
		Mobile oneplus6 = new Mobile();
		oneplus6.brand = "oneplus";
		oneplus6.imeiNumber = 56789;
		oneplus6.internalStorage = 128;
		oneplus6.price = 35000;
		
		System.out.println(oneplus6.brand);
		System.out.println(oneplus6.imeiNumber);
		System.out.println(oneplus6.internalStorage);
		System.out.println(oneplus6.price);
		oneplus6.call();
		
		Mobile oneplus7 = new Mobile();
		oneplus7.brand = "oneplus";
		oneplus7.imeiNumber = 565432;
		oneplus7.internalStorage = 256;
		oneplus7.price = 45000;
		
		System.out.println(oneplus7.brand);
		System.out.println(oneplus7.imeiNumber);
		System.out.println(oneplus7.internalStorage);
		System.out.println(oneplus7.price);
		oneplus7.call();
		
		}
}
