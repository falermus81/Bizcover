package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.jetbrains.annotations.NotNull;

import static pages.WebPagePool.webPageMoodsGenres;

public class WebStepMoodsGenres {
    @And("A {string} is selected")
    public void aMoodIsSelected(@NotNull String mood) {
        switch (mood) {
            case "Chill":
                webPageMoodsGenres.click(webPageMoodsGenres.buttonMoodChill);
                break;
            case "Commute":
                webPageMoodsGenres.click(webPageMoodsGenres.buttonMoodCommute);
                break;
            case "Energy Boosters":
                webPageMoodsGenres.click(webPageMoodsGenres.buttonMoodEnergyBoosters);
                break;
            case "Feel Good":
                webPageMoodsGenres.click(webPageMoodsGenres.buttonMoodFeelGood);
                break;
            case "Focus":
                webPageMoodsGenres.click(webPageMoodsGenres.buttonMoodFocus);
                break;
            case "Party":
                webPageMoodsGenres.click(webPageMoodsGenres.buttonMoodParty);
                break;
            case "Romance":
                webPageMoodsGenres.click(webPageMoodsGenres.buttonMoodRomance);
                break;
            case "Sleep":
                webPageMoodsGenres.click(webPageMoodsGenres.buttonMoodSleep);
                break;
            case "Workout":
                webPageMoodsGenres.click(webPageMoodsGenres.buttonMoodWorkout);
                break;
            default:
                break;
        }
    }

    @Then("The page is displayed correctly")
    public void thePageIsDisplayedCorrectly() {
        webPageMoodsGenres.close();
    }
}
