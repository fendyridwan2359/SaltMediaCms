/**
 * 
 */
package pages;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author fendyridwan
 *
 */
public class PackageEdit {

	WebDriver driver;
	String varKey = "test Automation";
	String varValue = "test Automation";
	String varDesc = "test automation";
	String whatTime;

	public PackageEdit(WebDriver driver) {
		this.driver = driver;
	}

	//list page
	@FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div[1]/div[2]/div[1]/div/div/div[3]/ul/a[2]/div")
	@CacheLookup
	WebElement navigationBar;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[1]/button")
	@CacheLookup
	WebElement newPackageButton;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div[1]/div[2]/div[2]/div/div[2]/table/tbody/tr[1]")
	@CacheLookup
	WebElement tableFirstList;
	
	public void clickNavBar()
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(navigationBar)).click();
	}
	
	public void clickNewPackageButton()
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(newPackageButton)).click();
	}
		
	//edit page
	String startDatestr = "03/01/2020";
	String endDatestr = "08/01/2020";
	//*[@id="root"]/div[1]/div[2]/div[2]/form/div/div[3]/div/div[1]/div/button[1]
	@FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div[1]/div[2]/div[2]/form/div/div[3]/div/div[1]/div/button")
	@CacheLookup
	WebElement priceButton;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div[1]/div[2]/div[2]/form/div/div[3]/div/div[1]/div/button[2]")
	@CacheLookup
	WebElement saveButton;
	
	//add package modal
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/div[1]/div/h2")
	@CacheLookup
	WebElement addPackageTitle;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/div[2]/form/div/div[1]/div/div/input")
	@CacheLookup
	WebElement startDate;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[3]/div/div/div[1]/div[1]/div/p")
	@CacheLookup
	WebElement getYearAndMonth;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[3]/div/div/div[1]/div[1]/button[2]")
	@CacheLookup
	WebElement nextMonthButton;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[3]/div/div/div[1]/div[1]/button[1]")
	@CacheLookup
	WebElement prevMonthButton;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[3]/div/div/div[2]/div/div[2]/div[1]/button")
	@CacheLookup
	WebElement pickStartDate;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/div[2]/form/div/div[2]/div/div/input")
	@CacheLookup
	WebElement endDate;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[3]/div/div/div[1]/div[1]/div/p")
	@CacheLookup
	WebElement getYearAndMonth2;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[3]/div/div/div[1]/div[1]/button[2]")
	@CacheLookup
	WebElement nextMonthButton2;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[3]/div/div/div[1]/div[1]/button[1]")
	@CacheLookup
	WebElement prevMonthButton2;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div[3]/div/div/div[2]/div/div[4]/div[7]/button/span[1]/p")
	@CacheLookup
	WebElement pickStartDate2;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/div[2]/form/div/div[3]/div/div/input")
	@CacheLookup
	WebElement price;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/div[2]/form/div/div[4]/div/div/input")
	@CacheLookup
	WebElement duration;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div[3]/div/div[2]/form/div/div[5]/div[2]/button")
	@CacheLookup
	WebElement continueButtonPrice;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div[2]/div[5]/div/div/div/p[2]")
	@CacheLookup
	WebElement alertSuccess;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div[1]/div[2]/div[2]/form/div/div[3]/div/div[2]/table/tbody/tr[1]/td[2]")
	@CacheLookup
	WebElement firstLineDuration;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div[1]/div[2]/div[2]/form/div/div[3]/div/div[1]/div/button[2]")
	@CacheLookup
	WebElement savebutton2;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"root\"]/div[2]/div[5]/div/div/div/p[2]")
	@CacheLookup
	WebElement updateMessage;
	
	
	
	
	public void clickSaveButton2()
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(savebutton2)).click();
	}
	
	public boolean checkUpdateOrNot()
	{
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(updateMessage)).isDisplayed();
	}
	
	
	
	public void clickPriceButton()
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(priceButton)).click();
	}
	
	public void typeStartDate()
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(startDate)).click();
		
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(prevMonthButton)).click();
			
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(pickStartDate)).click();
		
		Point p= addPackageTitle.getLocation();

		Actions actions = new Actions(driver);

		actions.moveToElement(addPackageTitle).moveByOffset(p.x,p.y).click().perform();
		
	}
	
	public void typeEndDate() throws InterruptedException
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(endDate)).click();
		
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(nextMonthButton2)).click();
		Thread.sleep(3000);
			
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(pickStartDate2)).click();
		
		Point p= addPackageTitle.getLocation();

		Actions actions = new Actions(driver);

		actions.moveToElement(addPackageTitle).moveByOffset(p.x,p.y).click().perform();
	}
	
	public void typePrice()
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(price)).sendKeys("5");
	}
	
	public String getTime() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("mms");
		LocalDateTime now = LocalDateTime.now();
		whatTime = dtf.format(now);
		return whatTime;
	}
	
	public String numberOfDuration() {
		return whatTime;
	}
	
	public void typeDuration()
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(duration)).sendKeys(getTime());
	}
	
	public void clickContinueButtonPrice()
	{
		(new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(continueButtonPrice)).click();
	}
	
	public boolean getAlertText()
	{
		String alertText;
		boolean isSuccess;
		alertText = (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(alertSuccess)).getText();
		
		if(alertText.contains("Package created")) {
			isSuccess = true;
		}
		else {
			isSuccess = false;
		}
		return isSuccess;
	}
	
	public void editPage() {
		driver.get("http://salt-media-cms-dev.s3-website-ap-southeast-1.amazonaws.com/packages/edit/6138910452001/movie");
	}
	
	public String getNumberofDuration()
	{
		return (new WebDriverWait(driver, 10)).until(ExpectedConditions.visibilityOf(firstLineDuration)).getText();
	}
	
	public boolean isEditPage()
	{
		String url = driver.getCurrentUrl();
		
		if(url.contains("edit")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean getCurrentUrl(String containString) {
		String url = driver.getCurrentUrl();
		
		if(url.contains(containString)) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
