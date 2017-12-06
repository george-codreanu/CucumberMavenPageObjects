package com.stepdefs;

import com.pages.LoginPage;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

public class LoginSteps{


    private Context context;
    WebDriver driver;
    public LoginSteps(Context context) {
        this.context = context;
    }


    @Given("^I log in using \"([^\"]*)\" as username and \"([^\"]*)\" credentials$")
    public void loginWithCredentials(String user, String pass) throws Throwable {

        driver=context.getDriver();

        LoginPage lp = new LoginPage(driver);
        CommonStepDefs CSD = new CommonStepDefs();

        CSD.accessURL(driver,"https://www.facebook.com/");

        switch (user){
            case "valid":
                lp.fillUserField(DataItems.validUser);
                break;
        }

        switch (pass){
            case "valid":
                lp.fillPassField(DataItems.validPass);
        }

        lp.clickLogin();


    }



}
