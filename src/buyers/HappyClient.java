package buyers;

public class HappyClient implements Client {

    @Override
    public void leaveReview() {
        System.out.println("I love this shop! Everything is good! I recommend!");
    }
}
