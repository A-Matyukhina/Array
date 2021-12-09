package goods;
/*
4.
Продолжаем разрабатывать нашу программу.
Определить класс Товар. Телевизор - это тип Товара.
Определить второй тип Товара - холодильник.
В коллекции хранить телевизоры и холодильники.
Вывести на экран самый дешевый Товар.
 */
import java.util.ArrayList;
import java.util.List;

public class MinPriceModel {

    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(new TV("Samsung", 56980.0, 134.0));
        productList.add(new Fridge("Sharp", 123999.99, 180.0));
        productList.add(new TV("LG", 78400.0, 128.0));
        productList.add(new Fridge("LG", 99799.0, 189.2));

        double minPrice = productList.get(0).getPrice();
        String minModel = null;

        for (Product tmp : productList) {

            //tmp.getDiagonal(); <-- TODO добраться до диагонали для тех, кто на самом деле объекты ТВ

            if(tmp.getPrice() < minPrice){
                minPrice = tmp.getPrice();
            }
            minModel = tmp.getModel();
        }
        System.out.println("The cheapest product model: " + minModel + ", price " + minPrice);
    }
}