package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\PC\\studies\\Programming\\Java eclipse\\Java selenium\\SeleniumTestDay4\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/oracle-training.html");
		
		WebElement text = driver.findElement(By.xpath("//p[text()='Awarded as the ']"));
		WebElement text1 = driver.findElement(By.xpath("//p[text()='Rated as ']"));
		
		String write = text.getText();
		System.out.println(write);
		
		String write1 = text1.getText();
		System.out.println(write1);
	
	}
	
	

}
