package io.zipcoder.polymorphism;

public class Cat extends Pet {

    String catName = "";


    Cat(String petName) {
        super();
        this.catName = catName;

    }

    public String speak() {
        return "Meow!";
    }
}