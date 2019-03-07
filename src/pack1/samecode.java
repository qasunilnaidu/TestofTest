//Run the script in different browsers
package pack1;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class samecode {
	WebDriver driver;

	@Test
	public void m1() throws MalformedURLException {
		DesiredCapabilities capability = DesiredCapabilities.firefox();
		capability.setBrowserName("firefox");
		capability.setPlatform(Platform.WIN10);
		driver = new RemoteWebDriver(new URL("http://10.160.2.128:5555/wd/hub"), capability);
	}

	@Test
	public void m2() throws MalformedURLException {

		DesiredCapabilities capability = DesiredCapabilities.chrome();
		capability.setBrowserName(BrowserType.CHROME);
		capability.setPlatform(Platform.WIN10);
		driver = new RemoteWebDriver(new URL("http://10.160.21.46:5551/wd/hub"), capability);
	}

	@AfterMethod
	public void fb() throws InterruptedException {

		driver.get("https://s4testing.nic.in/sarathiservice/stateSelection.do");
		driver.manage().window().maximize();
		String str = driver.getCurrentUrl();
		System.out.println(str);
		String str1 = driver.getTitle();
		System.out.println(str1);

	}

	@BeforeMethod
	public void launch() {
		System.out.println("Running");
	}

}
