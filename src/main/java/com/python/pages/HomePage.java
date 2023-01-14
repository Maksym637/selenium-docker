package com.python.pages;

import com.python.locators.HomePageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getAboutButton() {
        waitForElementToBeClickable(HomePageLocators.ABOUT_BUTTON.getPath());
        return driver.findElement(HomePageLocators.ABOUT_BUTTON.getPath());
    }

    public AboutComponent clickAboutButton() {
        getAboutButton().click();
        return new AboutComponent(driver);
    }
}
