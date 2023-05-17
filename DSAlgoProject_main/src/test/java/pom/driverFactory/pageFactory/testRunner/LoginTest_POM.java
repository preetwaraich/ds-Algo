package pom.driverFactory.pageFactory.testRunner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.driverFactory.DriverFactory;
import pom.pageFactory.pageObject.GetStartedPage;
import pom.pageFactory.pageObject.HomePage;
import pom.pageFactory.pageObject.SignInPage;
import utilities.Sleep;

public class LoginTest_POM {
	
	private static WebDriver driver = null;
	
	GetStartedPage gsp;
	HomePage hp;
	SignInPage sip;

	@BeforeTest
	public void setupTest() {
		driver=DriverFactory.getDriverForBrowser("Chrome");
		driver.get("https://dsportalapp.herokuapp.com");
		Sleep.sleep(2000);
		
	}
	
	@Test
	public void LoginNegativeTest() {
		gsp = new GetStartedPage(driver);
		hp = new HomePage(driver);
		sip = new SignInPage(driver);
		
		gsp.clickGetStarted_btn();
		hp.clickSignInLink();
		sip.enterUsername("Login1234");
		sip.enterPassword("Login1234");
		sip.clickLogin();
	}

	
		
	@Test
	public void UserPositiveTest() {

		driver.get("https://dsportalapp.herokuapp.com");
		gsp = new GetStartedPage(driver);
		hp = new HomePage(driver);
		sip = new SignInPage(driver);
		
		gsp.clickGetStarted_btn();
		hp.clickSignInLink();
		sip.enterUsername("MyNewUser9899");
		sip.enterPassword("Login1234");
		sip.clickLogin();
	}
	
	@AfterTest
	public void closeDriver() {
		driver.close();
		driver.quit();
	}

	

	}
