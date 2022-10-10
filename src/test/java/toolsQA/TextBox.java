package toolsQA;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class TextBox {
    @Test
    public void test(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/text-box");

        WebElement fullNameInput = driver.findElement(By.xpath("//input[@id='userName']"));
        fullNameInput.click();
        fullNameInput.sendKeys("Tilek");

        WebElement emailInput = driver.findElement(By.xpath("//input[@class='mr-sm-2 form-control']"));
        emailInput.click();
        emailInput.sendKeys("mamatovtilek1@gmail.com");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");

        WebElement currentAddressInput = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        currentAddressInput.click();
        currentAddressInput.sendKeys("Bishkek");

        WebElement permanentAddressInput = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        permanentAddressInput.click();
        permanentAddressInput.sendKeys("Ak-Orgo");

        WebElement submitInput = driver.findElement(By.xpath("//button[@id='submit']"));
        submitInput.click();

        WebElement checkBox = driver.findElement(By.xpath("(//span[@class='text'])[2]"));
        checkBox.click();

        WebElement homeInput = driver.findElement(By.xpath("//span[@class='rct-title']"));
        homeInput.click();

        WebElement radioButton = driver.findElement(By.xpath("(//span[@class='text'])[3]"));
        radioButton.click();

        WebElement chooseYes = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[1]"));
        chooseYes.click();

        WebElement webElementInput = driver.findElement(By.xpath("(//span[@class='text'])[4]"));
        webElementInput.click();

        WebElement addInput = driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
        addInput.click();

        WebElement firstName = driver.findElement(By.xpath("(//input[@class=' mr-sm-2 form-control'])[1]"));
        firstName.click();
        firstName.sendKeys("Tilek");

        WebElement lastName = driver.findElement(By.xpath("(//input[@class=' mr-sm-2 form-control'])[2]"));
        lastName.click();
        lastName.sendKeys("Mamatov");

        WebElement email = driver.findElement(By.xpath("//input[@class='mr-sm-2 form-control']"));
        email.click();
        email.sendKeys("mamatovtilek1@gmail.com");

        WebElement age = driver.findElement(By.xpath("(//input[@class=' mr-sm-2 form-control'])[3]"));
        age.click();
        age.sendKeys("30");

        WebElement salary = driver.findElement(By.xpath("//input[@id='salary']"));
        salary.click();
        salary.sendKeys("3000");

        WebElement department = driver.findElement(By.xpath("//input[@id='department']"));
        department.click();
        department.sendKeys("IT");

        WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
        submit.click();

        WebElement buttons = driver.findElement(By.xpath("(//span[@class='text'])[5]"));
        buttons.click();

        Actions act = new Actions(driver);
        WebElement doubleClickInput = driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[1]"));
        act.doubleClick(doubleClickInput).perform();


        Actions act1 = new Actions(driver);
        WebElement rightClick = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
        act1.contextClick(rightClick).perform();

        WebElement clickMe = driver.findElement(By.xpath("//button[@id='Su3Ca']"));
        clickMe.click();

        WebElement linksInput = driver.findElement(By.xpath("(//li[@class='btn btn-light '])[5]"));
        linksInput.click();

        WebElement home = driver.findElement(By.xpath("(//div[@class='card-up'])[1]"));
        home.click();



    }
}
