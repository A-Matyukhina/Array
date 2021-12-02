package tv;

import java.util.*;

public class Main {

    /*
    3.
        Разрабатываем модуль для магазина электроники. Описать объект "Телевизор".
        У телевизора есть модель, диагональ экрана и цена.
        Несколько телевизоров разместить в коллекции.
        Найти в коллекции самый дорогой телевизор и вывести на экран его модель, цену.
     */

    public static void main(String[] args) {

        Set<TV> tvCollection = new HashSet<>();
        tvCollection.add(new TV("Samsung", 134.0, 78500.0));
        tvCollection.add(new TV("LG", 128.0, 64999.99));
        tvCollection.add(new TV("Philips", 134.0, 59900.0));
        tvCollection.add(new TV("Sharp", 128.0, 78500.0));

        double max = 0;
        String maxModel = null;
        for (TV tmp : tvCollection) {
            tmp = Collections.max(tvCollection, new PriceComparator());
            max = tmp.getPrice();
            maxModel = tmp.getModel();
        }
        System.out.println("Model: " + maxModel + ", price " + max);

        // ---------------------------

        double maxPrice = Double.MIN_VALUE;
        for (TV tmp : tvCollection) {
            if (tmp.getPrice() > maxPrice)
                maxPrice = tmp.getPrice();
        }
        System.out.println(maxPrice);

    }
}