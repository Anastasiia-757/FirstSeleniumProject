package com.ait.tests.automated.testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{

    @Test
    public void newUserRegistrationPositiveTest(){
        int i = (int)(System.currentTimeMillis()/1000)%3600;

        click(By.cssSelector("[href='/register']"));
        type(By.name("FirstName"), "Katrin");
        type(By.name("LastName"), "Oda");
        type(By.name("Email"), "nottoday1" + i + "@gmail.com");
        type(By.name("Password"), "Qwertz12345!");
        type(By.name("ConfirmPassword"), "Qwertz12345!");

        click(By.name("register-button"));
        Assert.assertTrue(isElementPresent(By.xpath("//*[@href='/logout']")));

    }
}
