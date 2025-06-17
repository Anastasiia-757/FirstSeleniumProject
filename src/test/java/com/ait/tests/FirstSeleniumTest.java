package com.ait.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstSeleniumTest {

     WebDriver driver;

    //before - setUp

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        //driver.get("https://www.google.com"); - первый вариант, самый частый
        driver.navigate().to("https://www.google.com");
        driver.navigate().back();//backspace/ key back системная кнопка назад
        driver.navigate().forward();//key forward кнопка возвращает вперед
        driver.navigate().refresh();// обновить

    }

    //test
    @Test
    public void openGoogle() {
        System.out.println("Google opened!");
    }

    //after - tearDown
    @AfterMethod(enabled = false)
    public void tearDown() {
        driver.quit();//all tabs&close browser закрывает все вкладки, браузер
        // driver.close(); -only one tab (if tab only one- close browser) альтернатива quit и закрывает одну вкладку

    }
}