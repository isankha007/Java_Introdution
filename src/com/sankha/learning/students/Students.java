package com.sankha.learning.students;

public class Students {
 int roll;
 String name;
 static String collegName;
 public static void changeName() {
	 collegName="TIH";
 }
public Students(int roll, String name) {
	super();
	this.roll = roll;
	this.name = name;
}
public void display() {
	System.out.println(roll+" "+name+" "+collegName);
}
}
