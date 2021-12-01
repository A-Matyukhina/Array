package com.company;

import java.sql.SQLOutput;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();

        int [] myArray = new int[10];
        for(int i = 0; i < myArray.length; i++){
            myArray[i] = 10 + rand.nextInt(100 - 10 + 1);
            System.out.print(myArray[i] + " ");
            if(i == myArray.length - 1){ // I can't do
                System.out.println("\n");
            }
        }
        for(int i = 0; i< myArray.length; i++){
            if(i % 2 == 0){
                myArray[i] *= 2;
            }
            System.out.print(myArray[i] + " ");
        }
        int max = myArray[0];
        int min = myArray[0];
        for(int i = 0; i < myArray.length -1; i++){
            if(max <= myArray[i]) {
                max = myArray[i];
            }
            if(min >= myArray[i]){
                min = myArray[i];
            }
        }
        System.out.println("\n" + "Самый большой элемент массива: " + max);
        System.out.println("Самый маленький элемент массива: " + min);
    }
}
