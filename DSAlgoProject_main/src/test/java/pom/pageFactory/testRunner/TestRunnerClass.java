package pom.pageFactory.testRunner;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.pageFactory.pageObject.ArrayPage;
import pom.pageFactory.pageObject.DataStructurePage;
import pom.pageFactory.pageObject.GetStartedPage;
import pom.pageFactory.pageObject.HomePage;
import pom.pageFactory.pageObject.LinkedListPage;
import pom.pageFactory.pageObject.QueuePage;
import pom.pageFactory.pageObject.RegisterPage;
import pom.pageFactory.pageObject.SignInPage;
import pom.pageFactory.pageObject.StackPage;
import utilities.Sleep;

public class TestRunnerClass {

	private static WebDriver driver = new ChromeDriver();

	GetStartedPage gsp;
	HomePage hp;
	DataStructurePage dsp;
	SignInPage sip;
	RegisterPage rp;
	ArrayPage ap;
	LinkedListPage lp;
	StackPage sp;
	QueuePage qup;

	@BeforeTest
	public void setupTest() {
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://dsportalapp.herokuapp.com");

	}

	@Test(priority = 1)
	public void registerUserNegativeTest() {
		gsp = new GetStartedPage(driver);
		hp = new HomePage(driver);
		rp = new RegisterPage(driver);

		gsp.clickGetStarted_btn();
		hp.clickRegister();
		rp.enterUsername("Login1234");
		rp.enterPassword("Login1234");
		rp.enterconfirmPassword("Login1234");
		rp.clickRegisterButton();
		System.out.println(rp.getErrorMsg());
	}

	@Test(priority = 2)
	public void registerUserPositiveTest() {

		gsp = new GetStartedPage(driver);
		hp = new HomePage(driver);
		rp = new RegisterPage(driver);

		driver.get("https://dsportalapp.herokuapp.com");
		gsp.clickGetStarted_btn();
		hp.clickRegister();
		rp.enterUsername("MyNewUser4ss12");
		rp.enterPassword("Login1234");
		rp.enterconfirmPassword("Login1234");
		rp.clickRegisterButton();
		// hp.clickSignOutLink();
	}

	@Test(priority = 3)
	public void loginNegativeTest() {
		hp = new HomePage(driver);
		sip = new SignInPage(driver);
		hp.clickSignInLink();
		sip.enterUsername("Login1234");
		sip.enterPassword("Login1234");
		sip.clickLogin();

		System.out.println(sip.getErrorMsg());
	}

	@Test(priority = 4)
	public void userPositiveTest() {

		sip = new SignInPage(driver);
		sip.clearUsername();
		sip.clearPassword();
		sip.enterUsername("MyNewUser9899");
		sip.enterPassword("Login1234");
		sip.clickLogin();
	}

	@Test(priority = 5)
	public void dataStructureSmokeTest() {

		hp = new HomePage(driver);
		dsp = new DataStructurePage(driver);
		hp.selectGetStartedButton("Data Structures-Introduction");
		dsp.clickTimeComplexity();
		dsp.clickTryHere();
		dsp.addCodeInTextArea("print 'hello'");
		dsp.clickRunButton();
		driver.navigate().back();
		dsp.clickPracticeQuestionLink();
		hp.clickDropdown();
		hp.selectDropdownValue("Array");
	}

	@Test(priority = 6)
	public void arrayPageSmokeTest() {
		hp = new HomePage(driver);
		ap = new ArrayPage(driver);

		// 1.test Arrays in Python
		ap.clickArraysInPython();
		// Todo Add Scroll
		ap.clickTryHere();
		ap.addCodeInTextArea("print Wrong Test");
		ap.clickRunButton();
		String errorMessage = driver.switchTo().alert().getText();
		System.out.println(errorMessage);
		driver.switchTo().alert().accept();
		// driver.switchTo().window(windowHandle);
		// ap.clearCodeInTextArea();
		// TODO fix this
		driver.navigate().refresh();
		ap.addCodeInTextArea("print 'I am in Arrays In Python'");
		ap.clickRunButton();
		driver.navigate().back();

		// 2.test Arrays Using List
		ap.clickArraysUsingList();
		// Todo Add Scroll
		ap.clickTryHere();
		ap.addCodeInTextArea("print 'I am in Arrays Using List'");
		ap.clickRunButton();
		driver.navigate().back();

		// 3.test Basic Operations
		ap.clickBasicOperationsInLists();
		// Todo Add Scroll
		ap.clickTryHere();
		ap.addCodeInTextArea("print 'I am in Basic Operations in Liats'");
		ap.clickRunButton();
		driver.navigate().back();

		// 4.test Application of Array
		ap.clickApplicationsOfArray();
		// Todo Add Scroll
		ap.clickTryHere();
		ap.addCodeInTextArea("print 'I am in Applications of Array'");
		ap.clickRunButton();
		driver.navigate().back();

		ap.clickPracticeQuestionLink();
		ap.clickSearchTheArray();
		ap.clickRunButton();
		errorMessage = driver.switchTo().alert().getText();
		System.out.println(errorMessage);
		driver.switchTo().alert().accept();
		// driver.navigate().refresh();
		ap.clickSubmitButton();
		ap.captureSubmitErrorMessage();
		driver.navigate().back();

		hp.clickDropdown();
		hp.selectDropdownValue("Linked List");
		// ap.clickSignOutLink();
	}

