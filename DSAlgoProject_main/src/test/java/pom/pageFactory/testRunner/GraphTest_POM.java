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
import pom.pageFactory.pageObject.GraphPage;
import pom.pageFactory.pageObject.HomePage;
import pom.pageFactory.pageObject.SignInPage;
import pom.pageFactory.pageObject.TreePage;
import utilities.ConfigReader;
import utilities.Sleep;

public class GraphTest_POM {

	private static WebDriver driver;

	GetStartedPage gsp;
	HomePage hp;
	GraphPage gp;
	SignInPage sip;

	@BeforeTest
	public void setupTest() {
		driver = DriverFactory.getDriverForChrome_MultipleClasses();
		Sleep.sleep();

	}

	@Test(groups = { "Smoke", "Page" }, priority = 1)
	public void instantiateDriver() {
		if (driver == null)
			driver = DriverFactory.getDriverForChrome_MultipleClasses();
	}

	@Test(groups = { "Page" }, priority = 2)
	public void LoadAppHome() {
		driver.get(ConfigReader.getApplicationUrl());
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
		sip.enterUsername(ConfigReader.getStringValue("username"));
		sip.enterPassword(ConfigReader.getStringValue("password"));
		sip.clickLogin();
	}

	@Test(groups= {"Page"},priority = 7)
	public void Click_GraphOnHomePage() {
		hp = new HomePage(driver);
		hp.selectGetStartedButton("Graph");
	}
	@Test(groups = { "Smoke", "Page" }, priority = 9)
	public void click_graphLink_wrongText() {
		gp = new GraphPage(driver);
		gp.clickGraph();
		gp.clickTryHere();
		gp.addCodeInTextArea(ConfigReader.getStringValue("GraphPage_WrongTest_PythonCode"));
		gp.clickRunButton();
		String errorMessage=driver.switchTo().alert().getText();
		System.out.println(errorMessage);
		driver.switchTo().alert().accept();
		//driver.switchTo().window(windowHandle);
		//gp.clearCodeInTextArea();
		//TODO fix this
		driver.navigate().back();
		driver.navigate().back();
	}
	
	@Test(groups = { "Smoke", "Page" }, priority = 9)
	public void click_graph_link() {
		gp = new GraphPage(driver);
		gp.clickGraph();
		gp.clickTryHere();
		gp.addCodeInTextArea(ConfigReader.getStringValue("GraphPage_graph_link_PythonCode"));
		gp.clickRunButton();
		driver.navigate().back();
	}
	
	
	
	@Test(groups = { "Smoke", "Page" }, priority = 11)
	public void click_graph_representation() {
		gp = new GraphPage(driver);
		gp.clickGraphRrepsentations();
		gp.clickTryHere();
		gp.addCodeInTextArea(ConfigReader.getStringValue("GraphPage_graph_representation_PythonCode"));
		gp.clickRunButton();
		driver.navigate().back();
		
	}
	@Test(groups = { "Smoke", "Page" }, priority = 13)
	public void click_graph_practice_questions() {
		gp = new GraphPage(driver);	
		gp.clickPracticeQuestionLink();
		driver.navigate().back();
	}
	
	
	@Test(groups = { "Smoke", "Page" }, priority = 15)
	public void graphPage_ClickSignOut() {
		gp = new GraphPage(driver);
		gp.clickSignOutLink();
	}
	
	@Test(groups = { "Smoke", "Page" }, priority = 17)
	public void closeDriver() {
		driver.close();
		driver.quit();
	}
	}