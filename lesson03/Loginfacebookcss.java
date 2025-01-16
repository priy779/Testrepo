package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginfacebookcss {

	public static final String url="https://www.facebook.com/";
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.cssSelector("#email")).sendKeys("test");
		driver.findElement(By.cssSelector("#pass")).sendKeys("test1");
		driver.findElement(By.cssSelector("button[name='login']")).click();

	}

}
