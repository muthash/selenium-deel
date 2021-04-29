package org.deel.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class IndividualDetailsPage  extends BasePOM{

    public IndividualDetailsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how= How.NAME,using="firstName")
    WebElement firstName;
    @FindBy(how= How.NAME,using="lastName")
    WebElement lastName;
    @FindBy(how= How.CSS,using="div[data-qa='citizen-of']")
    WebElement citizen;
    @FindBy(how= How.CSS,using="div[data-qa='country-of-tax-residence']")
    WebElement countryOfTaxResidence;
    @FindBy(how= How.NAME,using="birthDate")
    WebElement birthDate;
    @FindBy(how= How.CSS,using="div[data-qa='selector-legal-status']")
    WebElement legalStatus;
    @FindBy(how= How.NAME,using="personalId")
    WebElement personalId;
    @FindBy(how= How.NAME,using="taxId")
    WebElement taxId;
    @FindBy(how= How.CSS,using="div[data-qa='selector-timezone']")
    WebElement timezone;
    @FindBy(how= How.CSS,using="div[data-qa='currency-select']")
    WebElement currency;
    @FindBy(how= How.CSS,using="div[data-qa='selector-dial-code']")
    WebElement dialCode;
    @FindBy(how= How.NAME,using="phone")
    WebElement phone;
    @FindBy(how= How.NAME,using="street")
    WebElement street;
    @FindBy(how= How.NAME,using="city")
    WebElement city;
    @FindBy(how= How.NAME,using="zip")
    WebElement zip;
    @FindBy(how= How.CSS,using="div[data-qa='country-select']")
    WebElement country;
    @FindBy(how= How.CSS,using=".flex > .button > div")
    WebElement completeProfileButton;

    public WebElement getFirstName() {
        return firstName;
    }

    public WebElement getLastName() {
        return lastName;
    }

    public WebElement getCitizen() {
        return citizen;
    }

    public WebElement getCountryOfTaxResidence(){
        return countryOfTaxResidence;
    }

    public WebElement getBirthDate(){
        return birthDate;
    }

    public WebElement getLegalStatus() {
        return legalStatus;
    }

    public WebElement getPersonalId() {
        return personalId;
    }

    public WebElement getTaxId() {
        return taxId;
    }

    public WebElement getTimezone() {
        return timezone;
    }

    public WebElement getCurrency() {
        return currency;
    }

    public WebElement getDialCode() {
        return dialCode;
    }

    public WebElement getPhone() {
        return phone;
    }

    public WebElement getStreet() {
        return street;
    }

    public WebElement getCity() {
        return city;
    }

    public WebElement getZip() {
        return zip;
    }

    public WebElement getCountry() {
        return country;
    }

    public WebElement getCompleteProfileButton() {
        return completeProfileButton;
    }

    public void selectOption(WebElement element, String inputNum, String selection){
        element.findElement(By.className("css-1hwfws3")).click();
        element.findElement(By.id("react-select-"+inputNum+"-input")).sendKeys(selection);
        element.findElement(By.className("css-26l3qy-menu")).click();
    }
}
