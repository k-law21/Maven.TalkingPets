package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {

    private static Scanner input = new Scanner(System.in);
    private static Integer numberOfPets;
    private static ArrayList<Pet> listOfPets = new ArrayList<Pet>();

    public static void main(String[] args) {
        System.out.println("How many pets do you have?");
        Integer numberOfPets = input.nextInt();

        for (int i = 0; i < numberOfPets; i++) {
            String petType = getPetType().toLowerCase();
            String petName = getPetName();
            if (petType.equals("dog")) {
                Pet pet = new Dog(petName);
                listOfPets.add(pet);
            } else if (petType.equals("cat")) {
                Pet pet = new Cat(petName);
                listOfPets.add(pet);
            } else if (petType.equals("bird")) {
                Pet pet = new Bird(petName);
                listOfPets.add(pet);
            } else {
                Pet pet = new Pet(petName);
                listOfPets.add(pet);
            }
        }
        for(Pet pet: listOfPets) {
            System.out.println(pet.getName() + " : " + pet.speak());
        }
    }

    public static String getPetType() {
        System.out.println("What is the type of your pet?");
        String typeOfPet = input.next();
        return typeOfPet;
    }

    public static String getPetName() {
        System.out.println("What is the name of your pet?");
        String nameOfPet = input.next();
        return nameOfPet;
    }
}

