package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PredefinedActions {
	
	 protected static WebDriver driver;//we make driver protected to protect it from using anywhere
     public static void start(String url) {
	    System.out.println("LAunch browser and hit url");
	    System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver_106.exe");
	    driver= new ChromeDriver();//launch browser
	    driver.manage().window().maximize();
	    driver.get(url);
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
     }
   
     public static void closeBrowser() {
    	 driver.close();
     }
}

