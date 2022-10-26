package com.telran.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BooksPage extends PageBase{
    public BooksPage(WebDriver dr) {
        super(dr);
    }

    @FindBy(xpath = "//*[@class='card mt-4 top-card'][6]")
    WebElement bookStoreAppButton;

    @FindBy(xpath = "//*[@class='text' and text()='Login']")
    WebElement loginButtonFromSidePanel;

    public void loginFromSidePanelPath(){
        new BooksPage(dr).bookStoreAppButton.click();
        new BooksPage(dr).loginButtonFromSidePanel.click();

    }
}
