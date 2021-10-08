package com.ea;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstAutomationTest {
    //We should add @Test annotation that JUnit will run below method
    @Test
    //Start to write our test method.
    public void swTestAcademyTitleTest() {
        //Set Property for chrome driver
        WebDriverManager.chromedriver().setup();
        //Step 1- Driver Instantiation: Instantiate driver object as ChromeDriver
        WebDriver driver = new ChromeDriver();
        //Step 2- Navigation: Open a website
        driver.navigate().to("https://www.swtestacademy.com/");
        //Step 3- Assertion: Check its title is correct
        //assertEquals method Parameters: Expected Value, Actual Value, Assertion Message
        assertEquals("Software Test Academy", driver.getTitle(), "Title check failed!");
        //Step 4- Close Driver
        driver.close();
        //Step 5- Quit Driver
        driver.quit();
    }
}