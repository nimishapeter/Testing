import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class locatorN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\Nimisha Se\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	//chavara matrimony code
		//driver.get("");
		//driver.findElement(By.className("login-btn-margin")).click();
		//driver.findElement(By.id("username")).sendKeys("CPLA423167");
		//driver.findElement(By.id("password")).sendKeys("qwerty123");
		//driver.findElement(By.className("btn-round")).click();
		
		//Rahulshetty academy code
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("details-button")).click();
		driver.findElement(By.id("proceed-link")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("qwerty123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Nimi");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("nimighj@dgs.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("abhilashghj@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("987654321");
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		//driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		//not required sample for try catch
		/*try {
			Thread.sleep(1000);
		}catch (InterruptedException e)
		{
			e.printStackTrace();
		}*/
		
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[placeholder*='Pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		
		
		
		//amazone login success
		
		/*driver.get("https://www.amazon.de/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.de%2Fgp%2Fyourstore%2Fhome%3Flanguage%3Den%26path%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&language=en&openid.assoc_handle=deflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.findElement(By.id("ap_email")).sendKeys("nimishapeter4@gmail.com");
		driver.findElement(By.id("continue")).click();
		//driver.findElement(By.id("ap_password")).sendKeys("Jan@2022");
		driver.findElement(By.id("ap_password")).sendKeys("ssddff");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.id("ap_password")).sendKeys("kljhgfd");
		driver.findElement(By.id("auth-captcha-guess")).sendKeys("wertyu");
		driver.findElement(By.id("signInSubmit")).click();
		//System.out.println(driver.findElement(By.cssSelector("h4.a-alert-heading")).getText());
		System.out.println(driver.findElement(By.cssSelector("span.a-list-item")).getText());*/
		
		
		
		
		
	}

}
