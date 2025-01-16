package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static final String url="https://sis.neotechacademy.com";
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("tUsername")).sendKeys("Admin");
		driver.findElement(By.id("tPassword")).sendKeys("Neotech$123");
		driver.findElement(By.name("bLogin")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Students")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
