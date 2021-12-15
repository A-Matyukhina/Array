package buyers;

public class SatisfiedCustomer implements Customer{
    @Override
    public void leaveReview() {
        System.out.println(toString());
    }
    @Override
    public String toString(){
        return "Review from SatisfiedCustomer: I have bought a wonderful product!" +
                " I love this shop! Everything is good! I recommend!";
    }
}
