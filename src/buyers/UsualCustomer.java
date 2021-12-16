package buyers;

public class UsualCustomer implements Customer{
    @Override
    public void leaveReview() {
        System.out.println(toString());
    }
    @Override
    public String toString(){
        return "Review from UsualCustomer: Ok";
    }
}
