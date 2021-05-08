package com.sankha.learning;

public class HelloThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadRunner tr = new ThreadRunner();
		Thread t=new Thread(tr);
		t.start();

	}

}
