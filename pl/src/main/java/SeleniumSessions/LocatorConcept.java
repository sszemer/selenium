package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sebastian\\Downloads\\javaLibs\\Selenium\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2Fsch%2F%3F_nkw%3Dregister");

		try {
		
		driver.findElement(By.xpath("//*[@id=\"psnBizRadioButton\"]/ul/li[2]/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"businessname\"]")).sendKeys("Sebastian");
		driver.findElement(By.xpath("//*[@id=\"businessemail\"]")).sendKeys("sss.zemer@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"rbusinessemail\"]")).sendKeys("sss.zemer@gmail.com");
		driver.findElement(By.cssSelector("#PASSWORD_BIZREG")).sendKeys("P455sw0rd");
		driver.findElement(By.xpath("//*[@id=\"phoneFlagComp1Business\"]")).sendKeys("791333873");
		
		//driver.findElement(By.xpath("//*[@id=\"selected-flag-phonephoneFlagComp1Business\"]")).click();
		
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"selected-flag-phonephoneFlagComp1Business\"]"));
		
		dropdown.click();
		dropdown.findElement(By.xpath("//*[@id=\"country-flag-pl-phoneFlagComp1Business\"]/span[1]")).click();
		
		
		synchronized (driver) {
			driver.wait(1000);
		}
		
		driver.findElement(By.xpath("//*[@id=\"captcha_BIZREG_Ipt\"]")).sendKeys("123123");
		driver.findElement(By.xpath("//*[@id=\"sbtBtnBusiness\"]")).click();
		
		driver.quit();
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
