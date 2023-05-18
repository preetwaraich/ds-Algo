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
import pom.pageFactory.pageObject.LinkedListPage;
import pom.pageFactory.pageObject.SignInPage;
import pom.pageFactory.pageObject.StackPage;
import utilities.Sleep;

public class StackTest_POM {

	private static WebDriver driver;

	GetStartedPage gsp;
	HomePage hp;
	StackPage sp;
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
	public void ClickStackOnHomePage() {
		hp = new HomePage(driver);
		hp.selectGetStartedButton("Stack");

	}

	@Test(groups = { "Smoke", "Page" }, priority = 9)
	public void operations_in_stack() {
		sp = new StackPage(driver);
		sp.clickOperationsInStack();
		sp.clickTryHere();
		sp.addCodeInTextArea("print 'I am in Operations in Stack Module'");
		sp.clickRunButton();
		driver.navigate().back();
	}

	@Test(groups = { "Smoke", "Page" }, priority = 11)
	public void implementation_stack() {
		sp = new StackPage(driver);
		sp.clickImplementation();
		sp.clickTryHere();
		sp.addCodeInTextArea("print 'I am in Implementation Module'");
		sp.clickRunButton();
		driver.navigate().back();
	}

	@Test(groups = { "Smoke", "Page" }, priority = 13)
	public void application_stack() {
		sp = new StackPage(driver);
		sp.clickApplications();
		sp.clickTryHere();
		sp.addCodeInTextArea("print 'I am in Applications Module'");
		sp.clickRunButton();
		driver.navigate().back();
	}

	@Test(groups = { "Smoke", "Page" }, priority = 15)
	public void stack_PracticeQuestionsLink() {

		sp = new StackPage(driver);
		sp.clickPracticeQuestionLink();
		driver.navigate().back();
	}

	@Test(groups = { "Smoke", "Page" }, priority = 17)
	public void stack_DropDown() {
		hp=new HomePage(driver);
		hp.clickDropdown();
		hp.selectDropdownValue("Queue");
	}

	@Test(groups = { "Page" }, priority = 19)
	public void stackPage_ClickSignOut() {
		sp = new StackPage(driver);
		sp.clickSignOutLink();
	}

	@Test(groups = { "Page" }, priority = 21)
	public void closeDriver() {
		driver.close();
		driver.quit();
	}
}
