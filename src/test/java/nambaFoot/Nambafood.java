package nambaFoot;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nambafood {

    @Test
    public void testNamba(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://nambafood.kg/?language=ru");

        WebElement entrance = driver.findElement(By.xpath("(//*[text()='Войти'])[1]"));
        entrance.click();

        WebElement logInInput = driver.findElement(By.xpath("//a[@id='ui-id-2']"));
        logInInput.click();

        WebElement emailInput = driver.findElement(By.xpath("(//input[@name='sda_user_registration_form[email]'])[1]"));
        emailInput.click();
        emailInput.sendKeys("mamatovtilek1@gmail.com");

        WebElement nameInput = driver.findElement(By.xpath("(//input[@id='sda_user_registration_form_firstname'])[1]"));
        nameInput.click();
        nameInput.sendKeys("Тилек");


        WebElement lastName = driver.findElement(By.xpath("(//input[@id='sda_user_registration_form_lastname'])[1]"));
        lastName.click();
        lastName.sendKeys("Маматов");

        WebElement numberInput = driver.findElement(By.xpath("(//input[@id='sda_user_registration_form_phone'])[1]"));
        numberInput.click();
        numberInput.sendKeys("0700071169");

        WebElement password = driver.findElement(By.xpath("(//input[@placeholder='Укажите пароль'])[1]"));
        password.click();
        password.sendKeys("1202nokia");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");

        WebElement password2 = driver.findElement(By.xpath("(//input[@id='sda_user_registration_form_plainPassword_second'])[1]"));
        password2.click();
        password2.sendKeys("1202nokia");

        WebElement clickOk = driver.findElement(By.xpath("(//label[@for='access-offer'])[1]"));
        clickOk.click();

        driver.quit();

    }
    @Test
    public void test2(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://nambafood.kg/?language=ru");

        WebElement login = driver.findElement(By.xpath("//button[@id='login--button']"));
        login.click();

        WebElement email = driver.findElement(By.xpath("//input[@id=\"username\"]"));
        email.click();
        email.sendKeys("mamatovtilek1@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@id=\"password\"]"));
        password.click();
        password.sendKeys("1202nokia");


        WebElement rememberInput = driver.findElement(By.xpath("//label[@for=\"remember--me\"]"));
        rememberInput.click();

        WebElement submit = driver.findElement(By.xpath("//button[@id=\"_submit\"]"));
        submit.click();



    }
}
