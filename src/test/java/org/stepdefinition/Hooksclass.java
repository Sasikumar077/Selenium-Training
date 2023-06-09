package org.stepdefinition;

import org.baseclass.baseclass;
import org.junit.After;

import cucumber.api.java.Before;

public class Hooksclass extends baseclass{

	@Before
	//precondition
	private void precondition() {
		launchBrowser();
		windowMaximize();
		
	}
	
	
	@After
	//postcondition
	
	private void postcondition() {
		closeEntireBrowser();
		
		
	}
	
}
