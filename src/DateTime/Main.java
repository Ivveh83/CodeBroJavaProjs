package DateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        //LocalDateTime
        LocalDate dateToday = LocalDate.now();
        System.out.println(dateToday);

        LocalTime timeNow = LocalTime.now();
        System.out.println(timeNow);

        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println(dateTimeNow);

        //Custom LocalDateTime
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String newDateTime = dateTimeNow.format(formatter);
        System.out.println(newDateTime);

        //Custom DateTime Object
        LocalDate christmasEve = LocalDate.of(2024, 12, 24);
        System.out.println(christmasEve);

        LocalDateTime donaldDuckTime = LocalDateTime.of(2024, 12, 24, 15, 0, 0);
        System.out.println(donaldDuckTime);

        // Compare DateTimes

        LocalDateTime dateTime1 = LocalDateTime.of(2025, 12, 24, 15, 0, 0);
        LocalDateTime dateTime2 = LocalDateTime.of(2025, 12, 24, 15, 0, 0);
        System.out.println(dateTime1);
        System.out.println(dateTime2);
        if (dateTime1.isBefore(dateTime2)){
            System.out.println(dateTime1 + " is earlier than " + dateTime2);
        } else if (dateTime1.isAfter(dateTime2)) {
            System.out.println( dateTime1 + " is later than " + dateTime2);
        }else if (dateTime1.isEqual(dateTime2)){
            System.out.println(dateTime1 + " is equal to " + dateTime2);
        }

        //UTC-Timestamp
        Instant instant = Instant.now();
        System.out.println(instant);
    }
}
