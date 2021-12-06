package buyers;

import java.util.ArrayList;
import java.util.List;
/*
6.
Определить интерфейс Покупатель с методом оставитьОтзыв()
Типы покупателей, реализующие интерфейс: Злой покупатель, Довольный покупатель, Обычный покупатель.
Положить несколько разных покупателей в коллекцию покупателей.
Опросить всех по очереди и получить разные отзывы.
 */
public class ReviewsPage {
    public static void main(String[] args) {

        Buyer angryBuyer = new Buyer("This is worst shop I've ever seen! " +
                "The goods I received is broken and i can do nothing " +
                "to change it or get my money back! ");
        Buyer satisfiedBuyer = new Buyer("I have bought a wonderful product!" +
                " I love this shop! Everything is good! I recommended!");
        Buyer usualBuyer = new Buyer("Normal");

        ArrayList<Buyer> buyerList = new ArrayList<>();
        buyerList.add(angryBuyer);
        buyerList.add(satisfiedBuyer);
        buyerList.add(usualBuyer);

        List<?extends Buyers> buyers = buyerList;
        for(Buyers tmp : buyers){
            tmp.leaveReview();
        }
    }
}
