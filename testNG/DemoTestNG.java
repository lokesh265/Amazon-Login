package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTestNG {
	WebDriver driver;
		@Test
  public void f() {
			WebDriverWait wait = new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.className("nav-line-1")));
			driver.findElement(By.className("nav-line-1")).click();
			driver.findElement(By.className("nav-action-inner")).click();
			driver.findElement(By.id("ap_email")).sendKeys("Lokeshbisht265@gmail.com");
			driver.findElement(By.id("continue")).click();
  }
	@BeforeMethod
	public void beforeMEthod() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lokesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		}
	@AfterMethod
	public void afterMethod() {
		//close the driver
		driver.quit();
		
	}
}
