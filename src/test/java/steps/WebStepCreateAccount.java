package steps;

import io.cucumber.java.en.And;
import static pages.WebPagePool.webPageCreateAccount;

public class WebStepCreateAccount {
    @And("I input mandatory fields")
    public void iInputMandatoryFields() {
        webPageCreateAccount.sendKeys(webPageCreateAccount.customerFirstName, "John");
        webPageCreateAccount.sendKeys(webPageCreateAccount.customerLastName, "Denver");
        webPageCreateAccount.sendKeys(webPageCreateAccount.password, "12345");
        webPageCreateAccount.sendKeys(webPageCreateAccount.address1, "Blue Ridge Mountain");
        webPageCreateAccount.sendKeys(webPageCreateAccount.city, "Jerusalem");
        webPageCreateAccount.sendKeys(webPageCreateAccount.postcode, "98765");
        webPageCreateAccount.sendKeys(webPageCreateAccount.phoneMobile, "+6288210769867");
        webPageCreateAccount.sendKeys(webPageCreateAccount.alias, "Take Me Home");
        webPageCreateAccount.click(webPageCreateAccount.submitAccount);
    }
}
