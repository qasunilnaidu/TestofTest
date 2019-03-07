package pack1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Same_Code_Diff_Browers {

	@Test
	public void Method1() throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setBrowserName("firefox");

		capabilities.setPlatform(Platform.WINDOWS.WIN10);
		WebDriver driver = new RemoteWebDriver(new URL("http://10.160.2.128:5555/wd/hub"), capabilities);
		driver.get("https://s4testing.nic.in/sarathiservice/stateSelection.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String S1 = driver.getCurrentUrl();
		System.out.println(S1);
		driver.navigate().to("https://www.google.com/");
		String S2 = driver.getTitle();
		System.out.println(S2);
		driver.navigate().back();
	}

	@Test
	public void Method6() throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setBrowserName("firefox");
		capabilities.setPlatform(Platform.WINDOWS.WIN10);
		WebDriver driver = new RemoteWebDriver(new URL("http://10.160.21.46:5551/wd/hub"), capabilities);
		driver.get("https://s4preprod.nic.in:8443/sarathiservice/sarathiHomePublic.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String S1 = driver.getCurrentUrl();
		System.out.println(S1);
		driver.navigate().to("https://www.google.com/");
		String S2 = driver.getTitle();
		System.out.println(S2);
		driver.navigate().back();
	}

}
