pacpackage io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by leon on 11/6/17.
 */

public class MainApplicationTest {


    @Test
    public void petsListSizeTest(){
        User testUser = new User(3);

        Integer expected = 3;
        Integer actual = testUser.pets.getsize();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void petsGetNameTest(){
        Dog snoop = new Dog();
        snoop.setName("Snoop");

        String expected = "Snoop";
        String actual = snoop.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void petsSpeakTest(){
        Cat burgler = new Cat();

        String expected = "purrr";
        String actual = burgler.speak();

        Assert.assertEquals(expected, actual);
    }

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

