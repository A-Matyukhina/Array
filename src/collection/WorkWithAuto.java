package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WorkWithAuto {
    public static void main(String[] args) {
        createCollection2();
    }

    public static void createCollection() {
//        1. Создать коллекцию авто
//        2. Попросить у пользователя имя авто
//        3. Проверить ввел ли пользователь "стоп"
//        4.1. Если да, то распечатать коллекцию
//        4.2. Если нет, то ввести цену.
//        5. Создаем объект.
//        6. Положить объект в коллекцию.
//        7. Вернуться к шагу 2.
        List<Auto> autoList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a car name please: ");
        String name = sc.next();
        boolean stop = name.equalsIgnoreCase("stop");
        if (stop) {
            for (Auto tmp : autoList) {
                System.out.println(tmp.getName());
            }
        } else {
            System.out.println("Enter a car price please: ");
            int price = sc.nextInt();
            Auto auto = new Auto(name, price);
            autoList.add(auto);
        }
    }

    public static void createCollection2() {
/*
1. Создать коллекцию авто
2. Попросить у пользователя ввести марку авто.
3. Проверить не ввел ли пользователь слово "стоп".
4.1. Если да, то распечатать коллекцию
4.2. Если нет, то ввести цену.
5. Создаем объект.
6. Положить объект в коллекцию.
7. Вернуться к шагу 2.
 */
        Scanner sc = new Scanner(System.in);
        List<Auto> autos = new ArrayList<>();
        for (; ; ) {
            System.out.println("Enter car name: ");
            String name = sc.next();
            boolean stop = name.equalsIgnoreCase("stop");
            if (stop) {
                for (Auto tmp : autos) {
                    System.out.println(tmp.getName());
                }
                break;
            } else {
                System.out.println("Enter car price: ");
                int price = sc.nextInt();
                Auto auto = new Auto(name, price);
                autos.add(auto);
            }
        }
    }
}
