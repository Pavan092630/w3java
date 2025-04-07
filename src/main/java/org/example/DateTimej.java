package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimej {
    public static void main(String[] args) {
        LocalDate myobj = LocalDate.now();
        System.out.println(myobj);
        LocalTime myobj1 = LocalTime.now();
        System.out.println(myobj1);
        LocalDateTime myobj2 = LocalDateTime.now();
        System.out.println(myobj2);
        DateTimeFormatter myobj3 = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        System.out.println(myobj2.format(myobj3));
    }
}
/*Java Dates
Java does not have a built-in Date class, but we can import the java.time package to work with the date and time API.
The package includes many date and time classes. For example:
LocalDate	Represents a date (year, month, day (yyyy-MM-dd))
LocalTime	Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
LocalDateTime	Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
DateTimeFormatter	Formatter for displaying and parsing date-time objects*/