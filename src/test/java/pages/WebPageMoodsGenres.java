package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebPageMoodsGenres extends WebPageBase {
    public By buttonMoodChill = By.cssSelector("#items > ytmusic-navigation-button-renderer:nth-child(1) > button");
    public By buttonMoodCommute = By.cssSelector("#items > ytmusic-navigation-button-renderer:nth-child(2) > button");
    public By buttonMoodEnergyBoosters = By.cssSelector("#items > ytmusic-navigation-button-renderer:nth-child(3) > button");
    public By buttonMoodFeelGood = By.cssSelector("#items > ytmusic-navigation-button-renderer:nth-child(4) > button");
    public By buttonMoodFocus = By.cssSelector("#items > ytmusic-navigation-button-renderer:nth-child(5) > button");
    public By buttonMoodParty = By.cssSelector("#items > ytmusic-navigation-button-renderer:nth-child(6) > button");
    public By buttonMoodRomance = By.cssSelector("#items > ytmusic-navigation-button-renderer:nth-child(7) > button");
    public By buttonMoodSleep = By.cssSelector("#items > ytmusic-navigation-button-renderer:nth-child(8) > button");
    public By buttonMoodWorkout = By.cssSelector("#items > ytmusic-navigation-button-renderer:nth-child(9) > button");
    public WebPageMoodsGenres(WebDriver webDriver) {
        super(webDriver);
    }
}
