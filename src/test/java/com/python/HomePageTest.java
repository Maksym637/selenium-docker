package com.python;

import com.python.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void getAboutDescription() {
        HomePage homePage = new HomePage(driver);

        String aboutText = homePage
                .clickAboutButton()
                .getAboutFieldText();

        Assert.assertEquals(aboutText, "Getting Started");
    }
}
