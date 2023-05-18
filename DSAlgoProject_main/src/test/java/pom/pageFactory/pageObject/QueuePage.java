package pom.pageFactory.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.Sleep;

public class QueuePage {
	private WebDriver driver;
	String HomepageUrl = ConfigReader.getHomePageUrl();

	public QueuePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// find element in Implementation of Queue
	@FindBy(xpath = "//a[@href='implementation-lists']")
	WebElement implemenationQueue;

	// find elements of Implementation using collections
	@FindBy(xpath = "//a[@href='/queue/implementation-collections/']")
	WebElement implementationCollections;

	// find elements of Implementation using Arrays
	@FindBy(xpath = "//a[@href='/queue/Implementation-array/']")
	WebElement implementationArray;

	// find elements of Queue Operations
	@FindBy(xpath = "//a[@href='/queue/QueueOp/']")
	WebElement queueOps;

	// click on try here
	//@FindBy(xpath = "a[@href='/tryEditor']")
	@FindBy (xpath="//a[contains(text(),'Try here>>>')]")
	WebElement tryHereButton;

	// Code Text Area
	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	WebElement textArea;

	// Run Code
	@FindBy(xpath = "//button[contains(text(),'Run')]")
	WebElement runButton;

	// Practice Question Link
	@FindBy(xpath = "//a[contains(text(),'Practice Questions')]")
	WebElement praticeQuesLink;

	// Sign out
	@FindBy(xpath = "//a[@href='/logout']")
	WebElement signOut;

//Actions/ Methods

	public void homePage_url() {
		driver.get(HomepageUrl);
	}

	public void clickImplementationQueue() {
		Sleep.sleep();
		implemenationQueue.click();

	}

	public void clickImplementationCollections() {
		Sleep.sleep();
		implementationCollections.click();
	}

	public void clickImplementationArray() {
		Sleep.sleep();
		implementationArray.click();
	}
	
	public void clickQeueuOps() {
		Sleep.sleep();
		queueOps.click();
	}
	public void clickTryHere() {
		Sleep.sleep();
		tryHereButton.click();
	}

	public void addCodeInTextArea(String code) {
		Sleep.sleep();
		textArea.sendKeys(code);
	}

	public void clickRunButton() {
		Sleep.sleep();
		runButton.click();
	}

	public void clickPracticeQuestionLink() {
		Sleep.sleep();
		praticeQuesLink.click();
	}

	public void clickSignOutLink() {
		signOut.click();
		Sleep.sleep();
	}
}