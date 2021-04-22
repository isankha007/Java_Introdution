package com.sankha.learning;
import java.util.*;

import com.sankha.learning.students.Students;

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
        Students st1= new Students(12, "Sankha");
        Students st2= new Students(3, "Pranabes");
        Students st3= new Students(1, "Naba");
        Students st4= new Students(10, "Nakul");
        Students.changeName();
        st1.display();
        st2.display();
        st3.display();
        st4.display();


        
	}

}
