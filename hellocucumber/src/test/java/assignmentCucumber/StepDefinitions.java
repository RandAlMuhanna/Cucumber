package assignmentCucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinitions {

    WebDriver driver;

    @Given("user goes to the {string}")
    public void user_goes_to_the(String pageUrl) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(pageUrl);
    }

    @Then("user waits for 5 seconds")
    public void user_waits_for_seconds() throws InterruptedException {
        Thread.sleep(5000);
    }

    @Then("verifies that the page title contains the word {string}")
    public void verifies_that_the_page_title_contains_the_word(String expected) {
        String actual = driver.getTitle();
        Assertions.assertTrue(actual.contains(expected),
                "Expected: " + expected + "Actual: " + actual);
    }

    @Then("closes the page")
    public void closes_the_page() {

        driver.quit();
    }


}
