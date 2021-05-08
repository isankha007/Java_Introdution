package com.sankha.learning;

public class ThreadRunner implements Runnable {
    int i= 0;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("This is  count"+i++);
			if(i==57)break;
		}
		
	}

}
