package com.stepdefs;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

public class CommonStepDefs {

	private Context context;
	String environment;


	@Given("^that i am on the \"([^\"]*)\" environment$")
	public void setEnvironment(String desiredEnvironment) throws Throwable {
		environment = desiredEnvironment;
		System.out.println(environment);
	}

	public String getEnvironment(){
		return environment;
	}

	public void accessURL(WebDriver driver, String url){
		System.out.println(driver);
		driver.manage().window().maximize();
		driver.get(url);
	}

}
