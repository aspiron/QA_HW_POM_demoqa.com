package com.telran.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    WebDriver dr;

    @BeforeMethod
    public void init() {
        dr = new ChromeDriver();
        dr.manage().window().maximize();
        dr.get("https://demoqa.com/login");
        dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @AfterMethod (enabled = false)
    public void tearDown(){
        dr.quit();
    }
}
