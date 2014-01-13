package com.eviltester.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import sun.jvm.hotspot.utilities.Assert;

public class MyFirstTest {

    @Test
    public void startWebdriver(){

        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://seleniumsimplified.com");
                             // http://seleniumsimplified.com/



        Assert.assertTrue("Title should start differently",
                driver.getTitle().startsWith("Selenium Simplified"));

        driver.close();   //if close() doesn't shut down the browser use quit() intstead. Bug in some versions of firefox


    }

}



