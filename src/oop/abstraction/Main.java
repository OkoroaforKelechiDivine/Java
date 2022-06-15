package oop.abstraction;

public class Main {

    // Data abstraction is the process of hiding details and showing only essential information to the user.
    // Abstraction can be accessed with either abstract classes or interface.

    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}
