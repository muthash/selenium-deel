package org.deel.webDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.deel.pageObjects.CreateAccountPage;
import org.deel.utilityClasses.WebUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class createAccountDefs {

    private final WebDriver driver = WebUtility.getDriver();
    private final WebDriverWait wait = WebUtility.getWait();
    private final CreateAccountPage createAccountPage = new CreateAccountPage(driver);

    @Then("^I am redirected to the create account page$")
    public void viewCAPage() {
        wait.until(ExpectedConditions.visibilityOf(createAccountPage.getEntityBox()));
    }

    @And("^I click the I'm an individual box$")
    public void clickIndividual() {
        createAccountPage.getIndividualBox().click();
    }

    @And("^I click the next button$")
    public void clickNextButton() {
        createAccountPage.getNextButton().click();
    }
}
