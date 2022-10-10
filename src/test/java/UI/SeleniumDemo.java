package UI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.sql.Driver;
import java.time.Duration;

public class SeleniumDemo {

//    String name = "Tilek";
//    String email = "mamatovtilek1@gmail.com";
//    String address = "Bishkek";
//    String permanentAddress = "Ak Orgo";
//
//    @Test
//    public void test(){
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//
//        driver.manage().window().minimize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        driver.get("https://demoqa.com/text-box");
//
////        driver.findElement(By.name("q")).sendKeys("Apple");
////        driver.findElement(By.className("gNO89b")).click();
////        driver.findElement(By.id("")).click();
//
//        WebElement fullName = driver.findElement(By.id("userName"));
////        fullName.sendKeys("Tilek");
//        fullName.sendKeys(name);
//
//        String actualNameResult = fullName.getText();
//
//        WebElement emailInput = driver.findElement(By.id("userEmail"));
////        emailInput.sendKeys("mamatovtilek1@gmail.com");
//        emailInput.sendKeys(email);
//
//        WebElement currentAddressInput = driver.findElement(By.id("currentAddress"));
////        currentAddressInput.sendKeys("Bishkek");
//        currentAddressInput.sendKeys((address));
//
//        WebElement permanentAddressInput = driver.findElement(By.id("permanentAddress"));
////        permanentAddressInput.sendKeys("Ak-Orgo");
//        permanentAddressInput.sendKeys(permanentAddress);
//
//        WebElement button = driver.findElement(By.id("submit"));
////        Actions actions = new Actions(driver);
////        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
//
//        button.click();
//
//        WebElement idName = driver.findElement(By.id("userName"));
//        Assertions.assertEquals(name,idName.getText());
//
//
//    }

//    @Test
//    public void xpathTest(){
//
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//
//        driver.manage().window().minimize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        driver.get("https://demoqa.com/text-box");
//
//        WebElement fullNameInputField = driver.findElement(By.xpath("//input[@placeholder=\"Full Name\"]"));
//        fullNameInputField.sendKeys("Tilek");
//
//        WebElement emailInputFiel = driver.findElement(By.xpath("//input[@id=\"userEmail\"]"));
//        emailInputFiel.sendKeys("mamatovtilek1@gmail.com");
//
//        WebElement currentAddressInputField = driver.findElement(By.xpath("(//textarea[@class='form-control'])[1]"));
//        currentAddressInputField.sendKeys("Bishkek");
//
//
//        WebElement permanentAddressInputField = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
//        permanentAddressInputField.sendKeys("Ak-Orgo");
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,250)", "");
//
//
//        WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
//        submitButton.click();

   // }

//    @Test
//    public void test1(){
//
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//
//        driver.manage().window().maximize();
//       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        driver.get("https://demoqa.com/automation-practice-form");
//
//        WebElement firstNameInputField = driver.findElement(By.xpath("//input[@id='firstName']"));
//        firstNameInputField.sendKeys("Tilek");
//
//        WebElement lastNameInputField = driver.findElement(By.xpath("(//input[@class=' mr-sm-2 form-control'])[2]"));
//        lastNameInputField.sendKeys("Mamatov");
//
//        WebElement emailInputField = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
//        emailInputField.sendKeys("mamatovtilek1@gmail.com");
//
//        WebElement genderInputField = driver.findElement(By.xpath("//label[@class='custom-control-label'][1]"));
//        genderInputField.click();
//
//        WebElement mobileNumberInput = driver.findElement(By.xpath("(//input[@class=\" mr-sm-2 form-control\"])[3]"));
//        mobileNumberInput.sendKeys("0700071169");
//
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,250)", "");
//
//        WebElement dateOfBirth = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
//        dateOfBirth.sendKeys(Keys.BACK_SPACE);
//        dateOfBirth.sendKeys(Keys.BACK_SPACE);
//        dateOfBirth.sendKeys("00");
//        genderInputField.click();
//
//        WebElement subjectInput = driver.findElement(By.xpath("//div[@class=\"subjects-auto-complete__control css-yk16xz-control\"]"));
//        subjectInput.sendKeys("Ma");
//        subjectInput.sendKeys(Keys.ENTER);
//
//
//        WebElement hobbiesSport = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[4]"));
//        hobbiesSport.click();
//
//        WebElement hobbiesReading = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[5]"));
//        hobbiesReading.click();
//
//        WebElement hobbiesMusic = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[6]"));
//        hobbiesMusic.click();
//
//        WebElement pictureInput = driver.findElement(By.xpath("///input[@class='form-control-file']"));
//        pictureInput.sendKeys("C:\\Users\\Tilek\\Desktop\\картинки\\UFC.png");
//
//        driver.quit();
//
//
//
//
//
//
//
//
//
//    }
    @Test
    public void nambaTest(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().minimize();

        driver.get("https://nambafood.kg/?language=ru");

//        WebElement vhodInput = driver.findElement(By.xpath("//a[@id='login--button-menu-item']"));
//        vhodInput.click();

        WebElement foodInput = driver.findElement(By.xpath("//a[@class='home--cat-item food']"));
        foodInput.click();

        WebElement sushiInput = driver.findElement(By.xpath("//img[@src='/image/468x318/39368.png']"));
        sushiInput.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");

        WebElement ninjaSushiInput = driver.findElement(By.xpath("//div[@class='cafe--name']"));
        ninjaSushiInput.click();

        WebElement rollyKrabInput = driver.findElement(By.xpath("(//button[@class='status active bay_item'])[19]"));
        rollyKrabInput.click();
    }

}
