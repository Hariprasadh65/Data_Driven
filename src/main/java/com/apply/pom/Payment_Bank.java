package com.apply.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Bank {

	public WebDriver driver;
	
	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement bank;

	public Payment_Bank(WebDriver driver2) {

		this.driver= driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getBank() {
		return bank;
	}
	
	
	
	
	
	
}
