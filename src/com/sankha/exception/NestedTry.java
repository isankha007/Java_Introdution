package com.sankha.exception;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
        {
            try
            {
                int b = 30 / 0;
                System.out.println(" nested try ,b is " + b);
            }
            catch (ArithmeticException arithmeticException)
            {
                arithmeticException.printStackTrace();
            }

            int a[] = new int[5];
            a[15] = 4;

            System.out.println(" ");
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
        }

        System.out.println("normal flow..");
    }

	

}
