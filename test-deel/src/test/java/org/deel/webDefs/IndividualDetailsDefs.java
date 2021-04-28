package org.deel.webDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.deel.pageObjects.IndividualDetailsPage;
import org.deel.utilityClasses.WebUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    @And("^I select the citizenship$")
    public void selectCitizenship(String citizenship) {
        individualDetailsPage.selectOption(individualDetailsPage.getCitizen(), "2", citizenship);
    }

    @And("^I select the Country of tax residence$")
    public void selectCountryOfTaxResidence(String residence) {
        individualDetailsPage.selectOption(individualDetailsPage.getCountryOfTaxResidence(), "3", residence);
    }
}
