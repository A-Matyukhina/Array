package Exception;

import java.util.Scanner;
/*
Пользователь должен ввести число с консоли.
Если не получилось прочитать число (исключение!),
сообщить об этом пользователю и повторить ввод.
Повторять до тех пор, пока не сможем успешно прочитать число.
 */
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

    //TODO write another option with `do-while`; then the third one with `for(;;)`
    public static void endlessLoopTillSuccess(){
        Scanner sc = new Scanner(System.in);
        while (true) { // <-- TODO here use this boolean
            try {
                System.out.println("Enter a number");
                int number = sc.nextInt();
                System.out.println("Your number: " + number);
                break; // TODO use boolean instead of `break`
            } catch (Exception e) {
                System.out.println("Attention! Enter a number, please! Try again.");
//                String prev = sc.next();
//                System.out.println(prev);
            }
        }
    }
}
