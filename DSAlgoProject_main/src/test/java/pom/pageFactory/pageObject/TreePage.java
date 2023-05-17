package pom.pageFactory.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.Sleep;

public class TreePage {
	private WebDriver driver;
	String HomepageUrl = ConfigReader.getHomePageUrl();

	public TreePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// find element in overview-of-trees
	@FindBy(xpath = "//a[@href='overview-of-trees']")
	WebElement overview;

	// find elements of terminologies
	@FindBy(xpath = "//a[@href='/tree/terminologies/']")
	WebElement terminologies;

	// find elements of types-of-trees
	@FindBy(xpath = "//a[@href='/tree/types-of-trees/']")
	WebElement typesOfTrees;

	// find elements of tree-traversals
	@FindBy(xpath = "//a[@href='/tree/tree-traversals/']")
	WebElement treeTraversals;

	// find elements of traversals-illustration
	@FindBy(xpath = "//a[@href='/tree/traversals-illustration/']")
	WebElement traversalIllustration;

	// find elements of binary-trees
	@FindBy(xpath = "//a[@href='/tree/binary-trees/']")
	WebElement binaryTrees;

	// find elements of types-of-binary-trees
	@FindBy(xpath = "//a[@href='/tree/types-of-binary-trees/']")
	WebElement typesOfBinaryTrees;

	// find elements of implementation-in-python
	@FindBy(xpath = "//a[@href='/tree/implementation-in-python/']")
	WebElement implementationInPython;

	// find elements of binary-tree-traversals
	@FindBy(xpath = "//a[@href='/tree/binary-tree-traversals/']")
	WebElement binaryTreeTraversals;

	// find elements of implementation-of-binary-trees
	@FindBy(xpath = "//a[@href='/tree/implementation-of-binary-trees/']")
	WebElement implementationOfBinaryTrees;

	// find elements of applications-of-binary-trees
	@FindBy(xpath = "//a[@href='/tree/applications-of-binary-trees/']")
	WebElement applicationsOfBinaryTrees;

	// find elements of binary-search-trees
	@FindBy(xpath = "//a[@href='/tree/binary-search-trees/']")
	WebElement binarySearchTrees;

	// find elements of implementation-of-BST
	@FindBy(xpath = "//a[@href='/tree/implementation-of-bst/']")
	WebElement implementationOfBst;

	// click on try here
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

	public void clickOverviewOfTrees() {
		Sleep.sleep(2000);
		overview.click();
	}

	public void clickTerminologies() {
		Sleep.sleep(2000);
		terminologies.click();
	}

	public void clickTypesOfTrees() {
		Sleep.sleep(2000);
		typesOfTrees.click();
	}

	public void clickTreeTraversals() {
		Sleep.sleep(2000);
		treeTraversals.click();
	}

	public void clickTraversalIllustration() {
		Sleep.sleep(2000);
		traversalIllustration.click();
	}

	public void clickBinaryTrees() {
		Sleep.sleep(2000);
		binaryTrees.click();
	}

	public void clickTypesOfBinaryTrees() {
		Sleep.sleep(2000);
		typesOfBinaryTrees.click();
	}

	public void clickImpInPython() {
		Sleep.sleep(2000);
		implementationInPython.click();
	}

	public void clickBinaryTreeTravesals() {
		Sleep.sleep(2000);
		binaryTreeTraversals.click();
	}

	public void clickImpOfBinaryTrees() {
		Sleep.sleep(2000);
		implementationOfBinaryTrees.click();
	}

	public void clickAppOfBinaryTrees() {
		Sleep.sleep(2000);
		applicationsOfBinaryTrees.click();
	}

	public void clickBinarySearchTrees() {
		Sleep.sleep(2000);
		binarySearchTrees.click();
	}

	public void clickImpOfBST() {
		Sleep.sleep(2000);
		implementationOfBst.click();
	}

	public void addCodeInTextArea(String code) {
		Sleep.sleep(2000);
		textArea.sendKeys(code);
	}
	
	public void clickTryHere() {
		Sleep.sleep(2000);
		tryHereButton.click();
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