package com.sankha;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class ValidException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ValidException(String errorMessage) {
		super(errorMessage);
	}
} 

public class CustomExceptionDemo {
	
	static void validate(int age) throws ValidException {
		if(age<18) {
			throw new ValidException("Age must be 18 or above");
		}else {
			System.out.println("Good to go");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName="abc.text";
		try (Scanner file = new Scanner(new File(fileName))) {
		    if (file.hasNextLine()) System.out.println(file.nextLine());
		} catch(FileNotFoundException e) {
			
		    // Logging, etc 
			System.err.println(e);
		}
		
		
		try {
			validate(17);
		} catch (ValidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println(e);
		}
		
		System.out.println("End ...");


	}

}
