import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Invoking Browser
		//Chrome- ChromeDriver->Webiver Methods+ Class Methods
		//chromedriver.exe-> chrome browser
		System.setProperty("webdriver.chrome.driver", "F:\\Nimisha Se\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Firefox
		//System.setProperty("webdriver.gecko.driver", "F:\\Nimisha Se\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.chavaramatrimony.com/?gclid=EAIaIQobChMI_Ifah-jT-wIVWPh3Ch2PTAWWEAAYASAAEgLe5vD_BwE");
		System.out.println(driver.getTitle());
		System.out.print(driver.getCurrentUrl());
		driver.close();
		//driver.quit();

	}

}
