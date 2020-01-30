package com.solanki.polymorphism;

public class Person {
	int pid;
	String pname;
	
	void printA() {
		System.out.println("Person class print A");
		printB();
	}

	void printB() {
		System.out.println("Person class print B");
	}
}
