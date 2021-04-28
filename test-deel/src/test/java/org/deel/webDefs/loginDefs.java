package org.deel.webDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.deel.pageObjects.LoginPage;
import org.deel.utilityClasses.WebUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginDefs {

    private final WebDriver driver = WebUtility.getDriver();
    private final WebDriverWait wait = WebUtility.getWait();
    private final LoginPage loginPage = new LoginPage(driver);

    @Then("^I input the email$")
    public void inputEmail() {
        loginPage.viewLoginPage();
        loginPage.getEmailInput().clear();
        loginPage.getEmailInput().sendKeys("muthama");
    }

    @Then("^I input the password$")
    public void inputPassword() {
        loginPage.getPassWordInput().clear();
        loginPage.getPassWordInput().sendKeys("muthama");
    }

    @Then("^I click submit$")
    public void clickSubmit() {
        loginPage.getSubmitButton().click();
    }
}
