package docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeTest2 {

@Test	
public void test() throws MalformedURLException {
		
		DesiredCapabilities ds= DesiredCapabilities.chrome();
				
		URL url=new URL("http://localhost:4444/wd/hub");

		
		RemoteWebDriver driver=new RemoteWebDriver(url,ds);

		driver.get("https://www.amazon.com/");
		System.out.println("Title of PAGE "+ driver.getTitle());
		
		driver.close();
	}


}
