package docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeTest1 {
	
@Test	
public void test() throws MalformedURLException {
		
		DesiredCapabilities ds= DesiredCapabilities.chrome();
				
		URL url=new URL("http://localhost:4444/wd/hub");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--no-sandbox");
		options.addArguments("--headless");
		options.addArguments("--disable-gpu");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--profile-directory=Default");
		
//		//options.addArguments("--user-data-dir=~./Drivers/chromedriver.exe");
		ds.setCapability(ChromeOptions.CAPABILITY, options);
		
		RemoteWebDriver driver=new RemoteWebDriver(url,ds);

		driver.get("https://joinditto.in/health-insurance/max-bupa/health-companion");
		System.out.println("Title of PAGE "+ driver.getTitle());
		
		driver.close();
	}


}
