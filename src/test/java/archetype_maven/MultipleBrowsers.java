package archetype_maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleBrowsers {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver1 = new EdgeDriver();
		driver1.get("https://facebook.com");
		driver1.manage().window().maximize();
		
		driver.quit();
		driver1.quit();
		
	}

}
