package com.testng.naveen;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicTestNG {
	
	/* What is TestNG?
	 * 
	 */
	
	/*
	 * Setup environment for Chrome
	 * launch chrome Browser
	 * enter URL
	 * login method
	 * Google title test
	 * logOut from app
	 * quit the browser
 	 * close the browsser
	 */
	
	// pre-condition >>> starting with @Before
	@BeforeSuite	//1
	public void setUp() {
		System.out.println("Setup environment for Chrome");
	}
	
	@BeforeTest		//2
	public void launchBrowser() {
		System.out.println("launch chrome Browser");
	}
	
	@BeforeClass	//3
	public void login() {
		System.out.println("enter URL");
	}
	
	
	@BeforeMethod	//4
	public void enterURL() {
		System.out.println("login method");
	}
	
	// test cases >> starting with @Test
	@Test	//5
	public void titleTest() {
		System.out.println("Google title test");
	}
	
	@Test
	public void searchTest() {
		System.out.println("search test");
	}
	
	// post-condition >>> starting with @After
	@AfterMethod	//6
	public void logOut() {
		System.out.println("logOut from app");
	}
	
	@AfterClass		//7	
	public void closeBrowser() {
		System.out.println("close the browsser");
	}
	
	@AfterTest		//8
	public void quitBrowser() {
		System.out.println("quit the browser");
	}
	
	@AfterSuite		//9
	public void generateTestReport() {
		System.out.println("generate test report");
	}
	
	
	
}
