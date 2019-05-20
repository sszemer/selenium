package pl.testowka;
 
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
 
public class TestowkaTest {
 
    static WebDriver driver;
 
    @BeforeClass
    public void setUp() {
        driver = new FirefoxDriver();
    }
 
    @Test
    public void ShouldBePosibleToSearchTestowkaAtGoogle()
            throws InterruptedException {
        driver.get("http://google.pl");
        WebElement searchField = driver.findElement(By.name("q"));
        searchField.sendKeys("testowka.pl");
        WebElement searchButton = driver.findElement(By
                .xpath("//*[@id=\"gbqfb\"]/span"));
        searchButton.click();
        for (int second = 0;; second++) {
            if (second >= 60)
                fail("timeout");
            try {
                if (driver.findElement(By.linkText("Testowka.pl"))
                        .isDisplayed()) {
                    break;
                }
            } catch (Exception e) {
            }
            Thread.sleep(1000);
        }
        WebElement linkToTestowka = driver.findElement(By
                .linkText("Testowka.pl"));
        linkToTestowka.click();
    }
 
    @AfterClass
    public static void tearDown() {
        driver.close();
    }
 
}