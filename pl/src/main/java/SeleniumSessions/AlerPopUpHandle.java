package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlerPopUpHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sebastian\\Downloads\\javaLibs\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		//nothing
		if (alert.getText().equals("Please enter a valid user name")) {
			System.out.println("is ok");
		}
		
		alert.accept();
		
		driver.findElement(By.xpath("//*[@id=\"login1\"]")).sendKeys("asdasd");

		driver.findElement(By.name("proceed")).click();
		
		System.out.println(alert.getText());
		//only username entered
		if (alert.getText().equals("Please enter your password")) {
			System.out.println("is ok");
		}

		Thread.sleep(5000);
		
		alert.accept();
		//alert.dismiss();
		

	}

}
