package com.apply.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Address {
	public WebDriver driver;
	
	@FindBy(name = "processAddress")
	private WebElement checkout;

	public Order_Address(WebDriver driver2) {

		this.driver= driver2;
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getCheckout() {
		return checkout;
	}
	

}
