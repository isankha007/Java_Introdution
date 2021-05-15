package com.sankha.learning;

public class JUnitTest {
    private String message;

	public JUnitTest(String message) {
		super();
		this.message = message;
	}
	public String printMsg() {
	 System.out.println(message);	
	 return message;
	}
    
}
