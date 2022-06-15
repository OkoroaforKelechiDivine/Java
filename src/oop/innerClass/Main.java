package oop.innerClass;

public class Main {
    // In java, it is also possible to nest classes (a class within a class). The purpose of nested classes is to group together, which makes your code more
    // readable and maintainable
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = new OuterClass.InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}
