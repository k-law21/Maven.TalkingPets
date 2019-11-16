package io.zipcoder.polymorphism;

public class PetTest {
    private String name;


    public PetTest(String name) {
        this.name = name;
    }
    public String name(){return name;}


    public String speak() {
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
