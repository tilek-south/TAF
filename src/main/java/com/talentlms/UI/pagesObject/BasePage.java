package com.talentlms.UI.pagesObject;

import com.talentlms.UI.helpersMethods.Helper;
import com.talentlms.UI.driverFactory.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    Helper helper = new Helper();
}
