package com.frankmoley.lil.learningspring.web;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    public static Date createDateFromDateString(String dateString) throws ParseException {
        Date date = null;
        if(null != dateString){
            date = DATE_FORMAT.parse(dateString);
        }else{
            date = new Date();
        }
        return date;
    }
}