package org.project.practice;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.create.base.Base_Class;

public class Shop_BC extends Base_Class {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {

		driver = getbrowser("chrome");

		imwait();

		navigation("goto", "https://www.google.com/");
		
		currenturl();

		getpage("http://automationpractice.com/index.php");

		title();

		navigation("forward", null);
		
		navigation("back", null);
		
		navigation("refresh", null);
		
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		click(signin);

		WebElement mail = driver.findElement(By.id("email"));

		isenable(mail);

		enterdata(mail, "hariprasadh@greens.com");

		WebElement pass = driver.findElement(By.id("passwd"));

		isdisable(pass);

		enterdata(pass, "hari6595");

		WebElement login = driver.findElement(By.id("SubmitLogin"));
		click(login);

		//WebElement ewait = driver.findElement(By.xpath("//a[@class='account']/span"));
		//exwait(ewait);
		
		WebElement dress = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		click(dress);

		WebElement summer = driver.findElement(By.xpath("(//a[@class='subcategory-name'])[3]"));
		click(summer);

		WebElement quick = driver.findElement(By.xpath("(//a[@class='product_img_link'])[1]"));
		click(quick);

		frame("framein");

		WebElement plus = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		click(plus);
		click(plus);

		WebElement drop = driver.findElement(By.id("group_1"));
		isselected(drop);

		singledropdown(drop, "byvalue", "2");

		WebElement color = driver.findElement(By.id("color_11"));
		click(color);

		WebElement submit = driver.findElement(By.xpath("//p[@id='add_to_cart']/button"));
		click(submit);

		frame("frameout");
		
		WebElement check1 = driver.findElement(By.xpath("//a[@title='Proceed to checkout']/span"));
		click(check1);

		WebElement summary = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		click(summary);

		WebElement address = driver.findElement(By.name("processAddress"));
		click(address);

		WebElement chbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		click(chbox);

		WebElement proceed = driver.findElement(By.name("processCarrier"));
		click(proceed);

		WebElement bank = driver.findElement(By.xpath("//a[@class='bankwire']"));
		click(bank);

		WebElement confirm = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		click(confirm);

		WebElement back = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		click(back);

		WebElement mouse = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/a"));
		mousehover(mouse, "moveto");

		screenshot("C:\\Users\\Hari-Amudha\\eclipse-workspace\\Selenium_Automation_Project\\Screenshots\\shop6.png");

		// *******NEXT SHOPPING - BY CHEQUE***********

		WebElement backorder = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/a"));
		click(backorder);

		WebElement dres = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		mousehover(dres, "moveto");

		WebElement evedress = driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[2]"));
		click(evedress);

		WebElement quickview = driver.findElement(By.xpath("(//a[@title='Printed Dress'])[1]"));
		click(quickview);

		frame("framein");

		WebElement qplus = driver
				.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']"));
		click(qplus);

		WebElement dropdown = driver.findElement(By.id("group_1"));

		singledropdown(dropdown, "Byvalue", "3");

		WebElement color2 = driver.findElement(By.id("color_24"));
		click(color2);

		WebElement added = driver.findElement(By.name("Submit"));
		click(added);

		frame("frameout");

		WebElement checkout = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		click(checkout);

		WebElement checkout1 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		click(checkout1);

		WebElement addre = driver.findElement(By.name("processAddress"));
		click(addre);

		WebElement boxcheck = driver.findElement(By.xpath("//input[@type='checkbox']"));
		click(boxcheck);

		WebElement proces = driver.findElement(By.name("processCarrier"));
		click(proces);

		WebElement checkpay = driver.findElement(By.xpath("//a[@title='Pay by check.']"));
		click(checkpay);

		WebElement confirm2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		click(confirm2);

		WebElement back1 = driver.findElement(By.xpath("//a[@title='Back to orders']"));
		click(back1);

		WebElement mouse1 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/a"));
		mousehover(mouse1, "moveto");

		screenshot("C:\\Users\\Hari-Amudha\\eclipse-workspace\\Selenium_Automation_Project\\Screenshots\\shope65.png");

		quit();

	}

}
