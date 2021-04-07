package com.apply.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Back_Order {
	public WebDriver driver;
	
	@FindBy(xpath = "//a[@title='Back to orders']")
	private WebElement backorder;

	public Back_Order(WebDriver driver2) {

	this.driver=driver2;
	PageFactory.initElements(driver, this);
	
	}

	public WebElement getBackorder() {
		return backorder;
	}
	
	
	
	
	
	
}
