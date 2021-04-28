package org.deel.pageObjects;

import org.deel.utilityClasses.WebUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccountPage extends BasePOM{

    public CreateAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how= How.XPATH,using="/html/body/div[1]/div/div[2]/div/div/div/div[1]/button")
    WebElement entityBox;

    @FindBy(how= How.XPATH,using="/html/body/div[1]/div/div[2]/div/div/div/div[2]/button")
    WebElement individualBox;

    @FindBy(how= How.CLASS_NAME,using="mt-2")
    WebElement nextButton;

    public WebElement getIndividualBox(){
        return individualBox;
    }

    public WebElement getEntityBox() {
        return entityBox;
    }

    public WebElement getNextButton(){
        return nextButton;
    }
}
