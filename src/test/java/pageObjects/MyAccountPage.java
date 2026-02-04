package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		
		super(driver);
		
	}
		
	@FindBy(xpath = "//h2[normalize-space()='My Account']") //My Account page Heading
	WebElement megHeading;

	 @FindBy (xpath="//a[@class='list-group-item'][normalize-space()='Logout']")  //Added in step6
	 WebElement linklogout;
	
	 public void  clickLogout() {
		 
		 linklogout.click();
	 }
	 
	public boolean isMyAccountPageExists() //My Account page heading display status 
	{			
		try {
		return (megHeading.isDisplayed());
	      }catch(Exception e) {
		
	             return(false);
		
	}
	
}
}
