package com.talentlms.UI.pagesObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewUserPages extends BasePage{
    @FindBy(xpath = "//input[@id='217779736']")
    WebElement firstNameInputField;
    @FindBy(xpath = "//input[@id='1720109888']")
    WebElement lastNameInputField;
    @FindBy(xpath = "//input[@name='email']")
    WebElement inputEmailAddress;
    @FindBy(xpath = "//input[@name='login']")
    WebElement inputUserName;
    @FindBy(xpath = "//input[@name='password']")
    WebElement inputPassword;
    public AddNewUserPages inputFirstName(String firstName){
        helper.sendKeys(firstNameInputField,firstName);
        return this;
    }
    public AddNewUserPages inputLastName(String lastName){
        helper.sendKeys(lastNameInputField,lastName);
        return this;
    }
    public AddNewUserPages inputEmailAddress(String email){
        helper.sendKeys(inputEmailAddress,email);
        return this;
    }
    public AddNewUserPages inputUserName(String userName){
        helper.sendKeys(inputUserName,userName);
        return this;
    }
    public AddNewUserPages inputPassword(String password){
        helper.sendKeys(inputPassword,password);
        return this;
    }
}
