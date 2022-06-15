package oop.interfcae;

public class Main {

    // An interface is a completely "abstraction class" that is used to group related methods with empty bodies.
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.run();
        myPig.animalSound();
        myPig.sleep();
    }
}
