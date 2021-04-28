package org.deel.pageObjects;

import org.deel.utilityClasses.WebUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePOM{

    private final WebDriver driver = WebUtility.getDriver();
    private final WebDriverWait wait = WebUtility.getWait();

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how= How.NAME,using="email")
    WebElement email;

    @FindBy(how= How.NAME,using="password")
    WebElement password;

    @FindBy(how= How.XPATH,using="/html/body/div[1]/div[2]/div[3]/div/div/div/form/button")
    WebElement submitButton;

    public void viewLoginPage(){
        wait.until(ExpectedConditions.visibilityOf(submitButton));
    }

    public WebElement getEmailInput(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return email;
    }

    public WebElement getPassWordInput(){
        return password;
    }

    public WebElement getSubmitButton(){
        return submitButton;
    }
}
