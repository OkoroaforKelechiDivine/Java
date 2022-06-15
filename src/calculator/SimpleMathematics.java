package calculator;

// This is a class.
public class SimpleMathematics {

    public int addTwoNumbers(int firstNumber, int secondNumber){
        System.out.println("The result is " + (firstNumber + secondNumber));
        return firstNumber + secondNumber;
    }

    public int subtractTwoNumbers(int firstNumber , int secondNumber){
        System.out.println("The result is " + (firstNumber - secondNumber));
        return firstNumber - secondNumber;
    }

    public int multiplyTwoNumbers(int firstNumber , int secondNumber){
        System.out.println("The result is " + (firstNumber * secondNumber));
        return  firstNumber * secondNumber;
    }

    public int divideTwoNumbers(int firstNumber, int secondNumber){
        System.out.println("The result is " + (firstNumber / secondNumber));
        return firstNumber / secondNumber;
    }

}
