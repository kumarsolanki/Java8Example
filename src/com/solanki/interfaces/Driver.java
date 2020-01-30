package com.solanki.interfaces;

public class Driver  implements Iterface1, Interface2{

//	@Override
//	public String print() {
//		// TODO Auto-generated method stub
//		return " ";
//	}
//	

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return Iterface1.super.print();
	}
	
	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.print();
	}
}
