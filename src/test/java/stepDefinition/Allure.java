package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allure
{
    WebDriver driver;
    String path="D:\\Java\\ReportsAllure\\ChromeDriver\\chromedriver.exe";
    @Given("Browser is open")
    public void browser_is_open() {
        System.setProperty("webdriver.chrome.driver", path);
        driver=new ChromeDriver();
        System.out.println("Browser open successfully");
    }

    @Given("user is on google search page")
    public void user_is_on_google_search_page() {
        driver.get("https://www.google.com/");
    }

    @When("user enter a text in search box")
    public void user_enter_a_text_in_search_box() {
        driver.findElement(By.name("q")).sendKeys("jpetstore");
    }

    @When("hits enter")
    public void hits_enter() {
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
    }

    @Then("user is navigate to search results")
    public void user_is_navigate_to_search_results() {
        System.out.println("The page will be displayed succesfully");
        driver.quit();
    }
}