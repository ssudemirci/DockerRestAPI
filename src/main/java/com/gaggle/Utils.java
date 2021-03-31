package com.gaggle;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class Utils {




    public static String iSO_CurrentTime(){
        Date date = new Date(System.currentTimeMillis());

        SimpleDateFormat sdf;
        sdf = new SimpleDateFormat("HH:mm:ss");
        sdf.setTimeZone(TimeZone.getDefault());
        String iSO8601_time = sdf.format(date);


        return iSO8601_time;
    }




}
