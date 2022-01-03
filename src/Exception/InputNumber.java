package Exception;

import java.util.Scanner;

public class InputNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
                System.out.println("Enter a number");
                int number = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Attention! Enter a number, please! Try again.");
                sc.next();
            }
        }
    }
}

