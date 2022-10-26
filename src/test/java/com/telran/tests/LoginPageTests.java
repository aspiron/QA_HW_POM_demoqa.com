package com.telran.tests;

import com.telran.pages.BooksPage;
import com.telran.pages.LoginPage;
import com.telran.pages.ProfilePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions(){
        dr.get("https://demoqa.com");
    }

    @Test
    public void loginPositiveTest() {
        new BooksPage(dr).loginFromSidePanelPath();
        new LoginPage(dr).login("user", "12345qwe!Q");
        new ProfilePage(dr).verifyUserName("user").logout();
    }
}
