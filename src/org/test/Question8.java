package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question8 {
	
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","C:\\PC\\studies\\Programming\\Java eclipse\\Java selenium\\SeleniumTestDay4\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	WebElement text = driver.findElement(By.name("q"));
	
	text.sendKeys("greens velmurugan");
	
	WebElement click1 = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]"));
	
	click1.click();
	
	WebElement click2 = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[1]/a/h3"));
	click2.click();
	
	}
	
	
	
}
