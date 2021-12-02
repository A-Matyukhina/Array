package currenttime;

import static java.time.LocalTime.now;

/*
        2.1
        Создать класс и в нём статический метод, который выводит на экран текущую дату и время
        Вызвать из main()

        2.2
        Изменить решение так, чтобы метод был не статическим. (Предыдущее решение сохранить)
 */

public class Main {

    public static void main(String[] args) {
        CurrentTime currentTime = new CurrentTime();
        System.out.println("Current date & time is - " + currentTime.now());

        // ----

        StaticNonstaticExample myTimer = new StaticNonstaticExample();
        myTimer.printTime();

        StaticNonstaticExample.printTimeStatic();
        someStaticMethod();
//        Main.someStaticMethod();

    }

    private static void someStaticMethod() {
        System.out.println("some method");
    }
}
