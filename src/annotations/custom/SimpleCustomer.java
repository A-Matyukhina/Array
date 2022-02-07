package annotations.custom;


public class SimpleCustomer implements Customer{

    @Override
    public void leaveReview() {
        System.out.println("Cool!");
    }
}
