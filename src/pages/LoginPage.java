package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.PredefinedActions;

public class LoginPage extends PredefinedActions{//to make driver access at pages level
	//protected members can go outside of package if parent child relationship is there

	public void login(String username,String password) {
		enterUserName(username);
		enterPassword(password);
		clickOnLoginBtn();
	}
	
    public void enterUserName(String username) {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
	}
    
    public void enterPassword(String password) {
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
	}
    
    public void clickOnLoginBtn() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
    
    public String getPageTitle() {
    	return driver.getTitle();
    }
    
    public boolean isUsernameErrorMsgDisplayed() {
    	WebElement userNameErrorMsg=driver.findElement(By.cssSelector("#txtUsername-error"));
    	return userNameErrorMsg.isDisplayed();
    }
    
    public boolean isPasswordErrorMsgDisplayed() {
    	WebElement passwordErrorMsg=driver.findElement(By.cssSelector("#txtPassword-error"));
    	return passwordErrorMsg.isDisplayed();
    }
    
    public boolean isLogoDisplayed() {
    	return driver.findElement(By.cssSelector("div.organization-logo.shadow>img")).isDisplayed();
    }
}
