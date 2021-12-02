package currenttime;

import java.time.LocalDateTime;

public class StaticNonstaticExample {

    public static void printTimeStatic() {
        System.out.println(LocalDateTime.now());
    }

    public void printTime() {
        System.out.println(LocalDateTime.now());
    }

}
