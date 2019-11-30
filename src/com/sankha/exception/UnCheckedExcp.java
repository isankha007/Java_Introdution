package com.sankha.exception;

public class UnCheckedExcp {
	
	int k;
	int[] arr;
	public UnCheckedExcp() {
		// TODO Auto-generated constructor stub
		k=0;
		arr= new int[10];
	}

   public void killItNow(int k) {
	   this.k=k;
	   int l=5/k;
	   System.out.println("L value"+l);
   }
   
   public void beyondBound(int m) {
	   arr[m]=10;
   }
}
