import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.testng.Assert;


public class locator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "F:\\Nimisha Se\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "F:\\chrome driver folder\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		try {
		      Thread.sleep(2000);
		    } catch (Exception e) {
		      System.out.println("Something went wrong.");
		    }
		System.out.println(driver.findElement(By.tagName("p")).getText());
		try {
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in");
		System.out.println("Assertion Successful");
		}
		catch (Throwable t) {
		    System.out.println("Exception raised in Assertion");
		}
	}

}
