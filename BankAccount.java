package com.xworkz.oops;

public class BankAccount {
	String name;
	String place;
	long phNo;
	long aadharNo;
	String panNo;
	
	public BankAccount(String name,String place,long phNo,long aadharNo) {
		this.name=name;
		this.aadharNo=aadharNo;
		System.out.println("account opened succesfully with aadhar number");
		}
	
	public BankAccount(String name,String place,long phNo,String panNo) {
		this.name=name;
		this.panNo=panNo;
		System.out.println("account opened succesfully with pan number");
		}
	
	

}
