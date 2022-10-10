package UI;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Talentlms {
    @Test
    public void test2() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.talentlms.com/");

        WebElement loginInput = driver.findElement(By.xpath("//a[@class='nav-link has-xs-font-size login-btn']"));
        loginInput.click();

        WebElement domainInput = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
        domainInput.sendKeys("tilek");

        WebElement emailInput = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        emailInput.sendKeys("mamatovtilek1");

        WebElement passwordInput = driver.findElement(By.xpath("//input[@class='medium tl-form-password-field']"));
        passwordInput.sendKeys("1202nokia");

        WebElement ok = driver.findElement(By.xpath("//input[@class='btn btn-primary btn-large btn-main-blue tl-main-signup-button']"));
        ok.click();

        WebElement choiceInput = driver.findElement(By.xpath("(//div[@class='tl-onboarding-end-item_content'])[4]"));
        choiceInput.click();

        WebElement userInput = driver.findElement(By.xpath("(//div[@class='tl-bold-link'])[1]"));
        userInput.click();

        WebElement homeInput = driver.findElement(By.xpath("//img[@class='avatar-square']"));
        homeInput.click();

        WebElement coursesInput = driver.findElement(By.xpath("(//div[@class='tl-bold-link'])[2]"));
        coursesInput.click();

        WebElement homeInput1 = driver.findElement(By.xpath("//img[@class='avatar-square']"));
        homeInput1.click();

        WebElement categoriesInput = driver.findElement(By.xpath("(//div[@class='tl-bold-link'])[3]"));
        categoriesInput.click();

        WebElement homeInput2 = driver.findElement(By.xpath("//span[@class='tl-box-title-options']"));
        homeInput2.click();

        WebElement groupsInput = driver.findElement(By.xpath("(//div[@class='tl-bold-link'])[4]"));
        groupsInput.click();

        WebElement homeInput3 = driver.findElement(By.xpath("//img[@class='avatar-square']"));
        homeInput3.click();

        WebElement branchesInput = driver.findElement(By.xpath("(//div[@class='tl-bold-link'])[5]"));
        branchesInput.click();

        WebElement homeInput4 = driver.findElement(By.xpath("//img[@class='avatar-square']"));
        homeInput4.click();

        WebElement eventsEngine = driver.findElement(By.xpath("(//div[@class='tl-bold-link'])[6]"));
        eventsEngine.click();

        WebElement homeInput5 = driver.findElement(By.xpath("//img[@class='avatar-square']"));
        homeInput5.click();

        WebElement userType = driver.findElement(By.xpath("(//div[@class='tl-bold-link'])[7]"));
        userType.click();

        WebElement homeInput6 = driver.findElement(By.xpath("//span[@class='tl-box-title-options']"));
        homeInput6.click();

        WebElement importExport = driver.findElement(By.xpath("(//div[@class='tl-bold-link'])[8]"));
        importExport.click();

        WebElement homeInput7 = driver.findElement(By.xpath("//span[@class='tl-box-title-options']"));
        homeInput7.click();

        WebElement reportsInput = driver.findElement(By.xpath("//i[@class='icon-chart-pie tl-icon-stack-content']"));
        reportsInput.click();

        WebElement homeInput8 = driver.findElement(By.xpath("//img[@class='avatar-square']"));
        homeInput8.click();

        WebElement accountSettingInput = driver.findElement(By.xpath("(//div[@class='tl-bold-link'])[10]"));
        accountSettingInput.click();

        WebElement homeInput9 = driver.findElement(By.xpath("//img[@class='avatar-square']"));
        homeInput9.click();


    }
}
