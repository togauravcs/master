package ibmgroup.Automation_UI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePageTest {
	

	@Test
	public void openGmail() throws InterruptedException
	{
		System.out.println("Test Case 1");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GauravSingh\\Desktop\\Selen\\Automation_UI\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
		WebElement searchBox = driver.findElement(By.xpath("//input[@title='Search']"));
		searchBox.click();
		searchBox.sendKeys("Gmail");
		searchBox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
	}
	@Test
	public void testMethod2()
	{
		System.out.println("Method2");
	}
	@Test
	public void testMethod3()
	{
		System.out.println("Method3");
	}
	@Test
	public void testMethod4()
	{
		System.out.println("Method4");
	}
	@Test
	public void testMethod5()
	{
		System.out.println("Method5");
	}
}
