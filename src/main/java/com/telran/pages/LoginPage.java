package com.telran.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

    public LoginPage(WebDriver dr) {
        super(dr);
    }

    @FindBy(id = "userName")
    WebElement userName;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(id = "login")
    WebElement loginButton;


    public ProfilePage login(String uName, String psw) {
        type(userName, uName);
        type(password, psw);
        click(loginButton);
        return new ProfilePage(dr);

    }

    public LoginPage loginNegative(String uName, String psw) {
        type(userName, uName);
        typeWithJSExecutor(password, psw, 0, 200);
        click(loginButton);
        return this;

    }


}
