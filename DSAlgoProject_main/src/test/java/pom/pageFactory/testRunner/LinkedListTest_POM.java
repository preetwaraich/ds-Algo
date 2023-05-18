package pom.pageFactory.testRunner;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.driverFactory.DriverFactory;
import pom.pageFactory.pageObject.ArrayPage;
import pom.pageFactory.pageObject.GetStartedPage;
import pom.pageFactory.pageObject.HomePage;
import pom.pageFactory.pageObject.LinkedListPage;
import pom.pageFactory.pageObject.SignInPage;
import utilities.Sleep;

public class LinkedListTest_POM {

	private static WebDriver driver;

	GetStartedPage gsp;
	HomePage hp;
	LinkedListPage lp;
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
		driver.get("https://dsportalapp.herokuapp.com");
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
		sip.enterUsername("MyNewUser9899");
		sip.enterPassword("Login1234");
		sip.clickLogin();
	}

	@Test(groups= {"Page"},priority = 7)
	public void ClickLinkedListLinkOnHomePage() {
		hp = new HomePage(driver);
		hp.selectGetStartedButton("Linked List");

	}

	@Test(groups = { "Smoke", "Page" }, priority = 9)
	public void introduction() {
		lp = new LinkedListPage(driver);
		lp.clickIntroduction();
		lp.clickTryHere();
		lp.addCodeInTextArea("print 'I am in LL Introduction'");
		lp.clickRunButton();
		driver.navigate().back();
	}

	@Test(groups = { "Smoke", "Page" }, priority = 11)
	public void create_LinkedList() {
		lp = new LinkedListPage(driver);
		lp.clickCreateLinkedList();
		lp.clickTryHere();
		lp.addCodeInTextArea("print 'I am in Creating Linked List Module'");
		lp.clickRunButton();
		driver.navigate().back();
	}
	
	@Test(groups = { "Smoke", "Page" }, priority = 13)
	public void typeOfLinkedList() {
		lp = new LinkedListPage(driver);
		lp.clickTypesOfLinkedList();
		lp.clickTryHere();
		lp.addCodeInTextArea("print 'I am in Types of Linked List Module'");
		lp.clickRunButton();
		driver.navigate().back();
	}
	
	@Test(groups = { "Smoke", "Page" }, priority = 15)
	public void implementLLInPython() {
		lp = new LinkedListPage(driver);
		lp.clickImplementLLInPython();
		lp.clickTryHere();
		lp.addCodeInTextArea("print 'I am in Implement Linked List in Python'");
		lp.clickRunButton();
		driver.navigate().back();
	}
	
	@Test(groups = { "Smoke", "Page" }, priority = 17)
	public void traversal() {
		lp = new LinkedListPage(driver);
		lp.clickTraversal();
		lp.clickTryHere();
		lp.addCodeInTextArea("print 'I am in Traversal Module'");
		lp.clickRunButton();
		driver.navigate().back();
	}
	
	@Test(groups = { "Smoke", "Page" }, priority = 19)
	public void insertion() {
		lp = new LinkedListPage(driver);
		lp.clickInsertion();
		lp.clickTryHere();
		lp.addCodeInTextArea("print 'I am in Insertion Module'");
		lp.clickRunButton();
		driver.navigate().back();
	}
	
	@Test(groups = { "Smoke", "Page" }, priority = 19)
	public void deletion() {
		lp = new LinkedListPage(driver);
		lp.clickDeletion();
		lp.clickTryHere();
		lp.addCodeInTextArea("print 'I am in Deletion Module'");
		lp.clickRunButton();
		driver.navigate().back();
	}
	@Test(groups = { "Smoke", "Page" }, priority = 21)
	public void LinkedList_PracticeQuestionsLink() {

		lp=new LinkedListPage(driver);
		lp.clickPracticeQuestionLink();
		driver.navigate().back();
	}
	
	@Test(groups = { "Smoke", "Page" }, priority = 23)
	public void LinkedList_DropDown_LL() {
		hp = new HomePage(driver);
		hp.clickDropdown();
		hp.selectDropdownValue("Stack");
	}

	
	@Test(groups= {"Page"},priority = 25)
	public void LinkedListPage_ClickSignOut() {
		lp=new LinkedListPage(driver);
	lp.clickSignOutLink();
	}
	

	@Test(groups= {"Page"},priority = 27)
	public void closeDriver() {
		driver.close();
		driver.quit();
	}
}
