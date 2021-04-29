package org.deel.webDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.deel.pageObjects.LoginPage;
import org.deel.utilityClasses.WebUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginDefs {

    private final WebDriver driver = WebUtility.getDriver();
    private final WebDriverWait wait = WebUtility.getWait();
    private final LoginPage loginPage = new LoginPage(driver);
    public final String randomEmail = WebUtility.getRandomEmail();

    @When("^I input the email$")
    public void inputEmail() {
        wait.until(ExpectedConditions.visibilityOf(loginPage.getEmailInput()));
        loginPage.getEmailInput().clear();
        loginPage.getEmailInput().sendKeys(randomEmail);
    }

    @Then("^I input the password$")
    public void inputPassword() {
        loginPage.getPassWordInput().clear();
        loginPage.getPassWordInput().sendKeys("iQvyGp2VVJhd9zK");
    }

    @And("^I click submit$")
    public void clickSubmit() {
        loginPage.getSubmitButton().click();
    }

    @Then("I signup into the system")
    public void signup(){
        driver.findElement(By.cssSelector(".login-signup-link > div")).click();
        driver.findElement(By.cssSelector(".pl-6 .mb-4")).click();
        driver.findElement(By.cssSelector(".w-100 > div")).click();
        driver.findElement(By.name("name")).sendKeys("Test");
        driver.findElement(By.name("email")).sendKeys(randomEmail);
        driver.findElement(By.name("password")).sendKeys("iQvyGp2VVJhd9zK");
        driver.findElement(By.name("confirmPassword")).sendKeys("iQvyGp2VVJhd9zK");
        driver.findElement(By.cssSelector(".button:nth-child(2) > div")).click();
        WebElement emailPage = driver.findElement(By.className("confirmation-signup-content"));
        wait.until(ExpectedConditions.visibilityOf(emailPage));
    }
}
