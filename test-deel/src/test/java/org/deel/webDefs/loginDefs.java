package org.deel.webDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.deel.pageObjects.LoginPage;
import org.deel.utilityClasses.WebUtility;
import org.openqa.selenium.WebDriver;

public class loginDefs {

    private final WebDriver driver = WebUtility.getDriver();
    private final LoginPage loginPage = new LoginPage(driver);

    @When("^I input the email$")
    public void inputEmail() {
        loginPage.viewLoginPage();
        loginPage.getEmailInput().clear();
        loginPage.getEmailInput().sendKeys("stephen.kathingo@andela.com");
    }

    @Then("^I input the password$")
    public void inputPassword() {
        loginPage.getPassWordInput().clear();
        loginPage.getPassWordInput().sendKeys("QLw5Cv5yDuygs5G");
    }

    @And("^I click submit$")
    public void clickSubmit() {
        loginPage.getSubmitButton().click();
    }
}
