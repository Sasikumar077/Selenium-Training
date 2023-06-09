package org.test;

import java.util.Date;

import org.baseclass.baseclass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class sampletest extends baseclass{
	
	@Test(invocationCount = 3)
	private void tc1() {
		launchUrl("https://en-gb.facebook.com/");
		pojoproject f = new pojoproject();
		passText("seleniuminmakes@gmail.com", f.getPassword());
	}
	
	@Test
	private void tc9() {
		launchUrl("https://www.amazon.in/");
	}
	
	@Test
	private void tc5() {
		launchUrl("https://www.flipkart.com/");
	}

	
	@BeforeMethod
	
	private void startdate() {
		Date e = new Date();
		System.out.println(e);
	}
	
	@AfterMethod
	private void enddate() {
		Date d = new Date();
		
		System.out.println(d);
	}
	
	@BeforeClass
	private void launchthebrowser() {
		launchBrowser();
		windowMaximize();
		System.out.println("Launch the Browser.......");
	}
	
	@AfterClass
	private void closethebrowser() {
		System.out.println("Browser Close.......");
	}
	
}
