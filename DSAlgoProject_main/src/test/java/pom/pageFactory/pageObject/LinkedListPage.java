package pom.pageFactory.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.Sleep;

public class LinkedListPage {
	private WebDriver driver;
	String HomepageUrl = ConfigReader.getHomePageUrl();

	public LinkedListPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// find element in Introduction
	@FindBy(xpath = "//a[@href='introduction']")
	WebElement introduction;

	// find elements of Creating Linked List
	@FindBy(xpath = "//a[@href='/linked-list/creating-linked-list/']")
	WebElement createLinkedList;

	// find elements of Types of Linked List
	@FindBy(xpath = "//a[@href='/linked-list/types-of-linked-list/']")
	WebElement typesOfLinkedList;

	// find elements of Implement Linked List in Python
	@FindBy(xpath = "//a[@href='/linked-list/implement-linked-list-in-python/']")
	WebElement implementLinkedListInPython;

	// find elements of Traversal
	@FindBy(xpath = "//a[@href='/linked-list/traversal/']")
	WebElement traversal;

	// find elements of Insertion
	@FindBy(xpath = "//a[@href='/linked-list/insertion-in-linked-list/']")
	WebElement insertionInLinkedList;

	// find elements of Deletion
	@FindBy(xpath = "//a[@href='/linked-list/deletion-in-linked-list/']")
	WebElement deletionInLinkedList;

	// click on try here
	@FindBy(xpath = "//a[contains(text(),'Try here>>>')]")
	WebElement tryHereButton;

	// Code Text Area
	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	WebElement textArea;
	
	// Code another Text Area
		@FindBy(xpath = "//textarea[@id='editor']")
		WebElement anotherTextArea;

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

	public void clickIntroduction() {
		Sleep.sleep(2000);
		introduction.click();
	}
	public void clickCreateLinkedList() {
		Sleep.sleep(2000);
		createLinkedList.click();
	}
	public void clickTypesOfLinkedList() {
		Sleep.sleep(2000);
		typesOfLinkedList.click();
	}

	public void clickImplementLLInPython() {
		Sleep.sleep(2000);
		implementLinkedListInPython.click();
	}
	
	public void clickTraversal() {
		Sleep.sleep(2000);
		traversal.click();
	}

	public void clickInsertion() {
		Sleep.sleep(2000);
		insertionInLinkedList.click();
	}

	public void clickDeletion() {
		Sleep.sleep(2000);
		deletionInLinkedList.click();
	}
	
	public void clickTryHere() {
		Sleep.sleep(2000);
		tryHereButton.click();
	}

	public void addCodeInTextArea(String code) {
		Sleep.sleep(2000);
		textArea.sendKeys(code);
	}
	
	public void addCodeInAnotherTextArea(String code) {
		Sleep.sleep(2000);
		anotherTextArea.sendKeys(code);
	}

	public void clickRunButton() {
		Sleep.sleep(2000);
		runButton.click();
	}

	public void clickPracticeQuestionLink() {
		Sleep.sleep(3000);
		praticeQuesLink.click();
	}

	public void clickSignOutLink() {
		signOut.click();
		Sleep.sleep(3000);
	}
}