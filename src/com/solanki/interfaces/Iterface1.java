package com.solanki.interfaces;

public interface Iterface1 {
	
//	public int print();
	default String print() {
		return "hello";
	}
	static String printString() {
		return "static Hello";
	}

}
