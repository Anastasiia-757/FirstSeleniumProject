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

public class Hw3ByXpath {
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
    public void findElementByTagNameByXpath(){
        //WebElement title = driver.findElement(By.cssSelector("h3"));
        WebElement title = driver.findElement(By.xpath("//h3"));
        System.out.println(title.getText());

        //WebElement img = driver.findElement(By.cssSelector("img"));
        WebElement img = driver.findElement(By.xpath("//img"));
        System.out.println(img);

        //List<WebElement> list = driver.findElements(By.cssSelector("li"));
        List<WebElement> list = driver.findElements(By.xpath("//li"));
        System.out.println(list.size());

        //List<WebElement> link = driver.findElements(By.cssSelector("a"));
        List<WebElement> link = driver.findElements(By.xpath("//a"));
        System.out.println(link.size());
    }

    @Test
    public void findElementByIdByXpath(){
        //driver.findElement(By.cssSelector("#small-searchterms"));
        driver.findElement(By.xpath("//*[@id='small-searchterms']"));
    }

    @Test
    public void findElementByClassNameByXpath(){
        //WebElement footer = driver.findElement(By.cssSelector(".footer-disclaimer"));
        WebElement footer = driver.findElement(By.xpath("//*[@class='footer-disclaimer']"));
        System.out.println(footer.getText());
    }

    @Test
    public void findElementByLinkTextByXpsth(){
        //WebElement linkText = driver.findElement(By.cssSelector("[href='/gift-cards']"));
        WebElement linkText = driver.findElement(By.xpath("//*[@href='/gift-cards']"));
        System.out.println(linkText.getText());

        //WebElement element = driver.findElement(By.cssSelector("[href='http://www.nopcommerce.com/']"));
        WebElement element = driver.findElement(By.xpath("//*[@href='http://www.nopcommerce.com/']"));
        System.out.println(element.getText());
    }

    @Test
    public void findElementByPartiaLinkTextByXpath(){
        //WebElement partLinkText = driver.findElement(By.cssSelector("[class*='all']"));
        WebElement partLinkText = driver.findElement(By.xpath("//a[contains(text(),'all')]"));
        System.out.println(partLinkText.getText());

        //WebElement partLinkText2 = driver.findElement(By.cssSelector("[class*='cart']"));
        WebElement partLinkText2 = driver.findElement(By.xpath("//span[contains(text(),'cart')]"));
        System.out.println(partLinkText2.getText());
    }

}
