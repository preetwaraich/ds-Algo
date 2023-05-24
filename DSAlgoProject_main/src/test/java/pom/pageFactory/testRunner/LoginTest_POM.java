package pom.pageFactory.testRunner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.driverFactory.DriverFactory;
import pom.pageFactory.pageObject.GetStartedPage;
import pom.pageFactory.pageObject.HomePage;
import pom.pageFactory.pageObject.SignInPage;
import utilities.ConfigReader;
import utilities.Sleep;

public class LoginTest_POM {

	private static WebDriver driver;
	GetStartedPage gsp;
	HomePage hp;
	SignInPage sip;

	@BeforeTest
	public void setupTest() {
		driver=DriverFactory.getDriverForChrome_MultipleClasses();
		Sleep.sleep();

	}
	
	@Test(groups= {"Smoke","Page"},priority = 1)
	public void OpenHomeURL() {
		if(driver==null)
		driver=DriverFactory.getDriverForChrome_MultipleClasses();
	}
	
	@Test(groups= {"Page"},priority = 2)
	public void LoadAppHome() {
		driver.get(ConfigReader.getApplicationUrl());
	}

	@Test(groups= {"Page"},priority = 3)
	public void ClickGetStarted() {
		gsp = new GetStartedPage(driver);
		gsp.clickGetStarted_btn();

	}
	
	@Test(groups= {"Smoke","Page"},priority = 4)
	public void ClickSignInLink() {
		hp = new HomePage(driver);
		hp.clickSignInLink();

	}

	@Test(groups= {"Smoke","Page"},priority = 5)
	public void LoginNegativeTest() {
		sip = new SignInPage(driver);
		sip.enterUsername(ConfigReader.getStringValue("wrong_user_name"));
		sip.enterPassword(ConfigReader.getStringValue("password"));
		sip.clickLogin();

		System.out.println(sip.getErrorMsg());
	}



	@Test(groups= {"Smoke","Page"},priority = 6)
	public void UserPositiveTest() {

		sip = new SignInPage(driver);
		sip.enterUsername(ConfigReader.getStringValue("username"));
		sip.enterPassword(ConfigReader.getStringValue("password"));
		sip.clickLogin();
	}

	@AfterTest
	public void closeDriver() {
		//driver.close();
		//driver.quit();
	}



}
