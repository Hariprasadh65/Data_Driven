package com.apply.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myaccount_Store {
	
	public WebDriver driver;
	
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement dresses;
	
	public Myaccount_Store(WebDriver driver2) {

	this.driver=driver2;
	
	PageFactory.initElements(driver, this);	
	}

	public WebElement getDresses() {
		return dresses;
	}

	public WebElement getCasual() {
		return casual;
	}

	@FindBy(xpath="(//a[@title='Casual Dresses'])[2]")
	private WebElement casual;
	
	
}
