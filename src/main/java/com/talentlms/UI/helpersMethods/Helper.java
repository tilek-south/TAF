package com.talentlms.UI.helpersMethods;

import com.talentlms.UI.driverFactory.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Helper {

    public Helper waitElementTwoBeClickable(WebElement element){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(element));
        return this;
    }

    public Helper waitElementTwoBeDisplayed(WebElement element){
        new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(element));
        return this;
    }
    public Helper click(WebElement element){
        waitElementTwoBeDisplayed(element);
        waitElementTwoBeClickable(element);
        element.click();
        return this;
    }
    public Helper sendKeys(WebElement element, String str){
        waitElementTwoBeDisplayed(element);
        element.sendKeys(str);
        return this;
    }

    public String getText(WebElement element) {
        return element.getText();
    }
}
