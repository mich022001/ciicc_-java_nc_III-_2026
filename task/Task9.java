import static java.lang.Math.*;

class Calculator {

    private int firstNumber;
    private int secondNumber;

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }
}

public class Task9 {

    public static int add(int a, int b) {
        return addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    public static float divide(int a, int b) {
        return (float) floorDiv(a, b);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setFirstNumber(10);
        calculator.setSecondNumber(5);

        System.out.println("Sum: " +
                add(calculator.getFirstNumber(), calculator.getSecondNumber()));

        System.out.println("Difference: " +
                subtract(calculator.getFirstNumber(), calculator.getSecondNumber()));

        System.out.println("Product: " +
                multiply(calculator.getFirstNumber(), calculator.getSecondNumber()));

        System.out.println("Quotient: " +
                divide(calculator.getFirstNumber(), calculator.getSecondNumber()));
    }
}
