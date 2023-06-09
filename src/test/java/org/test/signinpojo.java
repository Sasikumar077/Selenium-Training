package org.test;

import org.baseclass.baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signinpojo extends baseclass{
	
	public signinpojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Create new account']")
	private WebElement Createnewaccount;
	
	@FindBy(xpath = "(//input[@type='text']) [2]")
	private WebElement firstname;
	
	@FindBy(name = "lastname")
	private WebElement secondname;
	
	public WebElement getCreatenewaccount() {
		return Createnewaccount;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getSecondname() {
		return secondname;
	}

	public WebElement getMobileoremail() {
		return mobileoremail;
	}

	public WebElement getNewpassword() {
		return newpassword;
	}

	@FindBy(name = "reg_email__")
	private WebElement mobileoremail;
	
	@FindBy(name = "reg_passwd__")
	private WebElement newpassword;
	
	
}
