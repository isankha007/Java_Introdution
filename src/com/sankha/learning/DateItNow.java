package com.sankha.learning;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.time.format.DateTimeFormatter;
import java.time.ZonedDateTime;


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
        LocalDateTime localDatetime= LocalDateTime.now();
        LocalDateTime timeszone=LocalDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println(timeszone+"   Time "+localDatetime);
        Period p=Period.between(localDateToday,LocalDate.of(2019, 02, 07) );
        System.out.println(p);
        DateTimeFormatter DtTimeFr=DateTimeFormatter.ofPattern("YYYY-MM-DD");
        ZonedDateTime znDT=ZonedDateTime.now(); 
        System.out.println(DtTimeFr.format(znDT));
	}

}
