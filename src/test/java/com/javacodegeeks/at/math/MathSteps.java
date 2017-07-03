package com.javacodegeeks.at.math;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class MathSteps {

    private Integer currentTotal = 0;

    @Given("^The number \"([^\"]*)\"$")
    public void The_number(String firstNumber) throws Throwable {
        currentTotal = Integer.valueOf(firstNumber);
    }

    @When("^\"([^\"]*)\" is added the total$")
    public void is_added_the_total(String newNumber) throws Throwable {
        currentTotal += Integer.valueOf(newNumber);
    }


    @Then("^The result is \"([^\"]*)\"$")
    public void The_result_is(String expectedResult) throws Throwable {
        assertEquals(Integer.valueOf(expectedResult), currentTotal );
    }
}
