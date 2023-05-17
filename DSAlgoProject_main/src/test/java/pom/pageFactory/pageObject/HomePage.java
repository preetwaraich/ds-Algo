package pom.pageFactory.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.Sleep;

public class HomePage {
	private WebDriver driver;
	String URL=ConfigReader.getApplicationUrl();
	String HomepageUrl=ConfigReader.getHomePageUrl();
	//constructor 
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // initializing WebElelements
	}


	
	//HomePage dropdown
	@FindBy(xpath = "//a[text()='Data Structures']")
	@CacheLookup
	WebElement dropDownLink;

	//options in dropdown
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


	//HomePage Get Started buttons
	@FindBy(xpath = "//a[@href ='data-structures-introduction']")
	WebElement getStartedDS;
	@FindBy(xpath = "//a[@href ='array']")
	WebElement getStartedArray;
	@FindBy(xpath = "//a[@href ='linked-list']")
	WebElement getStartedLinkedList;
	@FindBy(xpath = "//a[@href ='stack']")
	WebElement getStartedStack;
	@FindBy(xpath = "//a[@href ='queue']")
	WebElement getStartedQueue;
	@FindBy(xpath = "//a[@href ='tree']")
	WebElement getStartedTree;
	@FindBy(xpath = "//a[@href ='graph']")
	WebElement getStartedGraph;

	//Sign in
	@FindBy(xpath = "//a[@href='/login']")
	WebElement signin;

	//Sign out
	@FindBy(xpath = "//a[@href='/logout']")
	//@FindBy(xpath = "//a[normalize-space()='Sign out']")
	//@FindBy(xpath = "//div[@id='navbarCollapse']//ul/a[@href='/logout']")
	//@FindBy(xpath = "/html[1]/body[1]/div[1]/nav[1]/div[1]/div[2]/ul[1]/a[3]")
	WebElement signOut;

	//Register
	@FindBy(xpath = "//a[@href='/register']")
	WebElement register;

	//Actions or Methods
	public void app_url() {
		driver.get(URL);
	}


	public String getHomePageTitle() {
		return driver.getTitle().trim();
	}

	public void homePage_url() {
		driver.get(HomepageUrl);
	}
	
	public void clickDropdown() {
		dropDownLink.click();
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

	public void selectGetStartedButton(String string) {

		switch (string) {
		case "Data Structures-Introduction":
			getStartedDS.click();
			break;

		case "Arrays":
			getStartedArray.click();
			break;

		case "Linked List":
			getStartedLinkedList.click();
			break;

		case "Stack":
			getStartedStack.click();
			break;

		case "Queue":
			getStartedQueue.click();
			break;

		case "Tree":
			getStartedTree.click();
			break;

		case "Graph":
			getStartedGraph.click();
			break;
		}
	}


	public void clickSignInLink() {
		Sleep.sleep(3000);
		signin.click();
	}
	public void clickSignOutLink() {
		Sleep.sleep(3000);
		signOut.click();
	}

	public String loginPageTitle() {
		String  lptitle=driver.getTitle().trim();
		return lptitle;
	}
	public void clickRegister() {
		Sleep.sleep(3000);
		register.click();
	}

}
