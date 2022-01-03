package Exception;

import java.util.Scanner;

public class InputNumber {
    public static void main(String[] args) {
        endlessLoopTillSuccess();
    }

    public static void endlessLoop() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter a number");
                int number = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Attention! Enter a number, please! Try again.");
                sc.next();
            }
        }
    }

    public static void endlessLoopTillSuccess(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter a number");
                int number = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Attention! Enter a number, please! Try again.");
                sc.next();
            }
        }
    }
}

