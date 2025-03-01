/**
 * 
 */
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author fendyridwan
 *
 */
public class CinemaCreate {
	
	WebDriver driver;
	String movieName = "test automation";
	public CinemaCreate(WebDriver driver) {
		this.driver = driver;
	}

	//list page
	@FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div[2]/ul/a[2]/div")
	@CacheLookup
	WebElement navigationBar;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[1]/button")
	@CacheLookup
	WebElement createNewButton;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[1]/div/div[2]/input")
	@CacheLookup
	WebElement searchField;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[2]/table/tbody/tr[1]")
	@CacheLookup
	WebElement tableFirstList;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[2]")
	@CacheLookup
	WebElement getTextFirstTable;
	
	//create movie page
	@FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div[1]/div[2]/div[2]/form/div/div[2]/div/div[1]/button")
	@CacheLookup
	WebElement addMovieButton;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/div[2]/div/div[1]/div[2]/input")
	@CacheLookup
	WebElement searchContentMovie;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/div[2]/div/div[2]/table/tbody/tr[1]")
	@CacheLookup
	WebElement firstListContentMovie;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div[1]/div[2]/div[2]/form/div/div[3]/div/div[2]/div/div/div/div/input")
	@CacheLookup
	WebElement url;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div[1]/div[2]/div[2]/form/div/div[3]/div/div[1]/button")
	@CacheLookup
	WebElement saveButton;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div[1]/div[2]/div[2]/form/div/div[4]/div/div[1]/button")
	@CacheLookup
	WebElement showTimesButton;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/div[2]/form/div/div[3]/div/div/input")
	@CacheLookup
	WebElement ticketId;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/div[2]/form/div/div[4]/div[2]/button")
	@CacheLookup
	WebElement saveShowTimesButton;
	
	
	//list page
	public void clickNavigationBar() throws InterruptedException
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(navigationBar)).click();
		Thread.sleep(2000);
	}
	
	public void clickCreateButton()
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(createNewButton)).click();
	}
	
	public void typeSearch()
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(searchField)).sendKeys(movieName);;
	}
	
	public void clearSearch() throws InterruptedException 
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(searchField)).clear();
		Thread.sleep(1000);
	}
	
	public boolean createButtonExist()
	{
		if((new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(createNewButton)).isDisplayed()==true) {
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean searchFieldExist()
	{
		if((new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(searchField)).isDisplayed()==true) {
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean firstListTableExist()
	{
		if((new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(tableFirstList)).isDisplayed()==true) {
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void selectFirstListofTable()
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(tableFirstList)).click();
	}
	
	public String getTextFirstTable()
	{
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(getTextFirstTable)).getText();
	}
	
	public String getTextNameOfFirstTable()
	{
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(getTextFirstTable)).getText();
	}

	//Create page
	public void clickAddMovieButton() throws InterruptedException {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(addMovieButton)).click();
		Thread.sleep(2000);
	}
	
	public void searchContentMovie() throws InterruptedException {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(searchContentMovie)).sendKeys("jellies");;
		Thread.sleep(2000);
	}
	
	public void selectFirstListMovie() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(firstListContentMovie)).click();
	}
	
	public void clickShowTimesButton() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(showTimesButton)).click();
	}
	
	public void inputURL() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(url)).sendKeys("https://www.google.com");
	}
	
	public void inputTicketId() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(ticketId)).sendKeys("1");
	}
	
	public void clickSaveShowTimesButton() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(saveShowTimesButton)).click();
	}
	
	public void clickSaveButton() {
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(saveButton)).click();
	}

}
