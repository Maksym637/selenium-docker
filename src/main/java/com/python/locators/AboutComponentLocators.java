package com.python.locators;

import org.openqa.selenium.By;

public enum AboutComponentLocators {

    TEXT_FIELD(By.xpath("(//h2[@class='widget-title'])[1]"));

    private final By path;

    AboutComponentLocators(By path) {
        this.path = path;
    }

    public By getPath() {
        return path;
    }
}
