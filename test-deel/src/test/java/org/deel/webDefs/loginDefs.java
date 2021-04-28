package org.deel.webDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.deel.pageObjects.LoginPage;
import org.deel.utilityClasses.WebUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginDefs {

    private final WebDriver driver = WebUtility.getDriver();
    private final WebDriverWait wait = WebUtility.getWait();
    private final LoginPage loginPage = new LoginPage(driver);

    @When("^I input the email$")
    public void inputEmail() {
        wait.until(ExpectedConditions.visibilityOf(loginPage.getEmailInput()));
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
