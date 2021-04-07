package com.apply.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Casual_Dress {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[@class='product_img_link']")
	private WebElement casualdress;
	public Casual_Dress(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getCasualdress() {
		return casualdress;
	}
	
	
	
	
	
	
	
	
	
}
