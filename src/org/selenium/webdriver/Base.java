package org.selenium.webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	static WebDriver driver;

	public static void launch(String s)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\TNEB\\workspace\\Drivers\\src\\ChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(s);
	}
	
	
	public static void fill(WebElement w, String s)
	{
		w.sendKeys(s);
	}
	
	public static void klik(WebElement w)
	{
		w.click();
	}
	
	public static void kill()
	{
		driver.close();
	}
	
	
}
