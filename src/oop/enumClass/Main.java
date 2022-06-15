package oop.enumClass;

public class Main {

    // An enum is a special "class" that represent a group of constant (unchangeable variables, like final variables).

    enum Level{
        LOW, MEDIUM, HIGH
    }

    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);
    }
}
