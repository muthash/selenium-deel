package org.deel.webDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.deel.pageObjects.IndividualDetailsPage;
import org.deel.utilityClasses.WebUtility;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.CoreMatchers.containsString;

public class IndividualDetailsDefs {
    private final WebDriver driver = WebUtility.getDriver();
    private final WebDriverWait wait = WebUtility.getWait();
    private final IndividualDetailsPage individualDetailsPage = new IndividualDetailsPage(driver);

    @Then("^I am redirected to the individual details page$")
    public void viewIDPage() {
        wait.until(ExpectedConditions.visibilityOf(individualDetailsPage.getFirstName()));
    }

    @When("^I enter the first name$")
    public void enterFirstName(String name) {
        individualDetailsPage.getFirstName().clear();
        individualDetailsPage.getFirstName().sendKeys(name);
    }

    @And("^I enter the last name$")
    public void  enterLastName(String name) {
        individualDetailsPage.getLastName().clear();
        individualDetailsPage.getLastName().sendKeys(name);
    }

    @And("^I select citizenship$")
    public void selectCitizenship(String citizenship) {
        individualDetailsPage.selectOption(individualDetailsPage.getCitizen(), "2", citizenship);
    }

    @And("^I select the Country of tax residence$")
    public void selectCountryOfTaxResidence(String residence) {
        individualDetailsPage.selectOption(individualDetailsPage.getCountryOfTaxResidence(), "3", residence);
    }

    @And("^I select the birth date$")
    public void selectBirthDate(String dateOfBirth) {
        individualDetailsPage.getBirthDate().click();
        individualDetailsPage.getBirthDate().sendKeys(dateOfBirth);
    }

    @And("^I select the legal status$")
    public void selectLegalStatus() {
        individualDetailsPage.selectOption(individualDetailsPage.getLegalStatus(), "4", "Individual");
    }

    @And("^I enter the personal Id$")
    public void enterPersonalID(){
        individualDetailsPage.getPersonalId() .sendKeys("11243536");
    }

    @And("^I enter the Tax ID$")
    public void enterTaxID(){
        individualDetailsPage.getTaxId().sendKeys("11243536");
    }

    @And("^I select the timezone$")
    public void selectTimezone(){
        individualDetailsPage.selectOption(individualDetailsPage.getTimezone(), "5", "Nairobi");
    }

    @And("^I select the preferred default currency$")
    public void selectDefaultCurrency(){
        individualDetailsPage.selectOption(individualDetailsPage.getCurrency(), "6", "USD");
    }

    @And("^I select the valid phone code$")
    public void selectPhoneCode(){
        individualDetailsPage.selectOption(individualDetailsPage.getDialCode(), "7", "KE");
    }

    @And("^I enter the phone number$")
    public void enterPhoneNumber(){
        individualDetailsPage.getPhone().sendKeys("711243536");
    }

    @And("^I enter the street address$")
    public void enterStreetAddress(){
        individualDetailsPage.getStreet().clear();
        individualDetailsPage.getStreet().sendKeys("Manhattan Downtown Street");
    }

    @And("^I enter the city$")
    public void enterCity(){
        individualDetailsPage.getCity().sendKeys("Nairobi");
    }

    @And("^I enter the zip code$")
    public void enterZip(){
        individualDetailsPage.getZip().sendKeys("00100");
    }

    @And("^I select the country$")
    public void enterCountry(){
        individualDetailsPage.selectOption(individualDetailsPage.getCountry(), "8", "Kenya");
    }

    @And("^I click Complete Profile$")
    public void clickCompleteProfile(){
        individualDetailsPage.getCompleteProfileButton().click();
    }

    @Then("^I should get the error message You must be at least 16 to use Deel")
    public void errorMessageDob(){
        WebElement errorInput = this.driver.findElement(By.cssSelector(".input-container-error"));
        Assert.assertEquals(errorInput.getText(), "You must be at least 16 to use Deel");
    }

    @Then("^I should get the error message Street is required")
    public void errorMessageStreet(){
        WebElement errorInput = this.driver.findElement(By.cssSelector(".input-container-error"));
        Assert.assertEquals(errorInput.getText(), "Street is required");
    }

    @Then("^I should be redirected to the home page")
    public void viewHomePage(){
        WebElement header = this.driver.findElement(By.cssSelector(".mr-6"));
        wait.until(ExpectedConditions.visibilityOf(header));
        Assert.assertThat(header.getText(), containsString("Test"));
    }

}
