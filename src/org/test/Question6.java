package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question6 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\PC\\studies\\Programming\\Java eclipse\\Java selenium\\SeleniumTestDay4\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/testimonial.html");
		
		WebElement text = driver.findElement(By.xpath("//strong[contains(text(),'Sekhar')]"));
		
		String write = text.getText();
		
		System.out.println(write);

	}

}
