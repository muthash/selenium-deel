package org.deel.pageObjects;

import org.deel.utilityClasses.WebUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePOM{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how= How.NAME,using="email")
    WebElement email;

    @FindBy(how= How.NAME,using="password")
    WebElement password;

    @FindBy(how= How.CLASS_NAME,using="mt-10")
    WebElement submitButton;

    public WebElement getEmailInput(){
        return email;
    }

    public WebElement getPassWordInput(){
        return password;
    }

    public WebElement getSubmitButton(){
        return submitButton;
    }
}
