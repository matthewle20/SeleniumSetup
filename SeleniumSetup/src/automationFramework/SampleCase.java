package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleCase {
	
	private WebDriver driver;
	private String url;
	
	public SampleCase() {
		
	}
	
	public void initDriver() {
		String path = System.getProperty("user.dir") + "\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
	}
	
	public void startWebDriver() {
		driver.get("http://www.google.com");
	}
	
	public void run() {
		// click Google Search button
		driver.findElement(By.name("q")).sendKeys("Selenium WebDriver");
		driver.findElement(By.name("btnK")).submit();
	}
	
	public void closeWebDriver() {
		driver.quit();
	}
	
	
	public String getURL() {
		return url;
	}
	
	public void setURL(String url) {
		this.url = url;
	}
}
