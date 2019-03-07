package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Claa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver = new FirefoxDriver();
		driver.get("http://learn-automation.com/selenium-webdriver-tutorial-for-beginners/");
		driver.manage().window().maximize();

		String actual_msg = driver.findElement(By.xpath("//h1[@class='entry-title']")).getText();

		System.out.println(actual_msg);
	}

}
