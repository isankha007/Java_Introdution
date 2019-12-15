package com.sankha.exception;
import java.io.*;


public class CheckedException {
       public void readItNow() {
    	  
		try {
			 RandomAccessFile raf = new RandomAccessFile("myfile.txt", "r");
			 byte b[]=new byte[1000];
	    	 raf.readFully(b,0,1000);
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			System.err.println("error"+e);
			e.printStackTrace();
		}
    	  
    	   
       }
       
       public void testCustomException() throws MyException{
    	      System.out.println("Calling the exception");
       }
       
       public void checkedExcpCalled() {
    	   PrintWriter pw = null;
		try {
			pw = new PrintWriter("Abttc.txt");
			pw.println("Hello Checked Exception");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("This is  checked catch");
			e.printStackTrace();
		}finally {
			pw.close();
		}
    	   
    	   
    	   
       }
}
