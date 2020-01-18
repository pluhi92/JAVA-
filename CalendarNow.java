package com.zetcode;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarNow {


    public static void main(String[] args) {

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        System.out.println(dateFormat.format(cal.getTime()));
    }
}

//////////////////////////////////////////////////////////////////////////////////////////

package com.zetcode;

import java.time.Instant;
import java.time.LocalDate;


public class CalendarNow2 {


    public static void main(String[] args) {

        var now = Instant.now();
        System.out.println(now);

        var nov2 = LocalDate.now();
        System.out.println(nov2);
    }
}
