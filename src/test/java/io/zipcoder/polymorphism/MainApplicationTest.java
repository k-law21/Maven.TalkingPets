package io.zipcoder.polymorphism;

import java.util.ArrayList;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplicationTest {

    ArrayList<PetTest> petList = new ArrayList<>();


    public static void main(String args[]) {
        //Scanner user = new Scanner(System.in);


        //Create a program that asks the user how many pets they have.
        // Once you know how many pets they have, ask them what kind of pet each one is, along with each pet's na


        Integer value = UserInput.integerInput("How many pets do you have?");
        //Integer userPetInput = user.nextInt();

        String value2 = UserInput.stringInput("What is their name?");
    }
}