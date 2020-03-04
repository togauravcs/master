package ibmgroup.Automation_UI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocationPageTest {
	@Test
	public void openFacebook() throws InterruptedException
	{
		System.out.println("Test Case 2");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GauravSingh\\Desktop\\Selen\\Automation_UI\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@title='Search']"));
		searchBox.click();
		searchBox.sendKeys("facebook");
		searchBox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
	}
	@Test
	public void testMethod_21()
	{
		System.out.println("Method21");
	}
	@Test
	public void testMethod_31()
	{
		System.out.println("Method31");
	}
	@Test
	public void testMethod_41()
	{
		System.out.println("Method41");
	}
	@Test
	public void testMethod_51()
	{
		System.out.println("Method51");
	}
}
