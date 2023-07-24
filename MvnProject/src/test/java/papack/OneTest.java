package papack;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OneTest {
	WebDriver driver;
	@Test
	public void mOne() {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String actualText = driver.findElement(By.id("pah")).getText();
        Assert.assertEquals("PracticeAutomationHere",actualText);

	}
	@AfterMethod
	public void closure() {
		driver.close();
		
	}

}
