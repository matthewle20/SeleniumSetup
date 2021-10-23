package automationFramework;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class SampleTestCase {

	public static void main(String[] args) {
		String path = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://www.google.com/");    
	}

}
