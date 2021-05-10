package com.sankha.learning;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.util.Date;

public class DeserializationTest {
	public DeserializationTest() {
		// TODO Auto-generated constructor stub
		Date d=null;
		try {
			FileInputStream f = new FileInputStream("date.ser");
			ObjectInputStream os = new ObjectInputStream(f);
			d=(Date)os.readObject();
			os.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			}
		System.out.println("Date "+d);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new DeserializationTest();
	}

}
