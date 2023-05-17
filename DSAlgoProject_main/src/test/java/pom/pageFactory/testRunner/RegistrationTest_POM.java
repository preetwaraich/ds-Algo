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

public class RegistrationTest_POM {
	
	WebDriver driver;
	GetStartedPage gsp;
	HomePage hp;
	RegisterPage rp;

	@BeforeTest
		public void setupTest() {
		driver=DriverFactory.getDriverForChrome_MultipleClasses();
		driver.get("https://dsportalapp.herokuapp.com");
		
	}
	
	@Test(groups= {"Smoke","Page"},priority = 1)
	public void OpenHomeURL() {
		if(driver==null)
		driver=DriverFactory.getDriverForChrome_MultipleClasses();
	}
	
	@Test(groups= {"Smoke","Page"},priority = 2)
	public void LoadAppHome() {
		driver.get("https://dsportalapp.herokuapp.com");
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
	
	
	@Test(groups= {"Smoke","Page"},priority = 5)
	public void registerUserNegativeTest() {
		rp = new RegisterPage(driver);
		rp.enterUsername("Login1234");
		rp.enterPassword("Login1234");
		rp.enterconfirmPassword("Login1234");
		rp.clickRegisterButton();
		System.out.println(rp.getErrorMsg());
	}

	
		
	@Test(groups= {"Smoke","Page"},priority = 7)
	public void registerUserPositiveTest() {

		rp = new RegisterPage(driver);
		rp.enterUsername(RandomStringUtils.random(8, true, true));
		rp.enterPassword("Login1234");
		rp.enterconfirmPassword("Login1234");
		rp.clickRegisterButton();
		//driver.get("https://dsportalapp.herokuapp.com");
		//gsp.clickGetStarted_btn();
	}
	
	
	@Test(groups= {"Smoke","Page"},priority = 9)
	public void ClickSignOutLink() {
		hp = new HomePage(driver);
		hp.clickSignOutLink();

	}
	
	
	@Test(groups= {"Page"},priority = 10)
	public void closeDriver() {
		driver.close();
		driver.quit();
	}
	

}
