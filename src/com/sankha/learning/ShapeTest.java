package com.sankha.learning;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.plaf.synth.SynthOptionPaneUI;

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
         String str="Sankhadeep";
         str.concat(" Chatterjee") ;
         System.out.println(str);
         str="Chatterjee";
         System.out.println(str);
         StringBuilder strb= new StringBuilder();
         strb.append("This is string Builder");
         System.out.println(strb+" Length:"+strb.length());
         strb.delete(5, 7);
         System.out.println(strb);
         strb.insert(5, "is");
         System.out.println(strb);
         strb.insert(5, true);
         System.out.println(strb);
         strb.replace(5, 9, "");
         System.out.println(strb);


         
	}

}
