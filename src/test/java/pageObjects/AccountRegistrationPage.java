package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//input[@placeholder='First Name']")
	WebElement txtFirstName;
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	WebElement txtLastName;
	@FindBy(xpath = "//input[@placeholder='E-Mail']")
	WebElement txtEmail;
	@FindBy(xpath = "//input[@placeholder='Telephone']")
	WebElement txtphone;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement txtPassword;
	@FindBy(xpath = "//input[@placeholder='Password Confirm']")
	WebElement txtPasswordConfirm;
	/*@FindBy(xpath = "//label[normalize-space()='Yes']")
	WebElement subYesRadioButton;
	@FindBy(xpath = "//label[normalize-space()='No']")
	WebElement subNoRadioButton;*/
	@FindBy(xpath = "//input[@name='agree']")
	WebElement chkdPolicy;
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement btnContinue;
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	

	public void setFirstName(String fname) {
		txtFirstName.sendKeys(fname);
	}

	public void setLastName(String lname) {
		txtLastName.sendKeys(lname);
	}

	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}

	public void setTelephone(String phone) {
		txtphone.sendKeys(phone);
	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	public void setConfirmPassword(String pwd) {
		txtPasswordConfirm.sendKeys(pwd);
	}

	/*public void clickYesRadioButton() {
		subYesRadioButton.click();
	}

	public void clickNoRadioButton() {
		subNoRadioButton.click();
	}*/

	public void setPrivacyPolicy() {
		chkdPolicy.click();
	}
	
	public void clickContinue() {
		// Sol1
		btnContinue.click();
	/*	
		//Sol2
		//btnContinue.submit();
		
		//Sol3
		Actions act=new Actions(driver);
		act.moveToElement(btnContinue).click().perform();
		
		//Sol4
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", btnContinue);
		
		//Sol5
		btnContinue.sendKeys(Keys.RETURN);
		
		//Sol6
		WebDriverWait mywait= new WebDriverWait(driver,Duration.ofSeconds(10));
		mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click(); */
		
	  }
	
	public String getConfirmationMsg() {
		
		try {
			return (msgConfirmation.getText());
		}catch(Exception e) {
			
		return (e.getMessage());
			
		}
		
	}
	
}
