package oop.polymorphism;

public class Main {

    //Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myPig = new Pig();
        Animal myDog = new Dog();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
