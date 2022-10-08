package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static pages.WebPagePool.webPageArticle;
import static pages.WebPagePool.webPageExplore;

public class WebPageLanding extends WebPageBase {
    public By searchInput = By.id("searchInput");
    public By searchButton = By.id("searchButton");

    public By searchSuggestion = By.className("highlight");
    public By tabExplore = By.name("Explore");
    public WebPageLanding(WebDriver webDriver) {
        super(webDriver);
    }

    public void goToArticle() {
        webPageArticle = new WebPageArticle(this.webDriver);
    }
    public void goToExplore() {
        webPageExplore = new WebPageExplore(this.webDriver);
    }

}
