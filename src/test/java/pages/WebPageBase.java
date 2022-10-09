package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WebPageBase implements WebPage {
    protected WebDriver webDriver;
    private final Actions actions;
    protected final WebDriverWait webDriverWait;

    public WebPageBase(WebDriver webDriver) {
        this.webDriver = webDriver;
        this.actions = new Actions(this.webDriver);
        long timeOut = 30;
        this.webDriverWait = new WebDriverWait(this.webDriver, Duration.ofSeconds(timeOut));
    }

    @Override
    public void click(By by) {
        List<WebElement> webElements = this.webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        for (WebElement webElement: webElements) {
            this.webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement));
            this.actions.click(webElement).perform();
            break;
        }
    }

    @Override
    public void click(WebElement webElement) {
        try {
            this.actions.click(webElement).perform();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            this.webDriverWait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(webElement)));
            this.actions.click(webElement).perform();
        }
    }

    @Override
    public void sendKeys(By by, String text) {
        List<WebElement> webElements = this.webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        for (WebElement webElement: webElements) {
            this.webDriverWait.until(ExpectedConditions.elementToBeClickable(webElement));
            this.actions.click(webElement).sendKeys(text).perform();
            break;
        }
    }

    @Override
    public void assertTitle(String title) {
        Assert.assertEquals("The title is incorrect", title, this.webDriver.getTitle());
    }

    @Override
    public void assertText(By by, String text) {
        List<WebElement> webElements = this.webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        for (WebElement webElement: webElements) {
            Assert.assertEquals("The text is incorrect", text, webElement.getText());
            break;
        }
    }

    @Override
    public WebElement findElementByTagAndText(String tagName, String text) {
        List<WebElement> webElements = this.webDriverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.tagName(tagName)));
        for (WebElement webElement: webElements) {
            try {
                if (webElement.getText().equals(text)) {
                    return webElement;
                }
            }
            catch (Exception e) {
                this.webDriver.navigate().refresh();
                if (webElement.getText().equals(text)) {
                    return webElement;
                }
            }
        }
        return null;
    }

    @Override
    public void close() {
        this.webDriver.close();
    }
}