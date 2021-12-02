package tv;

import java.util.Comparator;

public class PriceComparator implements Comparator<TV> {

    @Override
    public int compare(TV o1, TV o2) {

        double price1 = o1.getPrice();
        double price2 = o2.getPrice();
        if(price1 > price2){
            return 1;
        }
        if(price1 < price2){
            return -1;
        }else {
            return 0;
        }
    }
}