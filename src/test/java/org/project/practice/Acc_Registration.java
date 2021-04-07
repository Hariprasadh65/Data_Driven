package org.project.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Acc_Registration {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hari-Amudha\\eclipse-workspace\\Selenium_Automation_Project\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		WebElement sign = driver.findElement(By.xpath("//a[@class='login']"));
		sign.click();
		
		Thread.sleep(5000);
		
		WebElement mail = driver.findElement(By.id("email_create"));
		mail.sendKeys("hariprasadh@greens.com");
		
		WebElement submit = driver.findElement(By.id("SubmitCreate"));
		submit.click();
		
		Thread.sleep(5000);
		
		WebElement gender = driver.findElement(By.id("id_gender1"));
		gender.click();
		
		WebElement first = driver.findElement(By.id("customer_firstname"));
		first.sendKeys("HariPrasadh");
		
		WebElement last = driver.findElement(By.id("customer_lastname"));
		last.sendKeys("S.muthu");
		
		WebElement pass = driver.findElement(By.name("passwd"));
		pass.sendKeys("hari6595");
		
		WebElement day = driver.findElement(By.id("days"));
		Select s = new Select(day);
		s.selectByValue("6");
		
		WebElement month = driver.findElement(By.id("months"));
		Select s1 = new Select(month);
		s1.selectByValue("5");
		
		WebElement year = driver.findElement(By.name("years"));
		Select s2 = new Select(year);
		s2.selectByValue("1995");
		
		WebElement newscheck= driver.findElement(By.id("newsletter"));
		newscheck.click();
		
		WebElement offercheck = driver.findElement(By.name("optin"));
		offercheck.click();
		
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("HariPrasadh");
	
		WebElement lname = driver.findElement(By.id("lastname"));
		lname.sendKeys("Muthu");
		
		WebElement company = driver.findElement(By.id("company"));
		company.sendKeys("Green Tech");
		
		WebElement add1 = driver.findElement(By.id("address1"));
		add1.sendKeys("15/3/26 amaravathi nagar, Bodinayakanur");
		
		WebElement add2 = driver.findElement(By.id("address2"));
		add2.sendKeys("Theni");
		
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("Chennai");
		
		WebElement state = driver.findElement(By.id("id_state"));
		
		Select s3 = new Select(state);
		s3.selectByVisibleText("Maine");

		WebElement pin = driver.findElement(By.id("postcode"));
		pin.sendKeys("04258");
		
		WebElement country = driver.findElement(By.id("id_country"));
		Select s4 = new Select(country);
		s4.selectByVisibleText("United States");
		
		
		WebElement info = driver.findElement(By.id("other"));
		info.sendKeys("Testing is my Profession");
		
		WebElement phone = driver.findElement(By.name("phone"));
		phone.sendKeys("231687");
		
		WebElement mphone = driver.findElement(By.id("phone_mobile"));
		mphone.sendKeys("1234567890");
		
		WebElement refadd = driver.findElement(By.id("alias"));
		refadd.sendKeys("nerkundram, chennai");
		
		
		WebElement register = driver.findElement(By.id("submitAccount"));
		register.click();
		
		
	}

}
