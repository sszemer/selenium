package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\sebastian\\Downloads\\Selenium\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//driver.get("http://www.google.com");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sebastian\\Downloads\\javaLibs\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		if(title.toString().equals("Google")) {
			System.out.println("title is OK");
		}
		else {
			System.out.println("title is not OK");
		}

		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		driver.quit();
		
	}

}
