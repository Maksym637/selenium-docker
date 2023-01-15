package com.python;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

import static com.python.constants.Constant.Hosts.DOCKER_HOST;
import static com.python.constants.Constant.Urls.HOME_PAGE;

public class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void setUpDriver() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName(Browser.EDGE.browserName());

        driver = new RemoteWebDriver(new URL(DOCKER_HOST), capabilities);
        driver.manage().window().maximize();
        driver.get(HOME_PAGE);
    }

    @AfterClass
    public void tearDownDriver() {
        if (driver != null) {
            driver.manage().deleteAllCookies();
            driver.quit();
        }
    }
}
