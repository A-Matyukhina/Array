package countDown;
/*
Сделать обратный отсчет (дни, часы, минуты и секунды) до конкретной даты какого-либо события.
 */

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;

public class CountDown {

    private static final int DAYS = 1000 * 60 * 60 * 24;
    private static final int HOURS = 1000 * 60 * 60;
    private static final int MINUTES = 1000 * 60;
    private static final int SECONDS = 1000;


    public static void main(String[] args) {
        showHowDaysTillNewYear();
    }

    public static void showHowDaysTillNewYear() {
        Date lastDay = new Date();
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        String lastD = "01-01-2022";
        int days = 0;
        try {
            lastDay = df.parse(lastD); // parsing from string
            Date today = new Date();
            long diff = lastDay.getTime() - today.getTime();
            days = (int) (diff / (24 * 60 * 60 * 1000)); //from milliseconds to days
            long afterDay = diff - ((long) days * 24 * 60 * 60 * 1000);  // afterDay = diff % days;
            int hours = (int) afterDay / (60 * 60 * 1000);
            long afterHour = (afterDay - (long) hours * 60 * 60 * 1000);
            int minutes = (int) afterHour / (60 * 1000);
            System.out.println("There are " + days + " days " + hours + " hours " + minutes + " minutes left till the New Year");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void calculateByDmitry() {
        LocalDateTime newYear = LocalDateTime.of(
                LocalDate.of(2022, 1, 1),
                LocalTime.MIDNIGHT
        );
        LocalDateTime today = LocalDateTime.now();

        ZonedDateTime zonedNewYear = ZonedDateTime.of(newYear, ZoneId.systemDefault());
        ZonedDateTime zonedToday = ZonedDateTime.of(today, ZoneId.systemDefault());

        long newYorkMillis = zonedNewYear.toInstant().toEpochMilli();
        long todayMillis = zonedToday.toInstant().toEpochMilli();
        long absoluteDiffInMillis = newYorkMillis - todayMillis;

        long days = absoluteDiffInMillis / DAYS;
        long hours = absoluteDiffInMillis % DAYS / HOURS;
        long minutes = absoluteDiffInMillis % DAYS % HOURS / MINUTES;
        long seconds = absoluteDiffInMillis % DAYS % HOURS % MINUTES / SECONDS;
        System.out.println(days + " days, " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
    }
}