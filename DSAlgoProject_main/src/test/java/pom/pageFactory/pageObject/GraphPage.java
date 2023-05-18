package pom.pageFactory.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.Sleep;

public class GraphPage {
	private WebDriver driver;
	String HomepageUrl=ConfigReader.getHomePageUrl();
	//constructor 
	public GraphPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // initializing WebElelements
	}
	
	//Graph
	
	@FindBy(xpath = "//a[@href='graph']")
	WebElement graph;
	
	//Graph Representations
	@FindBy(xpath = "//a[contains(text(),'Graph Representations')]")
	WebElement graphRepresentations;
							
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
				
	//Actions or Methods

	public void homePage_url() {
		driver.get(HomepageUrl);
	}

	public void clickGraph() {
		Sleep.sleep();
		graph.click();
	}
	
	public void clickGraphRrepsentations() {
		Sleep.sleep();
		graphRepresentations.click();
	}
	
	public String getGraphPageTitle() {
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
	
	public void clickPracticeQuestionLink() {
		Sleep.sleep();
		praticeQuesLink.click();
	}
	public void clickSignOutLink() {

		signOut.click();
		Sleep.sleep();
	}
}
