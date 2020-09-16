package com.test.qa.pageobjects.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.test.qa.pageobjects.utils.PageBase;

/**
 * LoginSecurePage.java - class to verify LoginSecure Page functions Created by
 * SrirankanK on 10/3/2018.
 */
public class LoginSecurePage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(LoginSecurePage.class);
    private static By Logoutbtn=By.xpath("//*[@id=\"content\"]/div/a/i");
    private static By Securepage=By.xpath("//*[@id=\"content\"]/div/h2");
    private static By LoginAlert=By.xpath("//*[@id=\"flash\"]");

    public static void clickLogout() {
        getDriver().findElement(Logoutbtn).click();
    }
    public static String getLoginAlert() {
        waiTillVisible(LoginAlert, 10);
        return getDriver().findElement(LoginAlert).getText();
    }
    public static boolean isLoginSecurePageDisplayed() {
        return getDriver().findElement(Securepage).isDisplayed();
    }
    public static boolean isLoginAlertDisplayed() {
        return getDriver().findElement(LoginAlert).isDisplayed();
    }
}
