package annotations.custom;

@Important
public class Influencer implements Customer{

    //@Important - << @Target(ElementType.TYPE)!
    private int someInt;

    //@Important - << @Target(ElementType.TYPE)
    @Override
    public void leaveReview() {
        System.out.println("I will tell EVERYONE!");
    }
}
