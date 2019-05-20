package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sebastian\\Downloads\\javaLibs\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://developer.mozilla.org/en-US/docs/Web/HTML/Element/select");

		try {
			
		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"wikiArticle\"]/p[3]/select")));
		
		select.selectByVisibleText("Value 3");
		
		//driver.quit();
		
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
