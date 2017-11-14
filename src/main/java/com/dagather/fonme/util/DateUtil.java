package com.dagather.fonme.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateUtil {
    public static SimpleDateFormat sdf_YYYY_MM_dd_HH_mi_ss = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static SimpleDateFormat sdf_YYYYMMdd = new SimpleDateFormat("yyyyMMdd");

    public static void main(String[] args) {
        Date d = getMonthEndDate(new Date());
        System.out.println(sdf_YYYY_MM_dd_HH_mi_ss.format(d));
    }

    public static Date getMonthStartDate(Date d) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal = to000000(cal);
        return cal.getTime();
    }

    public static Date getMonthEndDate(Date d) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.set(Calendar.MONTH, cal.get(Calendar.MONTH) + 1);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.DAY_OF_MONTH, cal.get(Calendar.DAY_OF_MONTH) - 1);
        cal = to235959(cal);
        return cal.getTime();
    }

    public static Date getYestaday000000(Date d) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.set(Calendar.DAY_OF_MONTH, cal.get(Calendar.DAY_OF_MONTH) - 1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

    public static Date getYestaday235959(Date d) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.set(Calendar.DAY_OF_MONTH, cal.get(Calendar.DAY_OF_MONTH) - 1);
        cal = to235959(cal);
        return cal.getTime();
    }

    public static Calendar to235959(Calendar cal) {
        if (cal == null) {
            return null;
        }
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        cal.set(Calendar.MILLISECOND, 999);
        return cal;
    }

    public static Date to235959(Date d) {
        if (d == null) {
            return null;
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal = to235959(cal);
        return cal.getTime();
    }

    public static Calendar to000000(Calendar cal) {
        if (cal == null) {
            return null;
        }
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal;
    }

    public static Date to000000(Date d) {
        if (d == null) {
            return null;
        }
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal = to000000(cal);
        return cal.getTime();
    }

}
