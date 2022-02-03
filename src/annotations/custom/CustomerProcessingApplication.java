package annotations.custom;

import java.util.List;

public class CustomerProcessingApplication {
    public static void main(String[] args) {
        List<Customer> customers = List.of(
          new SimpleCustomer(),
          new Influencer()
        );

        for (Customer c: customers) {
            boolean hasAnnotation = c.getClass().getAnnotation(Important.class) != null;
            if (hasAnnotation){
                System.out.println("\tAttention everyone!!");
            }
            c.leaveReview();
        }
    }
}
