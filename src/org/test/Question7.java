package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question7 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\PC\\studies\\Programming\\Java eclipse\\Java selenium\\SeleniumTestDay4\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement text = driver.findElement(By.id("email"));
		
		text.sendKeys("rajkumar344@gmail.com");
		
		String write = text.getAttribute("value");
		
		WebElement text1 = driver.findElement(By.id("pass"));
		
		text1.sendKeys("rajkumar344");
		
		String write1 = text1.getAttribute("value");
		
		System.out.println(write);
		System.out.println(write1);
		

		
		
	}

}
