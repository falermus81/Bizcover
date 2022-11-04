package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebPageLogin extends WebPageBase {
    public By emailCreate = By.id("email_create");
    public By submitCreate = By.id("SubmitCreate");
    public WebPageLogin(WebDriver webDriver) {
        super(webDriver);
    }
}
