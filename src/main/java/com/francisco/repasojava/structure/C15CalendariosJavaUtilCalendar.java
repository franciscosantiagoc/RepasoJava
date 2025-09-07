package com.francisco.repasojava.structure;

import java.util.Calendar;
import java.util.Date;

public class C15CalendariosJavaUtilCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        //calendar.set(2025, 9, 7, 15, 20);
        //calendar.set(2025, Calendar.SEPTEMBER, 7, 15, 20);
        calendar.set(Calendar.YEAR, 2025);
        calendar.set(Calendar.MONTH, Calendar.SEPTEMBER);
        calendar.set(Calendar.DAY_OF_MONTH, 7);
        //calendar.set(Calendar.HOUR_OF_DAY, 15);//24hrs
        calendar.set(Calendar.HOUR, 10);//24hrs
        calendar.set(Calendar.MINUTE, 20);
        calendar.set(Calendar.AM_PM, Calendar.PM);


        Date fecha = calendar.getTime();

        System.out.println("fecha: " + fecha);
    }
}
