package com.solanki.polymorphism;

public class Employye extends Person{
//	int pid;
//	String pname;
	
//	void printA() {
//		System.out.println("Employee class print A");
//	}

	void printB() {
		System.out.println("Employee class print B");
	}

	public static void main(String[] args) {
		Employye employye = new Employye();
//		employye.printA();
//		employye.printB();
		Person person = new Employye();
		person.printA();
	}
}
