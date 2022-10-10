package toolsQA;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.beans.beancontext.BeanContext;

public class Test {
    @org.junit.Test
    public void test(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/links");

        WebElement inputHome = driver.findElement(By.xpath("(//a[@target='_blank'])[1]"));
        inputHome.click();

        WebElement formInput = driver.findElement(By.xpath("((//div[@class='card mt-4 top-card'])[2]"));
        formInput.click();
    }
}
