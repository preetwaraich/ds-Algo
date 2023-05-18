package pom.pageFactory.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.Sleep;

public class ArrayPage {
	private WebDriver driver;
	String HomepageUrl=ConfigReader.getHomePageUrl();
	//constructor 
	public ArrayPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // initializing WebElelements
	}

	
	//Array link-ArraysInPython
	

	
	@FindBy(xpath = "//a[@href='arrays-in-python']")
	WebElement arraysInPython;
	
	//Arrays link-Arrays Using List
	@FindBy(xpath = "//a[contains(text(),'Arrays Using List')]")
	WebElement arraysUsingList;
			
	//Array-Basic Operations in Lists
	@FindBy(xpath = "//a[contains(text(),'Basic Operations in Lists')]")
	WebElement basicOperationInList;
					
	//Array- Applications of Array
	@FindBy(xpath = "//a[contains(text(),'Applications of Array')]")
	WebElement applicationOfArray;
				
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
		
	//Practice Question Link
	@FindBy(xpath="//a[contains(text(),'Practice Questions')]")
	WebElement praticeQuesLink;
	
	//Practice Question page links
	@FindBy(xpath="//a[@href='/question/1']")
	WebElement searchTheArray;
	
	@FindBy(xpath="//a[@href='/question/2']")
	WebElement maxConsecutiveOnes;
	
	@FindBy(xpath="//a[@href='/question/3']")
	WebElement findNumbers;
	
	@FindBy(xpath="//a[@href='/question/4']")
	WebElement squareOfArray;
	
	//Question1-Arrays
	
	@FindBy(xpath="//input[@type='submit' and @value='Submit']")
	WebElement submitButton;
	
	@FindBy(xpath = "//pre[@id='output']")
	WebElement submitError;
		
	//Actions or Methods

	public void homePage_url() {
		driver.get(HomepageUrl);
	}

	public void clickSignOutLink() {

		signOut.click();
		Sleep.sleep();
	}
	
	public void clickArraysInPython() {
		Sleep.sleep();
		arraysInPython.click();
	}
	
	public void clickArraysUsingList() {
		Sleep.sleep();
		arraysUsingList.click();
	}
	
	public void clickBasicOperationsInLists() {
		Sleep.sleep();
		basicOperationInList.click();
	}
	
	public void clickApplicationsOfArray() {
		Sleep.sleep();
		applicationOfArray.click();
	}
	
	public String getArraysPageTitle() {
		String  r_title=driver.getTitle().trim();
		return r_title;
	}
	
	public void clickTryHere() {
		Sleep.sleep();
		tryHereButton.click();
	}
	
	public void addCodeInTextArea(String code) {
		Sleep.sleep();
		textArea.sendKeys(code);
		Sleep.sleep();
	}
	
	public void clearCodeInTextArea() {
		Sleep.sleep();
		textArea.clear();
		Sleep.sleep();
	}
	
	public void clickRunButton() {
		Sleep.sleep();
		runButton.click();
		Sleep.sleep();
	}
	
	public void clickSubmitButton() {
		Sleep.sleep();
		submitButton.click();
		Sleep.sleep();
	}
	
	public void clickPracticeQuestionLink() {
		Sleep.sleep();
		praticeQuesLink.click();
	}
	public void clickSearchTheArray() {
		Sleep.sleep();
		searchTheArray.click();
	}
	public void clickMaxConsecutiveOnes() {
		Sleep.sleep();
		maxConsecutiveOnes.click();
	}
	public void clickFindNumbers() {
		Sleep.sleep();
		findNumbers.click();
	}
	public void clickSquareOfASortedArray() {
		Sleep.sleep();
		squareOfArray.click();
	}
	public void captureSubmitErrorMessage() {
		Sleep.sleep();
		submitError.getText();
	}
		
}
