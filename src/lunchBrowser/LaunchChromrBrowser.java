package lunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromrBrowser {

	public static void main(String[] args) throws InterruptedException {

	//System.setProperty("webdriver.chrome.driver","C:\\chromeDriverVersion101\\chromedriver.exe");
System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");

	WebDriver driver = (WebDriver) new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	Thread.sleep(6000);
	driver.close();
	}
	

}
 