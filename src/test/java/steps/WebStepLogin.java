package steps;

import io.cucumber.java.en.When;

import static pages.WebPagePool.webPageLogin;

public class WebStepLogin {
    @When("I try to register with email {word}")
    public void iTryToRegisterWithEmail(String email) {
        webPageLogin.sendKeys(webPageLogin.emailCreate, email);
        webPageLogin.click(webPageLogin.submitCreate);
    }
}
