package com.python;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import static com.python.constants.Constant.TimeoutVariables.IMPLICIT_WAIT;
import static com.python.constants.Constant.Urls.HOME_PAGE;
import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {

    protected WebDriver driver;
    protected ChromeOptions options;

    @BeforeClass
    public void setUpDriver() {
        chromedriver().setup();

        options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
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
