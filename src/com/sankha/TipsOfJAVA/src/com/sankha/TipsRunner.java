package com.sankha;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.lang.System.out;

enum Season{
	WINTER,SUMMER,SPRING,FALL;
}

public class TipsRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		out.println("Imports");
		BigDecimal db=null;
		List<String> list=new ArrayList<>();
		Collections.sort(list,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.length(), o2.length());
			}
		});
		
		Season season= Season.SPRING;
		Season season2= Season.valueOf("WINTER");
		out.println(season2);
	}

}
