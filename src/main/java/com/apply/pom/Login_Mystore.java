package com.apply.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Mystore {

	public WebDriver driver;
	
	@FindBy(id="email")
	private WebElement mailid;
	
	public Login_Mystore(WebDriver driver2) {

		this.driver=driver2;
		PageFactory.initElements(driver, this);
	
	}

	public WebElement getMailid() {
		return mailid;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return submit;
	}

	@FindBy(id="passwd")
	private WebElement password;
	
	@FindBy(name="SubmitLogin")
	private WebElement submit;
	
	
	
	
	
	
	
	
	
	
	
	
	
}
