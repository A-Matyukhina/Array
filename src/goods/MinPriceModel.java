package goods;

import java.util.ArrayList;
import java.util.List;

public class MinPriceModel {

    public static void main(String[] args) {

        List<Goods> goodsList = new ArrayList<>();
        goodsList.add(new TV("Samsung", 56980.0, 134.0));
        goodsList.add(new Fridge("Sharp", 123999.99, 180.0));
        goodsList.add(new TV("LG", 78400.0, 128.0));
        goodsList.add(new Fridge("LG", 99799.0, 189.2));

        double minPrice = goodsList.get(0).getPrice();
        String minModel = null;
        for (Goods tmp : goodsList) {
            if(tmp.getPrice() < minPrice){
                minPrice = tmp.getPrice();
            }
            minModel = tmp.getModel();
        }
        System.out.println("The cheapest product model: " + minModel + ", price " + minPrice);
    }
}