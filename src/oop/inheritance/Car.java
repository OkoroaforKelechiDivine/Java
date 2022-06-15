package oop.inheritance;

public class Car extends Vehicle{

    //Inheritance lets us inherit attributes and methods from another class.
    private final String modelName = "Mustang";

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
