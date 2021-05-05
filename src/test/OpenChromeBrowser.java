package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://firefox-source-docs.mozilla.org/testing/geckodriver/Support.html");
		WebDriver driver1 = new ChromeDriver(); 
		driver1.get("https://firefox-source-docs.mozilla.org/testing/geckodriver/Support.html");

	}

}
