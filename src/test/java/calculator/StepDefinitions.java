package calculator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static junit.framework.TestCase.assertEquals;

public class StepDefinitions {

    private ArithmeticCalculator calculator;
    private CalculationResult actualResult;

    @Given("^I have a calculator$")
    public void iHaveACalculator() {
        calculator = new ArithmeticCalculator();
    }

    @When("^I request to calculate (.*)$")
    public void iRequestToCalculateExpression(String expression) {
        actualResult = calculator.calculate(
                ArithmeticExpression.fromString(expression)
        );
    }

    @Then("^I should receive a result of (\\d+)$")
    public void iShouldReceiveAResultOf(double expectedResult) {
        assertEquals(new CalculationResult(expectedResult), actualResult);
    }
}
