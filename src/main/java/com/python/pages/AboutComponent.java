package com.python.pages;

import com.python.locators.AboutComponentLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AboutComponent extends BasePage{

    public AboutComponent(WebDriver driver) {
        super(driver);
    }

    public WebElement getAboutField() {
        waitForElementToAppear(AboutComponentLocators.TEXT_FIELD.getPath());
        return driver.findElement(AboutComponentLocators.TEXT_FIELD.getPath());
    }

    public String getAboutFieldText() {
        return getAboutField().getText();
    }
}
