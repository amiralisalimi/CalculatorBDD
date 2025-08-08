package edu.sharif.selab.calculator.stepdefs;

import edu.sharif.selab.calculator.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class CalculatorStepdefs {
    private Calculator calculator;
    private double result;
    private Exception exception;

    @Given("I have a calculator")
    public void setupCalculator() {
        calculator = new Calculator();
    }

    @When("I enter {double} and {double} and the operator {string}")
    public void performOperation(double num1, double num2, String operator) {
        try {
            result = calculator.calculate(num1, num2, operator.charAt(0));
        } catch (Exception e) {
            exception = e;
        }
    }

    @Then("the result should be {string}")
    public void verifyResult(String expected) {
        if ("Infinity".equals(expected)) {
            assertTrue(Double.isInfinite(result));
        } else if (expected.startsWith("Error")) {
            assertNotNull(exception);
        } else {
            double expectedResult = Double.parseDouble(expected);
            assertEquals(expectedResult, result, 0.0001);
        }
    }
}
