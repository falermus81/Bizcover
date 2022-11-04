package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static pages.WebPagePool.webPageCreateAccount;

public class WebPageLogin extends WebPageBase {
    public By emailCreate = By.id("email_create");
    public By submitCreate = By.id("SubmitCreate");

    public void goToCreateAccount() {
        webPageCreateAccount = new WebPageCreateAccount(this.webDriver);
    }
    public WebPageLogin(WebDriver webDriver) {
        super(webDriver);
    }
}
