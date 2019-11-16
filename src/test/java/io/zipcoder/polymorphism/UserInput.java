package io.zipcoder.polymorphism;
import java.util.Scanner;


public class UserInput {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }
    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    //Create a program that asks the user how many pets they have.
    // Once you know how many pets they have, ask them what kind of pet each one is, along with each pet's name
    public static Integer integerInput(String prompt){
        Scanner user = new Scanner(System.in);
        print(prompt);
        Integer userPetInput = Integer.valueOf(user.nextLine());
        return userPetInput;
    }

    public static String stringInput(String prompt){
        Scanner user = new Scanner(System.in);
        print(prompt);
        String  userPetAnimal = user.nextLine();
        return userPetAnimal;
    }


}
