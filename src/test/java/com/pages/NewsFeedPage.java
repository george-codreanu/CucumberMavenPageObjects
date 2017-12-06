package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewsFeedPage extends Base {


    public NewsFeedPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//*[@id=\"u_0_a\"]/div[1]/div[1]/div/a/span/span")
    WebElement accountName;


    public void isOnNewsFeedPage(){
        //System.out.println(accountName);
        System.out.println(accountName.getText().equals("George"));
    }







}
