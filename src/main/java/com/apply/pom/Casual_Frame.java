package com.apply.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Casual_Frame {
	
	public WebDriver driver;

	@FindBy(xpath = "//a[@class='btn btn-default button-plus product_quantity_up']")
	private WebElement plus;
	
	public Casual_Frame(WebDriver driver2) {

	this.driver=driver2;
	PageFactory.initElements(driver, this);
	
	
	}

	public WebElement getPlus() {
		return plus;
	}

	public WebElement getDresssize() {
		return dresssize;
	}

	public WebElement getSubmit() {
		return submit;
	}

	@FindBy(id = "group_1")
	private WebElement dresssize;
	
	@FindBy(name = "Submit")
	private WebElement submit;
	
		
}
