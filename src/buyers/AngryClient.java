package buyers;

public class AngryClient implements Client {

    @Override
    public void leaveReview() {
        System.out.println("This is the worst shop I've ever seen!");
    }
}
