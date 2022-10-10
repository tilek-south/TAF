package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TalentlmsDemo {
    WebDriver driver;
    @Given("user clicks on Login button")
    public void user_clicks_on_login_button() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.talentlms.com/");

    }
    @Then("user should see text")
    public void user_should_see_text() {

        WebElement login = driver.findElement(By.xpath("//li[@class='nav-item d-inline-flex menu-item menu-item-type-custom menu-item-object-custom']"));
        login.click();
    }
}
