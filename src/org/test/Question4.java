package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question4 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\PC\\studies\\Programming\\Java eclipse\\Java selenium\\SeleniumTestDay4\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/testimonial.html");
		
		WebElement write = driver.findElement(By.id("article-wrapper"));
		
		String text = write.getText();
		System.out.println(text);
	}

}
