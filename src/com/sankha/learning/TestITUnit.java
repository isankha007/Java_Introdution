package com.sankha.learning;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestITUnit {
   String msg="Hello JUnit";
   JUnitTest junitTest= new JUnitTest("Other Data");//msg
   
   @Test
   public void TestPrintMsg() {
	   assertEquals(msg, junitTest.printMsg());
   }
   
}
