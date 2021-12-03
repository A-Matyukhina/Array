package currenttime;

public class Main {

    public static void main(String[] args) {
        /*
        2.1
        Создать класс и в нём статический метод, который выводит на экран текущую дату и время
        Вызвать из main()
        */
        StaticNonstaticExample.printTimeStatic();

        /*
        2.2
        Изменить решение так, чтобы метод был не статическим. (Предыдущее решение сохранить)
         */
        StaticNonstaticExample myTimer = new StaticNonstaticExample();
        myTimer.printTime();
    }
}