	public void LinkedListPageSmokeTest() {
		hp = new HomePage(driver);
		// ap = new ArrayPage(driver);
		lp = new LinkedListPage(driver);

		// 1.Introduction
		lp.clickIntroduction();
		// Todo Add Scroll
		lp.clickTryHere();
		lp.addCodeInTextArea("print Wrong code");
		lp.clickRunButton();
		Sleep.sleep();
		String errorMessage = driver.switchTo().alert().getText();
		System.out.println(errorMessage);
		driver.switchTo().alert().accept();
		Sleep.sleep();
		// driver.switchTo().window(windowHandle);
		// ap.clearCodeInTextArea();
		// TODO fix this
		driver.navigate().refresh();
		lp.addCodeInTextArea("print 'I am in LL Introduction'");
		lp.clickRunButton();
		driver.navigate().back();

		// 2.Creating Linked List
		lp.clickCreateLinkedList();
		// Todo Add Scroll
		lp.clickTryHere();
		lp.addCodeInTextArea("print 'I am in Creating Linked List'");
		lp.clickRunButton();
		driver.navigate().back();

		// 3.Types of Linked List
		lp.clickTypesOfLinkedList();
		// Todo Add Scroll
		lp.clickTryHere();
		lp.addCodeInTextArea("print 'I am in Types of Linked List'");
		lp.clickRunButton();
		driver.navigate().back();

		// 4.Implement Linked List in Python
		lp.clickImplementLLInPython();
		// Todo Add Scroll
		lp.clickTryHere();
		lp.addCodeInTextArea("print 'I am in Implement Linked List in Python'");
		lp.clickRunButton();
		driver.navigate().back();

		// 5. Traversal
		lp.clickTraversal();
		lp.clickTryHere();
		lp.addCodeInTextArea("print 'I am in Traversal Module'");
		lp.clickRunButton();
		driver.navigate().back();

		// 6. Insertion
		lp.clickInsertion();
		lp.clickTryHere();
		lp.addCodeInTextArea("print 'I am in Insertion Module'");
		lp.clickRunButton();
		driver.navigate().back();

		// 7. Deletion
		lp.clickDeletion();
		lp.clickTryHere();
		lp.addCodeInTextArea("print 'I am in Deletion Module'");
		lp.clickRunButton();
		driver.navigate().back();

		lp.clickPracticeQuestionLink();
		driver.navigate().back();

		hp.clickDropdown();
		hp.selectDropdownValue("Stack");
		// lp.clickSignOutLink();
	}

	public void StackPageSmokeTest() {
		hp = new HomePage(driver);
		sp = new StackPage(driver);

		sp.clickOperationsInStack();
		Sleep.sleep();
		sp.clickTryHere();
		sp.addCodeInTextArea("print 'I am in Operations Im Stack'");
		sp.clickRunButton();
		driver.navigate().back();

		sp.clickImplementation();
		sp.clickTryHere();
		sp.addCodeInTextArea("print 'Hello'");
		sp.clickRunButton();
		driver.navigate().back();

		sp.clickApplications();
		sp.clickTryHere();
		sp.addCodeInTextArea("print 'Hello'");
		sp.clickRunButton();
		driver.navigate().back();

		sp.clickPracticeQuestionLink();
		hp.clickDropdown();
		hp.selectDropdownValue("Queue");

	}

	public void DataStructureSmokeTest() {
		gsp = new GetStartedPage(driver);
		qup = new QueuePage(driver);

		qup.clickImplementationQueue();
		Sleep.sleep();
		qup.clickTryHere();
		qup.addCodeInTextArea("print 'I am in implementation of queue in python'");
		qup.clickRunButton();
		Sleep.sleep();
		driver.navigate().back();

		qup.clickImplementationCollections();
		qup.clickTryHere();
		qup.addCodeInTextArea("print 'Hello'");
		qup.clickRunButton();
		Sleep.sleep();
		driver.navigate().back();

		qup.clickImplementationArray();
		qup.clickTryHere();
		qup.addCodeInTextArea("print 'Hello'");
		qup.clickRunButton();
		Sleep.sleep();
		driver.navigate().back();

		qup.clickQeueuOps();
		qup.clickTryHere();
		qup.addCodeInTextArea("print 'Numpy Ninja'");
		qup.clickRunButton();
		Sleep.sleep();
		driver.navigate().back();

		qup.clickPracticeQuestionLink();
		hp.clickDropdown();
		hp.selectDropdownValue("Tree");
		hp.clickSignOutLink();
	}

	@AfterTest
	public void closeDriver() {
		driver.close();
		driver.quit();
	}

}
