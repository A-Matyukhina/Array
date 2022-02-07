package coffee;

import java.util.Random;
import java.util.Scanner;

public class CoffeeMachine {
/*
Берем алгоритм приготовления кофе, везде выводим на консоль название шага,
если надо принять решение - везде, где вопрос - случайно,
с вер. 50% его принимаем во время выполнения (в авт. режиме)

Thread.sleep(1000);
 */
    public boolean water;
    public boolean coffeeBean;
    public boolean milk;
    public boolean drink = false;
    boolean on = false;
    Random r = new Random();
    Scanner sc = new Scanner(System.in);

    public void turnOnCoffeeMachine() {
        System.out.println("Press 'yes' to turn on the machine");
        if (sc.next().equalsIgnoreCase("yes")) {
            on = true;
        }
    }

    public void prepareDrink() throws InterruptedException {
        while (drink == false) {
            if (r.nextInt(2) + 1 == 1) {
                System.out.println("Your coffee is making");
                drink = true;
                for (int i = 1; i <= 2; i++) {
                    if (r.nextInt(2) + 1 == 1) {
                        coffeeBean = true;
                        System.out.println("Your coffee beans are grinding");
                        for (int j = 1; j <= 2; j++) {
                            if (r.nextInt(2) + 1 == 1) {
                                water = true;
                                System.out.println("Water is in the container.");
                                for (int k = 1; k <= 2; k++) {
                                    if (r.nextInt(2) + 1 == 1) {
                                        milk = true;
                                        System.out.println("milk is in the container. Your coffee is ready.");
                                        break;
                                    } else {
                                        if (k < 2) {
                                            milk = false;
                                            System.out.println("You should add milk.");
                                            continue;
                                        } else {
                                            Thread.sleep(1000);
                                            System.out.println("Timeout expired. Good bye!");
                                            break;
                                        }
                                    }
                                }
                            } else {
                                if (j < 2) {
                                    water = false;
                                    System.out.println("You should add water.");
                                    continue;
                                } else {
                                    Thread.sleep(1000);
                                    System.out.println("Timeout expired. Good bye!");
                                    break;
                                }
                            }
                        }

                    } else {
                        if (i < 2) {
                            coffeeBean = false;
                            System.out.println("Please, add coffee beans.");
                            continue;
                        } else {
                            Thread.sleep(1000);
                            System.out.println("Timeout expired. Good bye!");
                            break;
                        }
                    }
                }
            } else {
                Thread.sleep(1000);
                System.out.println("Good bye!");
                drink = false;
            }
        }
    }
}
