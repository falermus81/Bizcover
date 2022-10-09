package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static pages.WebPagePool.webPageMoodsGenres;

public class WebPageExplore extends WebPageBase {
    public By buttonMoodAndGenres = By.cssSelector("#items > ytmusic-navigation-button-renderer:nth-child(3) > button");
    public WebPageExplore(WebDriver webDriver) {
        super(webDriver);
    }
    public void goToMoodsGenres() {
        webPageMoodsGenres = new WebPageMoodsGenres(this.webDriver);
    }
}
