package pom.pageFactory.testRunner;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.driverFactory.DriverFactory;
import pom.pageFactory.pageObject.ArrayPage;
import pom.pageFactory.pageObject.DataStructurePage;
import pom.pageFactory.pageObject.GetStartedPage;
import pom.pageFactory.pageObject.HomePage;
import pom.pageFactory.pageObject.SignInPage;
import utilities.Sleep;

public class ArrayTest_POM {

	private static WebDriver driver;

	GetStartedPage gsp;
	HomePage hp;
	ArrayPage ap;
	SignInPage sip;

	@BeforeTest
	public void setupTest() {
		driver = DriverFactory.getDriverForChrome_MultipleClasses();
		Sleep.sleep(2000);

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
	public void ClickArrayLinkOnHomePage() {
		hp = new HomePage(driver);
		hp.selectGetStartedButton("Arrays");

	}

	@Test(groups = { "Smoke", "Page" }, priority = 9)
	public void ArrayPage_WrongInput() {
		ap = new ArrayPage(driver);
		ap.clickArraysInPython();
		ap.clickTryHere();
		ap.addCodeInTextArea("print WrongTest");
		ap.clickRunButton();
		String errorMessage = driver.switchTo().alert().getText();
		System.out.println(errorMessage);
		driver.switchTo().alert().accept();
		// driver.switchTo().window(windowHandle);
		// ap.clearCodeInTextArea();
		// TODO fix this
		driver.navigate().refresh();
	}
	
	@Test(groups = { "Smoke", "Page" }, priority = 10)
	public void ArrayPage_ArraysInPython() {
		ap = new ArrayPage(driver);
		ap.addCodeInTextArea("print 'I am in Arrays In Python'");
		ap.clickRunButton();
		driver.navigate().back();
	}
	
	@Test(groups = { "Smoke", "Page" }, priority = 11)
	public void ArrayPage_ArraysUsingList() {
		ap = new ArrayPage(driver);
		ap.clickArraysUsingList();
		// Todo Add Scroll
		ap.clickTryHere();
		ap.addCodeInTextArea("print 'I am in Arrays Using List'");
		ap.clickRunButton();
		driver.navigate().back();
	}
	
	@Test(groups = { "Smoke", "Page" }, priority = 12)
	public void ArrayPage_BasicOperations() {
		ap = new ArrayPage(driver);
		ap.clickBasicOperationsInLists();
		// Todo Add Scroll
		ap.clickTryHere();
		ap.addCodeInTextArea("print 'I am in Basic Operations in Lists'");
		ap.clickRunButton();
		driver.navigate().back();
	}
	
	@Test(groups = { "Smoke", "Page" }, priority = 13)
	public void ArrayPage_ApplicationsOfArrays() {
		ap = new ArrayPage(driver);
		ap.clickApplicationsOfArray();
		// Todo Add Scroll
		ap.clickTryHere();
		ap.addCodeInTextArea("print 'I am in Applications of Array'");
		ap.clickRunButton();
		driver.navigate().back();
	}
	
	@Test(groups = { "Smoke", "Page" }, priority = 14)
	public void ArrayPage_PracticeQuestionsLink() {

		ap=new ArrayPage(driver);
		ap.clickPracticeQuestionLink();	
	}
	
	@Test(groups = { "Smoke", "Page" }, priority = 15)
	public void ArrayPage_PracticeQuestion1() {
		ap=new ArrayPage(driver);
		ap.clickSearchTheArray();
		ap.clickRunButton();
		String errorMessage = driver.switchTo().alert().getText();
		System.out.println(errorMessage);
		driver.switchTo().alert().accept();
		// driver.navigate().refresh();
		ap.clickSubmitButton();
		ap.captureSubmitErrorMessage();
		driver.navigate().back();
	}
	@Test(groups = { "Smoke", "Page" }, priority = 16)
	public void ArrayPage_PracticeQuestion2() {
		ap=new ArrayPage(driver);	
		ap.clickMaxConsecutiveOnes();
		ap.clickRunButton();
		String errorMessage = driver.switchTo().alert().getText();
		System.out.println(errorMessage);
		driver.switchTo().alert().accept();
		// driver.navigate().refresh();
		ap.clickSubmitButton();
		ap.captureSubmitErrorMessage();
		driver.navigate().back();
	}
	@Test(groups = { "Smoke", "Page" }, priority = 17)
	public void ArrayPage_PracticeQuestion3() {
		ap=new ArrayPage(driver);	
		ap.clickFindNumbers();
		ap.clickRunButton();
		String errorMessage = driver.switchTo().alert().getText();
		System.out.println(errorMessage);
		driver.switchTo().alert().accept();
		// driver.navigate().refresh();
		ap.clickSubmitButton();
		ap.captureSubmitErrorMessage();
		driver.navigate().back();
	}
	@Test(groups = { "Smoke", "Page" }, priority = 18)
	public void ArrayPage_PracticeQuestion4() {
		ap=new ArrayPage(driver);	
		ap.clickSquareOfASortedArray();
		ap.clickRunButton();
		String errorMessage = driver.switchTo().alert().getText();
		System.out.println(errorMessage);
		driver.switchTo().alert().accept();
		// driver.navigate().refresh();
		ap.clickSubmitButton();
		ap.captureSubmitErrorMessage();
		driver.navigate().back();
	}
	
	@Test(groups = { "Smoke", "Page" }, priority = 19)
	public void ArrayPage_DropDown_LL() {
		hp = new HomePage(driver);
		hp.clickDropdown();
		hp.selectDropdownValue("Linked List");
	}

	
	@Test(groups= {"Page"},priority = 20)
	public void arrayPageSmokeTest_ClickSignOut() {
		ap = new ArrayPage(driver);
		ap.clickSignOutLink();
	}
	

	@Test(groups= {"Page"},priority = 21)
	public void closeDriver() {
		driver.close();
		driver.quit();
	}

}
