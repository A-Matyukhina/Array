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
        List<Client> clients = new ArrayList<>();
        clients.add(new HappyClient());
        clients.add(new AngryClient());
        var someClient = new HappyClient();
        clients.add(someClient);

        for (Client c: clients) {
            c.leaveReview();
        }
    }


    public static void old(String[] args) {

        ArrayList<Customer> buyerList = new ArrayList<>();
        buyerList.add(new AngryCustomer());
        buyerList.add(new SatisfiedCustomer());
        buyerList.add(new UsualCustomer());

        for (Customer tmp : buyerList) {
            tmp.leaveReview();
        }

//        List<Buyers> testBuyers = buyerList;
    }
}
