package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.WebPageLanding;

import static pages.WebPagePool.webPageLanding;
import static pages.WebPagePool.webPageArticle;
import static pages.WebPagePool.webPageExplore;

public class WebStepLanding {
    @Given("The website {string} is opened using Chrome")
    public void theWebsiteIsOpenedUsingChrome(String webUrl) {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get(webUrl);
        webPageLanding = new WebPageLanding(webDriver);
    }

    @When("The word {string} is searched in Search Bar")
    public void theWordIsSearchedInSearchBar(String input) {
        webPageLanding.sendKeys(webPageLanding.searchInput, input);
        webPageLanding.click(webPageLanding.searchButton);
        webPageLanding.goToArticle();
    }

    @When("The word {string} is typed in Search Bar")
    public void theWordIsTypedInSearchBar(String input) {
        webPageLanding.sendKeys(webPageLanding.searchInput, input);
    }

    @Then("Suggestion result should be displayed with text {string}")
    public void suggestionResultShouldBeDisplayedWithText(String text) {
        webPageLanding.assertText(webPageLanding.searchSuggestion, text);
    }

    @When("Explore tab is tapped")
    public void exploreTabIsTapped() {
        webPageLanding.click(webPageLanding.findElementByTagAndText("yt-formatted-string", "Explore"));
        webPageLanding.goToExplore();
    }

    @And("I want to login")
    public void iWantToLogin() {
        webPageLanding.click(webPageLanding.login);
        webPageLanding.goToLogin();
    }
}
