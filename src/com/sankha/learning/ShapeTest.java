package com.sankha.learning;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Shape t= new Triangle();
         t.draw();
         Shape r= new Circle();
         r.draw();
         
         try {
        	 int i =10/0;
			System.err.println(i);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.err.println("Error:"+ e.getMessage());
		}
	}

}
