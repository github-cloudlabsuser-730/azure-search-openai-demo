/**
 * The Calculator class provides methods to get addition and subtraction of given two numbers.
 */
public class Calculator {

    /**
     * Adds two integers.
     *
     * @param num1 The first number.
     * @param num2 The second number.
     * @return The sum of num1 and num2.
     */
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Subtracts the second integer from the first.
     *
     * @param num1 The first number.
     * @param num2 The second number.
     * @return The result of num1 minus num2.
     */
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * Multiplies two integers.
     *
     * @param num1 The first number.
     * @param num2 The second number.
     * @return The product of num1 and num2.
     */
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * Divides the first integer by the second.
     *
     * @param num1 The first number.
     * @param num2 The second number.
     * @return The result of num1 divided by num2.
     * @throws ArithmeticException if num2 is zero.
     */
    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1 / num2;
    }
}