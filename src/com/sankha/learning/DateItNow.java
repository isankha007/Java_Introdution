package com.sankha.learning;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import sun.util.resources.LocaleData;

public class DateItNow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        long mills= System.currentTimeMillis();
        Date dt= new Date(mills);
        System.out.println(dt);
        SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy hh:mm");
        String dtStr= formatter.format(dt);
        System.out.println(dtStr);
        Calendar calendar = new GregorianCalendar();
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);
        LocalDate localDateToday = LocalDate.now();
        System.out.println(localDateToday);

	}

}
