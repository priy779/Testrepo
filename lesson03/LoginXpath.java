package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginXpath {

	public static final String url="https://sis.neotechacademy.com";
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='tPassword']")).sendKeys("Neotech$123");
		driver.findElement(By.xpath("//input[@id='bLogin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Students')]")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
