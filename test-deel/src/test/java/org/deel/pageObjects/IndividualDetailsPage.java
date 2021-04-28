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

    @FindBy(how= How.NAME,using="firstName")
    WebElement lastName;

    @FindBy(how= How.CSS,using="div[data-qa='citizen-of']")
    WebElement citizen;

    @FindBy(how= How.CSS,using="div[data-qa='country-of-tax-residence']")
    WebElement countryOfTaxResidence;

    @FindBy(how= How.CSS,using="div[data-qa='country-of-tax-residence']")
    WebElement birthDate;

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

    public void selectOption(WebElement element, String inputNum, String selection){
        element.findElement(By.className("css-1hwfws3")).click();
        element.findElement(By.id("react-select-"+inputNum+"-input")).sendKeys(selection);
        element.findElement(By.className("css-26l3qy-menu")).click();
    }
}
