package com.ait.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class HomeWork1 {
    WebDriver driver;

    @BeforeMethod
    public void SetUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
   public void findElementByTagName(){
        WebElement title = driver.findElement(By.tagName("h3"));
        System.out.println(title.getText());
        WebElement img = driver.findElement(By.tagName("img"));
        System.out.println(img);

        List<WebElement> list = driver.findElements(By.tagName("li"));
        System.out.println(list.size());
        List<WebElement> link = driver.findElements(By.tagName("a"));
        System.out.println(link.size());

    }
@Test
    public void findElementById(){
        driver.findElement(By.id("small-searchterms"));
    }

    @Test
    public void findElementByClassName(){
        WebElement footer = driver.findElement(By.className("footer-disclaimer"));
        System.out.println(footer.getText());

    }

    @Test
    public void findElementByLinkText(){
        WebElement linkText = driver.findElement(By.linkText("Gift Cards"));
        System.out.println(linkText.getText());

        WebElement element = driver.findElement(By.linkText("Tricentis"));
        System.out.println(element.getText());
    }

    @Test
    public void findElementByPartiaLinkText(){
        WebElement partLinkText = driver.findElement(By.partialLinkText("all"));
        System.out.println(partLinkText.getText());

        WebElement partLinkText2 = driver.findElement(By.partialLinkText("cart"));
        System.out.println(partLinkText2.getText());
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
