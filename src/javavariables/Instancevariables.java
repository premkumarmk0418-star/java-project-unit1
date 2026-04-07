package javavariables;

public class Instancevariables {

    int firstNumber = 100;
    int secondNumber = 200;

    public static void main(String[] args) {

        Instancevariables obj = new Instancevariables();

        System.out.println("First Number: " + obj.firstNumber);
        System.out.println("Second Number: " + obj.secondNumber);
    }
}