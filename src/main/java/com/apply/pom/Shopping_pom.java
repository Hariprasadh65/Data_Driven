package com.apply.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import com.create.base.Base_Class;

public class Shopping_pom extends Base_Class {

	public static WebDriver driver;

	public static void main(String[] args) throws IOException {

		driver = getbrowser("chrome");
		imwait();

		navigation("goto", "http://automationpractice.com/index.php");

		Home_Page home = new Home_Page(driver);

		click(home.getSigin_Btn());

		Login_Mystore login = new Login_Mystore(driver);

		enterdata(login.getMailid(), "hariprasadh@greens.com");

		enterdata(login.getPassword(), "hari6595");

		click(login.getSubmit());

		Myaccount_Store mac = new Myaccount_Store(driver);

		mousehover(mac.getDresses(), "moveto");
		click(mac.getCasual());

		Casual_Dress c = new Casual_Dress(driver);
		click(c.getCasualdress());

		Casual_Frame cf = new Casual_Frame(driver);
		frame("framein");
		click(cf.getPlus());

		singledropdown(cf.getDresssize(), "byvalue", "2");
		click(cf.getSubmit());

		frame("frameout");

		Adding_Cart ac = new Adding_Cart(driver);
		click(ac.getProceed());

		Summary_Cart sc = new Summary_Cart(driver);
		click(sc.getSummary());

		Order_Address oa = new Order_Address(driver);
		click(oa.getCheckout());

		Shipping_Order so = new Shipping_Order(driver);
		click(so.getShip());
		click(so.getProcess());

		Payment_Bank pb = new Payment_Bank(driver);
		click(pb.getBank());

		Confirmation_Order co = new Confirmation_Order(driver);
		click(co.getConfirm());

		Back_Order bo = new Back_Order(driver);
		click(bo.getBackorder());

		History_Order ho = new History_Order(driver);
		mousehover(ho.getBackbutton(), "moveto");

		screenshot("C:\\Users\\Hari-Amudha\\eclipse-workspace\\Selenium_Task\\Screenshots\\num1.png");

		close();

	}

}
