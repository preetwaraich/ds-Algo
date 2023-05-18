package pom.pageFactory.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.Sleep;

public class StackPage {
	private WebDriver driver;
	String HomepageUrl=ConfigReader.getHomePageUrl();
	public StackPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	//GoInsideStackPage and find elements of operations-in-stack
	 @FindBy(xpath="//a[@href='operations-in-stack']")
	 WebElement operationsInStack;
	 
	 //find elements of implementation ink
	 @FindBy(xpath="//a[@href='/stack/implementation/']")
	 WebElement implementation;
	
	 //find elements of applications
	 @FindBy(xpath="//a[@href='/stack/stack-applications/']")
	 WebElement stackApplications;
	 
	 //click on try here
	 //@FindBy (xpath="a[@href='/tryEditor']")
	 @FindBy (xpath="//a[contains(text(),'Try here>>>')]")
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
	
	//Sign out
		@FindBy(xpath = "//a[@href='/logout']")
		WebElement signOut;
				
//Actions/ Methods

public void homePage_url() {
	driver.get(HomepageUrl);
	}

public void clickOperationsInStack() {
	Sleep.sleep();
	operationsInStack.click();
	
}

public void clickImplementation() {
	Sleep.sleep();
	implementation.click();
}
public void clickApplications() {
	Sleep.sleep();
	stackApplications.click();
	
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