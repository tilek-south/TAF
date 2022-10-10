package alert;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestWindowsHandler {
    WebDriver driver;

    @BeforeEach
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demoqa.com/browser-windows");
    }
    @AfterEach
    public void closeBrowser(){
        driver.close();
        driver.quit();
    }
    @Test
    public void testNewTab(){

        String currentPage = driver.getWindowHandle();

        WebElement newTabButton = driver.findElement(By.xpath("//button[@id='tabButton']"));
        newTabButton.click();

        try{
            Thread.sleep(5000);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        driver.switchTo().window(currentPage);

        try{
            Thread.sleep(5000);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        WebElement newWindows = driver.findElement(By.xpath("//button[@id='windowButton']"));
        newWindows.click();

        try{
            Thread.sleep(5000);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        WebElement newWindowsMessage = driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[2]"));
        newWindowsMessage.click();

    }
}
