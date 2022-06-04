package stepDefinition;

import Hooks.Hooks;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.*;

import java.util.List;

public class StepDefinition{

    public WebDriver driver;

    public StepDefinition() {
        driver = Hooks.driver;
    }

    @Given("^user is on MMT page$")
    public void user_is_on_MMT_page() {

        driver.get("https://www.makemytrip.com/");

    }

    @When("^user search for flights$")
    public void user_search_for_flights() {

        driver.findElement(By.xpath("//p[@data-cy='submit']")).click();

    }

    @Then("^user verifies flight count$")
    public void user_verifies_flight_count() throws InterruptedException {

        try {
            driver.findElement(By.xpath("//div[@class=\"overlay\"]/div/span")).click();
        } catch (Exception e) {

        } finally {
            Thread.sleep(2000);
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("window.scrollBy(0,650)", "");
            List<WebElement> element = driver.findElements(By.xpath("//div[@id=\"premEcon\"]/div/div[@class=\"fli-list  simpleow \"]"));
            System.out.println("Total Flights : " + element.size());


        }
    }
}
