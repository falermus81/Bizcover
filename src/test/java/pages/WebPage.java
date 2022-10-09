package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public interface WebPage {
    void click(By by);
    void click(WebElement webElement);
    void sendKeys(By by, String text);
    void assertTitle(String title);
    void assertText(By by, String text);
    WebElement findElementByTagAndText(String tagName, String text);
    void close();
}
