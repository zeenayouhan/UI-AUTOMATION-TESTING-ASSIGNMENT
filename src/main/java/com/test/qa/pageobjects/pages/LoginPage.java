package com.test.qa.pageobjects.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.test.qa.pageobjects.utils.PageBase;

/**
 * LoginPage.java - class to verify Login Page functions Created by SrirankanK
 * on 10/3/2018.
 */
public class LoginPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(LoginPage.class);

    private static By usernametxt = By.id("username");
    private static By passwordtxt = By.id("password");
    private static By submitbtn= By.xpath("//*[@id=\"login\"]/button/i");
    private static By invalidmsg=By.id("flash");
    private static By loginPage=By.xpath("//*[@id=\"content\"]/div/h2");
    private static By LogoutAlert=By.xpath("//*[@id=\"flash\"]");


    public static void setUsernamePassword(String username,String password) {
        getDriver().findElement(usernametxt).sendKeys(username);
        getDriver().findElement(passwordtxt).sendKeys(password);
    }


    public static void clickLogin() {
        getDriver().findElement(submitbtn).click();
    }



    public static boolean isLoginPageDisplayed(){
        return getDriver().findElement(loginPage).isDisplayed();

    }
    public static boolean isInvalidAlertDisplayed(){
        return getDriver().findElement(invalidmsg).isDisplayed();

    }

    public static String getLogoutAlert() {
        waiTillVisible(LogoutAlert, 10);
        return getDriver().findElement(LogoutAlert).getText();
    }
    public static String getInvalidAlert() {
        waiTillVisible(invalidmsg, 10);
        return getDriver().findElement(invalidmsg).getText();
    }

    public static boolean isLogoutAlertDisplayed() {
        return getDriver().findElement(LogoutAlert).isDisplayed();
    }


}
