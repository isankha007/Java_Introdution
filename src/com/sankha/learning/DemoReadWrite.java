package com.sankha.learning;
import java.util.*;

public class DemoReadWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		Scanner srtInp = new Scanner(System.in);
		s1 =  srtInp.next();
		s2 =  srtInp.next();
        if(s1.equals(s2)) {
        	System.out.println("Are Equal");
        }else {
        	System.out.println("Not Equal");
        }
        if(s1==s2) {
        	System.out.println("objects Are Equal");
        }else {
        	System.out.println("objects Not Equal");
        }
	}

}
