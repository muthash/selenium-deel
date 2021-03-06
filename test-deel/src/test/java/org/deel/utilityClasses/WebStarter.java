package org.deel.utilityClasses;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class WebStarter {

    // Cucumber Methods
    @Given("I have opened the Browser")
    public void openWebBrowser() {

        // Starts the Web Browser
        WebUtility.startWebBrowser(WebUtility.getValue("web.browser"));
        String urlBase = WebUtility.getValue("baseUrl");

        if (urlBase == null) {
            urlBase = "google.com";
        }
        WebUtility.getDriver().get(urlBase);
    }

    @Then("I visit the deel dev url")
    public void visitURL() {
        String urlBase = WebUtility.getValue("baseUrl");

        if (urlBase == null) {
            urlBase = "google.com";
        }
        WebUtility.getDriver().get(urlBase);
    }

    @After
    public void closeWebBrowser(Scenario scenario) {

        if (scenario.isFailed()) {
            WebUtility.takeScreenshot();
        }

        // Close the Web Browser
        WebUtility.getDriver().quit();
    }

}
