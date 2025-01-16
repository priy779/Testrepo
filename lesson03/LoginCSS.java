package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginCSS {

	public static final String url="https://sis.neotechacademy.com";
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.cssSelector("#tUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("#tPassword")).sendKeys("Neotech$123");  //id
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".buttonBig")).click();    //class
		driver.findElement(By.cssSelector("a[href*='Students']")).click();  //* means includes
		Thread.sleep(2000);
		driver.quit();

	}

}
