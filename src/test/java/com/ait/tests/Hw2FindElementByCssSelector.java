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

public class Hw2FindElementByCssSelector {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void findElementByCssSelector(){
       // WebElement title = driver.findElement(By.tagName("h3"));
        WebElement title = driver.findElement(By.cssSelector("h3"));
        System.out.println(title.getText());

        //WebElement img = driver.findElement(By.tagName("img"));
        WebElement img = driver.findElement(By.cssSelector("img"));
        System.out.println(img);

        //List<WebElement> list = driver.findElements(By.tagName("li"));
        List<WebElement> list = driver.findElements(By.cssSelector("li"));
        System.out.println(list.size());

        //List<WebElement> link = driver.findElements(By.tagName("a"));
        List<WebElement> link = driver.findElements(By.cssSelector("a"));
        System.out.println(link.size());
    }
    @Test
    public void findElementById(){
        //driver.findElement(By.id("small-searchterms"));
        driver.findElement(By.cssSelector("#small-searchterms"));

    }

    @Test
    public void findElementByClassName(){
        //WebElement footer = driver.findElement(By.className("footer-disclaimer"));
        WebElement footer = driver.findElement(By.cssSelector(".footer-disclaimer"));
        System.out.println(footer.getText());
    }

    @Test
    public void findElementByLinkText(){
        //WebElement linkText = driver.findElement(By.linkText("Gift Cards"));
        WebElement linkText = driver.findElement(By.cssSelector("[href='/gift-cards']"));
        System.out.println(linkText.getText());

        //WebElement element = driver.findElement(By.linkText("nopCommerce"));
        WebElement element = driver.findElement(By.cssSelector("[href='http://www.nopcommerce.com/']"));
        System.out.println(element.getText());
    }

    @Test
    public void findElementByPartiaLinkText(){
        //WebElement partLinkText = driver.findElement(By.partialLinkText("all"));
        WebElement partLinkText = driver.findElement(By.cssSelector("[class*='all']"));
        System.out.println(partLinkText.getText());

        //WebElement partLinkText2 = driver.findElement(By.partialLinkText("cart"));
        WebElement partLinkText2 = driver.findElement(By.cssSelector("[class*='cart']"));
        System.out.println(partLinkText2.getText());
    }
}
