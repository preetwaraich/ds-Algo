package pom.pageFactory.testRunner;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.driverFactory.DriverFactory;
import pom.pageFactory.pageObject.GetStartedPage;
import pom.pageFactory.pageObject.GraphPage;
import pom.pageFactory.pageObject.HomePage;
import pom.pageFactory.pageObject.RegisterPage;
import utilities.ConfigReader;

public class RegistrationTest_POM {
	
	WebDriver driver;
	GetStartedPage gsp;
	HomePage hp;
	RegisterPage rp;

	@BeforeTest
		public void setupTest() {
		driver=DriverFactory.getDriverForChrome_MultipleClasses();
		driver.get(ConfigReader.getApplicationUrl());
		
	}
	
	@Test(groups= {"Smoke","Page"},priority = 1,description = "Opening Home URL")
	public void OpenHomeURL() {
		if(driver==null)
		driver=DriverFactory.getDriverForChrome_MultipleClasses();
	}
	
	@Test(groups= {"Smoke","Page"},priority = 2,description = "Loading Applicaton Home Page")
	public void LoadAppHome() {
		driver.get(ConfigReader.getApplicationUrl());
	}
	
	@Test(groups= {"Smoke","Page"},priority = 3)
	public void ClickGetStarted() {
		gsp = new GetStartedPage(driver);
		gsp.clickGetStarted_btn();

	}
	
	@Test(groups= {"Smoke","Page"},priority = 4)
	public void ClickRegisterLink() {
		hp = new HomePage(driver);
		hp.clickRegister();

	}
	

	@Test(groups= {"Smoke","Page"},priority = 6)
	public void registerInvalidUserNameTest() {
		rp = new RegisterPage(driver);
		rp.enterUsername(ConfigReader.getStringValue("reg_invalid_Username"));
		rp.enterPassword(ConfigReader.getStringValue("reg_valid_Password"));
		rp.enterconfirmPassword(ConfigReader.getStringValue("reg_valid_Password"));
		rp.clickRegisterButton();
		System.out.println(rp.getErrorMsg());
	}
	
	@Test(groups= {"Smoke","Page"},priority = 7)
	public void registerPasswordMismatchTest() {
		rp = new RegisterPage(driver);
		rp.enterUsername(ConfigReader.getStringValue("username"));
		rp.enterPassword(ConfigReader.getStringValue("password"));
		rp.enterconfirmPassword(ConfigReader.getStringValue("mismatchedPassword"));
		rp.clickRegisterButton();
		System.out.println(rp.getErrorMsg());
	}
		
	@Test(groups= {"Page"},priority = 8)
	public void registerUserPositiveTest() {

		rp = new RegisterPage(driver);
		rp.enterUsername(RandomStringUtils.random(8, true, true));
		rp.enterPassword(ConfigReader.getStringValue("password"));
		rp.enterconfirmPassword(ConfigReader.getStringValue("password"));
		rp.clickRegisterButton();
		//driver.get("https://dsportalapp.herokuapp.com");
		//gsp.clickGetStarted_btn();
	}
	
	
	@Test(groups= {"Page"},priority = 9)
	public void ClickSignOutLink() {
		hp = new HomePage(driver);
		hp.clickSignOutLink();

	}
	
	
	@Test(groups= {"Page"},priority = 10)
	public void closeDriver() {
		//driver.close();
		driver.quit();
	}
	

}
