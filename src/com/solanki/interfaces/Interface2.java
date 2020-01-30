package com.solanki.interfaces;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public interface Interface2 {

//	public String print();
	default String print() {
		return "hello";
	}
	static String printString() {
		return "static Hello";
	}

}
