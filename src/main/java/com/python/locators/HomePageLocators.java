package com.python.locators;

import org.openqa.selenium.By;

public enum HomePageLocators {

    ABOUT_BUTTON(By.id("about"));

    private final By path;

    HomePageLocators(By path) {
        this.path = path;
    }

    public By getPath() {
        return path;
    }
}
