package tv;

import java.util.*;

public class MaxPriceModel {

    /*
    3.
        Разрабатываем модуль для магазина электроники. Описать объект "Телевизор".
        У телевизора есть модель, диагональ экрана и цена.
        Несколько телевизоров разместить в коллекции.
        Найти в коллекции самый дорогой телевизор и вывести на экран его модель, цену.
     */

    public static void main(String[] args) {

        List<TV> tvs = new ArrayList<>();
        tvs.add(new TV("Samsung", 134.0, 78500.0));
        tvs.add(new TV("LG", 128.0, 64999.99));
        tvs.add(new TV("Philips", 134.0, 78500.0));
        tvs.add(new TV("Sharp", 128.0, 78500.0));

        double maxPrice = Double.MIN_VALUE;
//        String maxModel = null;
        for (TV tmp : tvs) {
            if (tmp.getPrice() > maxPrice) {
                maxPrice = tmp.getPrice();
            } else {
                continue;
            }
//            maxModel = tmp.getModel();
        }
        for (TV tmp : tvs) {
            if (tmp.getPrice() == maxPrice) {
                System.out.println("The model of the most expensive TV: " + tmp.getModel() + " price: " + tmp.getPrice());
            }
//        System.out.println("Model: " + maxModel + ", price " + maxPrice);

//        for (TV tmp : tvs) {
//            for (TV tmp2 : tvs) {
//                if (tmp.getPrice() == tmp2.getPrice()) {
//                    maxModel2 = tmp.getModel();
//                    if (maxModel2 != maxModel) {
//                        System.out.println("One more model with such price is: " + maxModel2);
//                    }
//                } else {
//                    break;
//                }
//            }
        }
    }
}
