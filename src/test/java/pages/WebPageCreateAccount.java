package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebPageCreateAccount extends WebPageBase {
    public By customerFirstName = By.id("customer_firstname");
    public By customerLastName = By.id("customer_lastname");
    public By password = By.id("passwd");
    public By address1 = By.id("address1");
    public By city = By.id("city");
    public By idState = By.id("id_state");
    public By postcode = By.id("postcode");
    public By idCountry = By.id("id_country");
    public By phoneMobile = By.id("phone_mobile");
    public By alias = By.id("alias");
    public By submitAccount = By.id("submitAccount");
    public WebPageCreateAccount(WebDriver webDriver) {
        super(webDriver);
    }
}
