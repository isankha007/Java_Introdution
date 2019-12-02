package com.sankha.exception;

public class RunStackCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       doStuff();
       System.out.println("Main");
	}
	public static void doStuff() 
    { 
		doMoreStuff(); 
        System.out.println("Method fun"); 
    } 
    public static void doMoreStuff() 
    { 
        //System.out.println(10 / 0); 
        System.out.println("Method doMoreStuff"); 
    } 

}
