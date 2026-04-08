package JavaOperators;

public class LogicalOperator {
    public static void main(String[] args) {
        int firstValue = 600;
        int secondValue = 600;

        int thridValue = 500;
        int fourthValue = 501;

        boolean isProductAvailable = true;

        System.out.println("Logical AND (&&) ====>" + (( firstValue==secondValue ) && (thridValue==fourthValue)));
        System.out.println("Logical and (||) ====>" + (( firstValue == secondValue ) || (thridValue==fourthValue)));
        System.out.println("Logical Not (!) =====>" + (!isProductAvailable));

    }
}

