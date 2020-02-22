package org.selenium.webdriver;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test extends Base{
	public static void main(String[] args) {
		
	System.out.println("Entering the main..");
	

	// Browser Launch
	launch("https://www.facebook.com");	
	WebElement user = driver.findElement(By.id("email"));
	fill(user,"shankar");
	WebElement pass = driver.findElement(By.id("pass"));
	fill(pass,"shankar");
	
	WebElement btn = driver.findElement(By.id("loginbutton"));
	klik(btn);
	kill();
	}
	
}
