package org.deel.webDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.deel.pageObjects.CreateAccountPage;
import org.deel.utilityClasses.WebUtility;
import org.openqa.selenium.WebDriver;

public class createAccountDefs {

    private final WebDriver driver = WebUtility.getDriver();
    private final CreateAccountPage createAccountPage = new CreateAccountPage(driver);

    @Then("^I am redirected to the create account page$")
    public void inputEmail() {
        createAccountPage.viewCreateAccountPage();
        createAccountPage.getIndividualBox().click();
    }

    @And("^I click the I'm an individual box$")
    public void clickIndividual() {
        createAccountPage.getIndividualBox().click();
    }

    @When("^I click the next button$")
    public void clickNextButton() {
        createAccountPage.getNextButton().click();
    }
}
