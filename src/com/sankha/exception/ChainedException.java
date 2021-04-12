package com.sankha.exception;

public class ChainedException {
	/// Concept GeeksforGeeks
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			NumberFormatException ex = new NumberFormatException("Exception");

			ex.initCause(new ArithmeticException(" The Actual exception"));

			// Throwing an exception with cause.
			throw ex;
		}

		catch (NumberFormatException e) {
			System.out.println(e);
			System.err.println("Error " + e);
			System.out.println(e.getCause());
		}

	}

}
