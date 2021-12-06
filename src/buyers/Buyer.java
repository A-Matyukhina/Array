package buyers;

public class Buyer implements Buyers {

    private String review;

    public Buyer(String review) {
        setReview(review);
    }

    public String getReview() {
        return review;
    }

    public void setReview(String newReview) {
        review = newReview;
    }

    public Buyer() {
    }

    @Override
    public void leaveReview() {
        System.out.println(getReview());
    }
}
