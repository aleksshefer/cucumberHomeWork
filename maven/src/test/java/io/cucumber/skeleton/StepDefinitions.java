package io.cucumber.skeleton;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class StepDefinitions {
    private Belly belly;

    @Before
    public void setBelly() {
        this.belly = new Belly();
    }

    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) {
        this.belly.eat(cukes);
        Assertions.assertEquals(this.belly.getCukes(), cukes);
    }

    @When("I wait {string} hour")
    public void iWaitHour(String someTime) {
        int intSomeTime = Integer.parseInt(someTime);
        this.belly.waitSomeTime(intSomeTime);
        Assertions.assertEquals(intSomeTime, this.belly.getWaitingTime());
    }

    @Then("my belly should growl")
    public void myBellyShouldGrowl() {
        if (this.belly.getWaitingTime() >= 1) {
            Assertions.assertTrue(this.belly.isGrowl());
        } else {
            Assertions.assertFalse(this.belly.isGrowl());
        }
    }

}
