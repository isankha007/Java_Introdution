package com.sankha.learning;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Date;

public class SerealizationTest {
	
	public SerealizationTest() {
		// TODO Auto-generated constructor stub
		Date d=new Date();
		try {
			FileOutputStream f = new FileOutputStream("date.ser");
			ObjectOutputStream os = new ObjectOutputStream(f);
			os.writeObject(d);
			os.close();
			
		} catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new SerealizationTest();
	}

}
