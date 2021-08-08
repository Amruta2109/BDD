package com.stepdefs;

import java.util.ArrayList;
import java.util.List;

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

public class DashboradStepdefs {

WebDriver driver ;
ArrayList<String> ActaulCOurse=null;	
	@Before("@dashborad")
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		 driver = new ChromeDriver();
	}
	
	@After("@dashborad")
	public void tearDown() {
		//driver.close();
	}
	
	@Given("^user should be on dahsborad page$")
	public void user_should_be_on_dahsborad_page() throws Throwable {
	driver.get("file:///C:/Users/Amruta/Downloads/Selenium%20Softwares/Offline%20Website/Offline%20Website/pages/examples/dashboard.html");
	}

	@When("^user will create list of courses$")
	public void user_will_create_list_of_courses() throws Throwable {
		List<WebElement> courses = driver.findElements(By.xpath("//h3"));
	     ActaulCOurse = new ArrayList<String>();
	    
	    
	     
	    for(WebElement course:courses) {
	    	String a = course.getText();
	    	ActaulCOurse.add(a);
	    }
	    System.out.println("actual list " +ActaulCOurse );
	}

	
	@Then("^user verify the cources  with expected$")
	public void user_verify_the_cources_with_expected() throws Throwable {
		 ArrayList<String> ExpCOurse = new ArrayList<String>();
		 ExpCOurse.add("Selenium");
		 ExpCOurse.add("Java / J2EE");
		 ExpCOurse.add("Python");
		 ExpCOurse.add("Php");
		 Assert.assertEquals(ActaulCOurse, ExpCOurse);
		// Selenium, Java / J2EE, Python, Php
	}}

