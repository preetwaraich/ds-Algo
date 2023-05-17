package pom.pageFactory.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.Sleep;

public class DataStructurePage {
	private WebDriver driver;
	String HomepageUrl=ConfigReader.getHomePageUrl();
	//constructor 
	public DataStructurePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // initializing WebElelements
	}

	//Error message
	@FindBy(xpath = "//div[@role='alert']")
	WebElement errorMessage;

	//HomePage dropdown
	@FindBy(xpath = "//a[text()='Data Structures']")
	@CacheLookup
	WebElement dropDownLink;

	@FindBy(xpath = "//a[text()='Arrays']")
	@CacheLookup
	WebElement dropdown_array;

	@FindBy(xpath = "//a[text()='Linked List']")
	@CacheLookup
	WebElement dropdown_linkedlist;

	@FindBy(xpath = "//a[text()='Stack']")
	@CacheLookup
	WebElement dropdown_stack;

	@FindBy(xpath = "//a[text()='Queue']")
	@CacheLookup
	WebElement dropdown_queue;

	@FindBy(xpath = "//a[text()='Tree']")
	@CacheLookup
	WebElement dropdown_tree;

	@FindBy(xpath = "//a[text()='Graph']")
	@CacheLookup
	WebElement dropdown_graph;


	//Data Structure links
	@FindBy(xpath = "//a[contains(text(),'Time Complexity')]")
	WebElement timeComplexity;


	//Sign out
	@FindBy(xpath = "//a[@href='/logout']")
	WebElement signOut;
	
	//Try Here
	@FindBy(xpath = "//a[contains(text(),'Try here>>>')]")
	WebElement tryHereButton;
	
	//Code Text Area
	@FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	WebElement textArea;
	
	// Run Code
	@FindBy(xpath = "//button[contains(text(),'Run')]")
	WebElement runButton;
	
	//Practice Question
	@FindBy(xpath="//a[contains(text(),'Practice Questions')]")
	WebElement praticeQuesLink;


	//Actions or Methods

	public void clickDropDownLink() {
		Sleep.sleep(3000);
		dropDownLink.click();

	}

	public void homePage_url() {
		driver.get(HomepageUrl);
	}


	public void selectDropdownValue(String strItem) {

		Sleep.sleep(2000);

		switch (strItem) {

		case "Arrays":

			dropdown_array.click();
			break;

		case "Linked List":

			dropdown_linkedlist.click();
			break;

		case "Stack":

			dropdown_stack.click();
			break;
		case "Queue":

			dropdown_queue.click();
			break;
		case "Tree":

			dropdown_tree.click();
			break;
		case "Graph":

			dropdown_graph.click();
			break;
		default:
			break;
		}
	}



	public String errorMsg() throws Exception {
		Thread.sleep(1000);
		String errorMsg=errorMessage.getText();
		return errorMsg;
	}
	public void clickSignOutLink() {

		signOut.click();
		Sleep.sleep(3000);
	}

	public void clickTimeComplexity() {
		Sleep.sleep(3000);
		timeComplexity.click();
	}
	public String getDataStructurePageTitle() {
		String  r_title=driver.getTitle().trim();
		return r_title;
	}
	
	public void clickTryHere() {
		Sleep.sleep(3000);
		tryHereButton.click();
	}
	
	public void addCodeInTextArea(String code) {
		Sleep.sleep(2000);
		textArea.sendKeys(code);
		Sleep.sleep(2000);
	}
	
	public void clickRunButton() {
		Sleep.sleep(2000);
		runButton.click();
		Sleep.sleep(2000);
	}
	
	public void clickPracticeQuestionLink() {
		Sleep.sleep(3000);
		praticeQuesLink.click();
	}
}
