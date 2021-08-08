package com.stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefs {

	WebDriver driver = null;
	
	
	// these is hooked tag..before will run befre Login tag
	@Before("@LoginParameter")
	public void setup() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	
	@After("@LoginParameter")
	public void tearDown() {
		driver.close();
	}
	
	@Given("^user should be on login page$")
	public void user_should_be_on_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("file:///C:/Users/Amruta/Downloads/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String uname, String pass) throws Throwable {
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys(uname);
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
	}

	@When("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

	@Then("^user shpuld be o home page$")
	public void user_shpuld_be_o_home_page() throws Throwable {
		
		 String expTitle ="JavaByKiran | Dashboard";
		 Assert.assertEquals(driver.getTitle(),expTitle);
}
	
	@Then("^user should see jbk logo")
	public void user_should_see_jbk_logo() throws Throwable {
		
		 WebElement logo = driver.findElement(By.tagName("img"));
		 Assert.assertTrue(logo.isDisplayed());
}
	
}
	

