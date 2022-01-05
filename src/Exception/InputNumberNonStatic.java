package Exception;

import java.util.Scanner;

public class InputNumberNonStatic {

    Scanner sc = new Scanner(System.in);
/*
H/w - second version.
write another option with `for(;;)`
and use 'number' in code.
 */
    public void endlessLoopWithFor(){
        for(;;){
            try{
                System.out.println("Enter a number: ");
                int number = sc.nextInt();
                if(number < 0){
                    System.out.println("Your number is - " + number + " this is a negative number.");
                }else if(number > 0){
                    System.out.println("Your number is - " + number + " this is a positive number.");
                }else{
                System.out.println("You number is - " + number + " Oh! This is zero!");
                }
                System.out.println("Would you like enter an another one? Please,choose Y/N ");
                String s = sc.next();
                if(s.equalsIgnoreCase("Y")){
                    continue;
                }else{
                    break;
                }
            }catch(Exception e){
                System.out.println("You should have type a number! Please, try again!");
                sc.next();
            }
        }
    }
    /*
    write another option with `do-while`
     */
    public void endlessLoopWithDoWhile(){
        do {
            try {
                System.out.println("Enter a number: ");
                int number = sc.nextInt();
                if (number < 0) {
                    System.out.println("Your number is - " + number + " this is a negative number.");
                } else if (number > 0) {
                    System.out.println("Your number is - " + number + " this is a positive number.");
                } else {
                    System.out.println("You number is - " + number + " Oh! This is zero!");
                }
//                break;
            } catch (Exception e) {
                System.out.println("You should have type a number! Please, try again!");
                sc.next();
            }
        }while(true);
    }
    public void endlessLoopWithBoolean(){
        boolean isNotNumber = false;
        while(!isNotNumber){
            try{
                System.out.println("Enter a number: ");
                int number = sc.nextInt();
                if(number < 0){
                    System.out.println("Your number is - " + number + " this is a negative number.");
                }else if(number > 0){
                    System.out.println("Your number is - " + number + " this is a positive number.");
                }else{
                    System.out.println("You number is - " + number + " Oh! This is zero!");
                }
                isNotNumber = sc.hasNextInt();
            }catch(Exception e){
                System.out.println("You should have type a number! Please, try again!");
                sc.next();
            }
        }
    }
    public void endlessLoopWithBoolean2(){
        boolean isNumber = sc.hasNextInt();
        while(!isNumber){
            try{
                System.out.println("Enter a number: ");
                int number = sc.nextInt();
                if(number < 0){
                    System.out.println("Your number is - " + number + " this is a negative number.");
                }else if(number > 0){
                    System.out.println("Your number is - " + number + " this is a positive number.");
                }else{
                    System.out.println("You number is - " + number + " Oh! This is zero!");
                }
                isNumber = true;
            }catch(Exception e){
                System.out.println("You should have type a number! Please, try again!");
                sc.next();
            }
        }
    }
}
