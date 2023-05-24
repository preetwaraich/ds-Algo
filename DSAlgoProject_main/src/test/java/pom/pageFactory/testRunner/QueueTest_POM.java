package pom.pageFactory.testRunner;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.driverFactory.DriverFactory;
import pom.pageFactory.pageObject.DataStructurePage;
import pom.pageFactory.pageObject.GetStartedPage;
import pom.pageFactory.pageObject.HomePage;
import pom.pageFactory.pageObject.QueuePage;
import pom.pageFactory.pageObject.SignInPage;
import pom.pageFactory.pageObject.StackPage;
import utilities.ConfigReader;
import utilities.Sleep;

public class QueueTest_POM {
	
	private static WebDriver driver;
	
	GetStartedPage gsp;
	HomePage hp;
	QueuePage qup;
	SignInPage sip;

	@BeforeTest
	public void setupTest() {
		driver = DriverFactory.getDriverForChrome_MultipleClasses();
		Sleep.sleep();

	}

	@Test(groups = { "Smoke", "Page" }, priority = 1)
	public void OpenHomeURL() {
		if (driver == null)
			driver = DriverFactory.getDriverForChrome_MultipleClasses();
	}

	@Test(groups = { "Page" }, priority = 2)
	public void LoadAppHome() {
		driver.get(ConfigReader.getApplicationUrl());
	}

	@Test(groups = { "Page" }, priority = 3)
	public void ClickGetStarted() {
		gsp = new GetStartedPage(driver);
		gsp.clickGetStarted_btn();

	}

	@Test(groups = { "Page" }, priority = 4)
	public void ClickSignInLink() {
		hp = new HomePage(driver);
		hp.clickSignInLink();

	}

	@Test(groups = { "Page" }, priority = 5)
	public void LoginUser() {

		sip = new SignInPage(driver);
		sip.enterUsername(ConfigReader.getStringValue("username"));
		sip.enterPassword(ConfigReader.getStringValue("password"));
		sip.clickLogin();
	}

	@Test(groups= {"Page"},priority = 7)
	public void ClickQueueOnHomePage() {
		hp = new HomePage(driver);
		hp.selectGetStartedButton("Queue");

	}
	
	@Test(groups = { "Smoke", "Page" }, priority = 9)	
	public void clickImplementationQueue() {
		qup = new QueuePage(driver);
		qup.clickImplementationQueue();
		Sleep.sleep();
		qup.clickTryHere();
		qup.addCodeInTextArea(ConfigReader.getStringValue("QueuePage_ImplementationQueue_PythonCode"));
		qup.clickRunButton();
		Sleep.sleep();
		driver.navigate().back();
	}
	@Test(groups = { "Smoke", "Page" }, priority = 11)
	public void clickImplementationCollections() {
		qup = new QueuePage(driver);
		qup.clickImplementationCollections();
		qup.clickTryHere();
		qup.addCodeInTextArea(ConfigReader.getStringValue("QueuePage_ImplementationCollections_PythonCode"));
		qup.clickRunButton();
		Sleep.sleep();
		driver.navigate().back();
	}
	@Test(groups = { "Smoke", "Page" }, priority = 13)
	public void clickImplementationArray() {
		qup = new QueuePage(driver);
		qup.clickImplementationArray();
		qup.clickTryHere();
		qup.addCodeInTextArea(ConfigReader.getStringValue("QueuePage_ImplementationArray_PythonCode"));
		qup.clickRunButton();
		Sleep.sleep();
		driver.navigate().back();
	}
	@Test(groups = { "Smoke", "Page" }, priority = 15)
	public void clickQueueOperations() {
		qup = new QueuePage(driver);
		qup.clickQeueuOps();
		qup.clickTryHere();
		qup.addCodeInTextArea(ConfigReader.getStringValue("QueuePage_clickQueueOperations_PythonCode"));
		qup.clickRunButton();
		Sleep.sleep();
		driver.navigate().back();
		
	}
	@Test(groups = { "Smoke", "Page" }, priority = 16)
	public void queue_PracticeQuestionsLink() {
		qup = new QueuePage(driver);
		qup.clickPracticeQuestionLink();
		Sleep.sleep();
	}
	
	@Test(groups = { "Smoke", "Page" }, priority = 17)
	public void queue_Dropdown() {
		hp=new HomePage(driver);
		hp.clickDropdown();
		hp.selectDropdownValue("Tree");
	
	}
	
	@Test(groups = { "Page" }, priority = 18)
	public void stackPage_ClickSignOut() {
		qup = new QueuePage(driver);
		qup.clickSignOutLink();
	}
	
	@Test(groups = { "Page" }, priority = 20)
	public void closeDriver() {
		driver.close();
		driver.quit();
	}
	}
	
