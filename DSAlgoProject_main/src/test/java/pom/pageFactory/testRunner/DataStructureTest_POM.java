package pom.pageFactory.testRunner;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.driverFactory.DriverFactory;
import pom.pageFactory.pageObject.DataStructurePage;
import pom.pageFactory.pageObject.GetStartedPage;
import pom.pageFactory.pageObject.HomePage;
import pom.pageFactory.pageObject.SignInPage;
import utilities.Sleep;

public class DataStructureTest_POM {

	private static WebDriver driver;
	GetStartedPage gsp;
	HomePage hp;
	DataStructurePage dsp;
	SignInPage sip;

	@BeforeTest
	public void setupTest() {
		driver = DriverFactory.getDriverForChrome_MultipleClasses();
		Sleep.sleep(2000);

	}
	
	@Test(groups= {"Smoke","Page"},priority = 1)
	public void OpenHomeURL() {
		if(driver==null)
		driver=DriverFactory.getDriverForChrome_MultipleClasses();
	}
	
	@Test(groups= {"Page"},priority = 2)
	public void LoadAppHome() {
		driver.get("https://dsportalapp.herokuapp.com");
	}
	
	
	@Test(groups= {"Page"},priority = 3)
	public void ClickGetStarted() {
		gsp = new GetStartedPage(driver);
		gsp.clickGetStarted_btn();

	}
	
	@Test(groups= {"Page"},priority = 4)
	public void ClickSignInLink() {
		hp = new HomePage(driver);
		hp.clickSignInLink();

	}
	
	
	@Test(groups= {"Page"},priority = 5)
	public void LoginUser() {

		sip = new SignInPage(driver);
		sip.enterUsername("MyNewUser9899");
		sip.enterPassword("Login1234");
		sip.clickLogin();
	}
	
	@Test(groups= {"Smoke","Page"},priority = 7)
	public void ClickDSLinkOnHomePage() {
		hp = new HomePage(driver);
		hp.selectGetStartedButton("Data Structures-Introduction");

	}

	@Test(groups= {"Smoke","Page"},priority = 8)
	public void DataStructureSmokeTest_TimeComplexity() {
		dsp = new DataStructurePage(driver);
		dsp.clickTimeComplexity();
		dsp.clickTryHere();
		dsp.addCodeInTextArea("print 'I am in Data Structures'");
		dsp.clickRunButton();
		driver.navigate().back();
	}
	
	@Test(groups= {"Smoke","Page"},priority = 9)
	public void DataStructureSmokeTest_PracticeQuestion() {
		dsp = new DataStructurePage(driver);
		dsp.clickPracticeQuestionLink();
	}
	
	@Test(groups= {"Smoke","Page"},priority = 10)
	public void DataStructureSmokeTest_Dropdown() {
		dsp = new DataStructurePage(driver);
		dsp.clickDropDownLink();
		dsp.selectDropdownValue("Arrays");Sleep.sleep(5000);
		//dsp.clickSignOutLink();
	}
	
	@Test(groups= {"Page"},priority = 11)
	public void DataStructureSmokeTest_ClickSignOut() {
		dsp = new DataStructurePage(driver);
		dsp.clickSignOutLink();
	}
	

	@Test(groups= {"Page"},priority = 90)
	public void closeDriver() {
		driver.close();
		driver.quit();
	}


}
