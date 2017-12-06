package com.stepdefs;

import com.pages.NewsFeedPage;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;

public class NewsFeedSteps {

    private Context context;
    WebDriver driver;
    public NewsFeedSteps(Context context) {
        this.context = context;
    }


    @Then("^i \"([^\"]*)\" be redirected to news feed$")
    public void isUserOnNewsFeedPage(String outcome) throws Throwable {
        NewsFeedPage nfp = new NewsFeedPage(driver);
      switch (outcome){
          case "will":
              nfp.isOnNewsFeedPage();
             // Assert.assertTrue("User is not on news Page",nfp.isOnNewsFeedPage());
      }
    }



}
