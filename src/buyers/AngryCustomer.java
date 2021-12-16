package buyers;

public class AngryCustomer implements Customer{

    @Override
    public void leaveReview() {
        System.out.println(toString());
    }
    @Override
    public String toString(){
        return "Review from AngryCustomer: This is worst shop I've ever seen! " +
                "The goods I received is broken and i can do nothing " +
                "to change it or get my money back!";
    }
}
