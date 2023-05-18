package pom.pageFactory.testRunner;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.driverFactory.DriverFactory;
import pom.pageFactory.pageObject.GetStartedPage;
import pom.pageFactory.pageObject.HomePage;
import pom.pageFactory.pageObject.QueuePage;
import pom.pageFactory.pageObject.SignInPage;
import pom.pageFactory.pageObject.TreePage;
import utilities.Sleep;

public class TreeTest_POM {

	private static WebDriver driver;

	GetStartedPage gsp;
	HomePage hp;
	TreePage tp;
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
	public void Click_GetStarted() {
		gsp = new GetStartedPage(driver);
		gsp.clickGetStarted_btn();

	}

	@Test(groups = { "Page" }, priority = 4)
	public void Click_SignInLink() {
		hp = new HomePage(driver);
		hp.clickSignInLink();

	}

	@Test(groups = { "Page" }, priority = 5)
	public void Login_User() {

		sip = new SignInPage(driver);
		sip.enterUsername("MyNewUser9899");
		sip.enterPassword("Login1234");
		sip.clickLogin();
	}

	@Test(groups= {"Page"},priority = 7)
	public void Click_TreeOnHomePage() {
		hp = new HomePage(driver);
		hp.selectGetStartedButton("Tree");

	}

	@Test(groups = { "Smoke", "Page" }, priority = 9)
	public void click_OverviewOfTrees() {
		tp = new TreePage(driver);
		tp.clickOverviewOfTrees();
		Sleep.sleep();
		tp.clickTryHere();
		tp.addCodeInTextArea("print 'I am in Overview of Trees'");
		tp.clickRunButton();
		driver.navigate().back();
	}
	
	@Test(groups = { "Smoke", "Page" }, priority = 11)
	public void click_Terminolgies() {
		tp = new TreePage(driver);
		tp.clickTerminologies();
		Sleep.sleep();
		tp.clickTryHere();
		tp.addCodeInTextArea("print 'I am in Terminologies'");
		tp.clickRunButton();
		driver.navigate().back();
	}
	
	@Test(groups = { "Smoke", "Page" }, priority = 13)
	public void click_TypesOfTrees() {
		tp = new TreePage(driver);
		tp.clickTypesOfTrees();
		Sleep.sleep();
		tp.clickTryHere();
		tp.addCodeInTextArea("print 'I am in Types of Trees'");
		tp.clickRunButton();
		driver.navigate().back();
	}
	
	@Test(groups = { "Smoke", "Page" }, priority = 14)
	public void click_TreeTraversals() {
		tp = new TreePage(driver);
		tp.clickTreeTraversals();
		tp.clickTryHere();
		tp.addCodeInTextArea("print 'I am in Tree Traversals'");
		tp.clickRunButton();
		driver.navigate().back();
	}
	
	@Test(groups = { "Smoke", "Page" }, priority = 15)
	public void click_TraversalIllustration() {
		tp = new TreePage(driver);
		tp.clickTraversalIllustration();
		Sleep.sleep();
		tp.clickTryHere();
		tp.addCodeInTextArea("print 'I am in Traversals Illustration'");
		tp.clickRunButton();
		driver.navigate().back();
	}
	
	@Test(groups = { "Smoke", "Page" }, priority = 17)
	public void click_TypesOfBinaryTrees() {
		tp = new TreePage(driver);
		tp.clickTypesOfBinaryTrees();
		Sleep.sleep();
		tp.clickTryHere();
		tp.addCodeInTextArea("print 'I am in Types Of Binary Trees'");
		tp.clickRunButton();
		driver.navigate().back();
	}
	
	@Test(groups = { "Smoke", "Page" }, priority = 19)
	public void click_ImpInPython() {
		tp = new TreePage(driver);
		tp.clickImpInPython();
		Sleep.sleep();
		tp.clickTryHere();
		tp.addCodeInTextArea("print 'I am in Implementation In Python'");
		tp.clickRunButton();
		driver.navigate().back();
	}
	@Test(groups = { "Smoke", "Page" }, priority = 21)
	public void click_BinaryTreeTravesals() {
		tp = new TreePage(driver);
		tp.clickBinaryTreeTravesals();
		Sleep.sleep();
		tp.clickTryHere();
		tp.addCodeInTextArea("print 'I am in Tree Travesals'");
		tp.clickRunButton();
		driver.navigate().back();
	}
	@Test(groups = { "Smoke", "Page" }, priority = 23)
	public void click_ImpOfBinaryTrees() {
		tp = new TreePage(driver);
		tp.clickImpOfBinaryTrees();
		Sleep.sleep();
		tp.clickTryHere();
		tp.addCodeInTextArea("print 'I am in Binary Trees'");
		tp.clickRunButton();
		driver.navigate().back();
	}
	@Test(groups = { "Smoke", "Page" }, priority = 25)
	public void click_AppOfBinaryTrees() {
		tp = new TreePage(driver);
		tp.clickAppOfBinaryTrees();
		Sleep.sleep();
		tp.clickTryHere();
		tp.addCodeInTextArea("print 'I am in Applications of Binary Trees'");
		tp.clickRunButton();
		driver.navigate().back();
	}
	
	@Test(groups = { "Smoke", "Page" }, priority = 27)
	public void click_BinarySearchTrees() {
		tp = new TreePage(driver);
		tp.clickBinarySearchTrees();
		Sleep.sleep();
		tp.clickTryHere();
		tp.addCodeInTextArea("print 'I am in Binary Search Trees'");
		tp.clickRunButton();
		driver.navigate().back();
	}
	@Test(groups = { "Smoke", "Page" }, priority = 29)
	public void click_ImpOfBST() {
		tp = new TreePage(driver);
		tp.clickBinarySearchTrees();
		tp.clickImpOfBST();
		Sleep.sleep();
		tp.clickTryHere();
		tp.addCodeInTextArea("print 'I am in Implementation of BST Module'");
		tp.clickRunButton();
		driver.navigate().back();
	}
	
	@Test(groups = { "Smoke", "Page" }, priority = 31)
	public void tree_PracticeQuestionsLink() {
		tp = new TreePage(driver);
		tp.clickPracticeQuestionLink();
		Sleep.sleep();
	}
	
	@Test(groups = { "Smoke", "Page" }, priority = 33)
	public void tree_Dropdown() {
		hp=new HomePage(driver);
		hp.clickDropdown();
		hp.selectDropdownValue("Graph");
	
	}
	
	@Test(groups = { "Page" }, priority = 35)
	public void treePage_ClickSignOut() {
		tp = new TreePage(driver);
		tp.clickSignOutLink();
	}
	
	@Test(groups = { "Page" }, priority = 37)
	public void closeDriver() {
		driver.close();
		driver.quit();
	}
	}