package edu.sharif.selab.calculator;

public class Calculator {
    public double calculate(double num1, double num2, char op) {
        switch (op) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    return Double.POSITIVE_INFINITY;
                }
                return (double) num1 / num2;
            default:
                throw new IllegalArgumentException("عملگر نامعتبر: " + op);
        }
    }
}
