package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1Demo {
    WebDriver driver;

    @Given("user is on {string} web page")
    public void user_is_on_web_page(String url) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @Given("user clicks on Elements button")
    public void user_clicks_on_elements_button() {
        WebElement element = driver.findElement(By.xpath("(//div[@class='avatar mx-auto white'])[1]"));
        element.click();
    }

    @Given("user clicks on Text Box button")
    public void user_clicks_on_text_box_button() {
        WebElement texBox = driver.findElement(By.xpath("(//span[@class='text'])[1]"));
        texBox.click();
    }

    @Then("user should see text {string}")
    public void user_should_see_text(String expectedTex) {
        WebElement text = driver.findElement(By.xpath("(//label[@class='form-label'])[1]"));
        text.click();
    }
}
