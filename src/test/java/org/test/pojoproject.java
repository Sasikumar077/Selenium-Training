package org.test;

import org.baseclass.baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pojoproject extends baseclass {

	// 1. Non Parameterized Constructor
	public pojoproject() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);

	}

	// 2. private web element
	

	@FindAll({ @FindBy(xpath = "//input[@id='email']"), @FindBy(xpath = "//input[@name='email']"),
			@FindBy(xpath = "//input[@data-testid='royal_email']") })
	private WebElement VarRef;

	@FindBy(xpath = "//input[@aria-label='password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@placeholder='Email address or phone number']")
	private WebElement getEmail; 

	@FindBy(name = "login")
	private WebElement loginBtn;

	// 3. Getters to access webelements outside the class

	public WebElement getVarRef() {
		return VarRef;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}


}
