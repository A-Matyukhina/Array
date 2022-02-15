package coffee;

public class StartCoffeeDrink {
    public static void main(String[] args) throws InterruptedException {
//        CoffeeMachine machine = new CoffeeMachine();
//        machine.prepareDrink();

        BetterCoffeeMachine bcm = new BetterCoffeeMachine();
        bcm.brewCoffee();
    }
}
