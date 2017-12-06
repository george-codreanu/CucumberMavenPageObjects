package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Base {

        @FindBy(id="loginbutton")
        WebElement loginButton;


    public LoginPage(WebDriver driver) {
        super(driver);
    }


        @FindBy(id = "email")
        WebElement emailField;

        @FindBy(id = "pass")
        WebElement passField;


        public void fillUserField(String user){
            emailField.clear();
            emailField.sendKeys(user);
        }

        public void fillPassField(String pass){
            passField.clear();
            passField.sendKeys(pass);
        }

        public void clickLogin(){
            loginButton.click();
        }

}
