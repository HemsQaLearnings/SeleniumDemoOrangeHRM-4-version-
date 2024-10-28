package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {

		// System.setProperty("Webdriver.chrome.driver",
		// ".\\Softwares\\chromedriver.exe");

		// ChromeDriver driver=new ChromeDriver();

		// System.setProperty("Webdriver.gecko.driver",
		// ".\\Softwares\\geckodriver.exe");

		// FirefoxDriver driver=new FirefoxDriver();

		System.setProperty("webdriver.edge.driver", ".\\Softwares\\msedgedriver.exe");

		EdgeDriver driver = new EdgeDriver();
		Thread.sleep(5000);

		driver.quit();

	}

}
