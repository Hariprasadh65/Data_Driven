package com.apply.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_Order {

	public WebDriver driver;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement ship;
	
	public Shipping_Order(WebDriver driver2) {

		this.driver= driver2;
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getShip() {
		return ship;
	}

	public WebElement getProcess() {
		return process;
	}

	@FindBy(name = "processCarrier")
	private WebElement process;
	
	
	
	
	
	
	
	
	
	
	
	
}
