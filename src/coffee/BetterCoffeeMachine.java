package coffee;

import java.util.Random;

public class BetterCoffeeMachine {

    public void brewCoffee() throws InterruptedException {

        boolean hasBeans = hasIngredient("coffee beans");

        if (hasBeans) {
            actuallyBrewCoffee();
            shutDown();
        } else {
            boolean userAddedBeans = waitForAction("add beans to the coffee machine", 1);
            if (userAddedBeans) {
                actuallyBrewCoffee();
            } else {
                shutDown();
            }
        }
    }

    private boolean waitForAction(String actionText, int times) throws InterruptedException {
        System.out.println("Waiting for user to: " + actionText);
        Thread.sleep(1000);
        boolean actionHappened = false;
        for (int i = 0; i < times; i++) {
            if (new Random().nextBoolean()) {
                actionHappened = true;
            }
        }
        return actionHappened;
    }

    private boolean hasIngredient(String ingredient) throws InterruptedException {
        System.out.println("Checking if this is in place: " + ingredient);
        Thread.sleep(1000);
        boolean ok = new Random().nextBoolean();
        String output = ok ? ingredient + "is present" : ingredient + " is missing";
        System.out.println(output);
        return ok;
    }

    private void actuallyBrewCoffee() {
        System.out.println("All good, your coffee is ready");
    }

    public void shutDown() {
        System.out.println("Shutting down");
    }
}
