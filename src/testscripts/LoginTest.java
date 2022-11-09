package testscripts;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.PredefinedActions;
import pages.LoginPage;



public class LoginTest  {
	
	@Test
	public void tc1(String url) {
		  System.out.println("LAunch browser and hit url");
		  PredefinedActions.start("https://srekhate-trials77.orangehrmlive.com/");
		  
		  System.out.println("STEP:Enter Login valid Credentials");
		  LoginPage loginPage=new LoginPage();
		  loginPage.login("Admin", "1m2VfjFA@L");
		  
		  System.out.println("STEP:Verify homepage is displayed");
		  String expectedTitle="Employee Management";
		  String actualTitle=loginPage.getPageTitle();
		  
		  //Hard assert,overloaded method,can take customised msg
		  Assert.assertEquals(actualTitle, expectedTitle,"Exepected title was"+expectedTitle+"but Actual titl is"+actualTitle);
		  
		  System.out.println("STEP:Close browser");
		  PredefinedActions.closeBrowser();
	}
}
