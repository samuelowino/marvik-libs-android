package com.marvik.libs.android.utils.date;


import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CalendarUtils {
    public static String getMonth(int monthOfYear) {
        switch (monthOfYear) {
            case 1:
                return "January";

            case 2:
                return "February";

            case 3:
                return "March";

            case 4:
                return "April";

            case 5:
                return "May";

            case 6:
                return "June";

            case 7:
                return "July";

            case 8:
                return "August";

            case 9:
                return "September";

            case 10:
                return "October";

            case 11:
                return "November";

            case 12:
                return "December";

            default:
                return "Invalid";
        }
    }
    /**
     * Get the time in milliseconds of this time
     *
     * @param pattern date format
     * @param time    time to convert
     * @return timeInMillis
     */
    public static long parseTime(String pattern, String time) {
        try {
            return new SimpleDateFormat(pattern).parse(time).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
