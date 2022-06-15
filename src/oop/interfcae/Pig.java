package oop.interfcae;

public class Pig implements Animal{
    public void animalSound(){
        System.out.println("The pig says: wee wee");
    }

    public void run() {
        System.out.println("Run with four legs!!!");
    }

    public void sleep() {
        System.out.println("Zzz");
    }
}
