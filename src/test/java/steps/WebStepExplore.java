package steps;

import io.cucumber.java.en.And;

import static pages.WebPagePool.webPageExplore;

public class WebStepExplore {
    @And("Moods and genres button is tapped")
    public void moodsAndGenresButtonIsTapped() {
        webPageExplore.click(webPageExplore.findElementByTagAndText("yt-formatted-string", "Moods & genres"));
    }
}
