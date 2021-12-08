package countDown;
/*
Сделать обратный отсчет (дни, часы, минуты и секунды) до конкретной даты какого-либо события.
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CountDown {
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
            System.out.println("До Нового Года осталось: " + days + " дней");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}