package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Syed\\Desktop\\OSA0122202322A\\Class folder\\Mitul Vhai class note 06.04.2023\\Selenium\\chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.get("https://www.osaconsultingtech.com");
		String hpTitle=dr.getTitle();
		System.out.println(hpTitle);
		dr.findElement(By.xpath("//a[text()='Forum']")).click();
		Thread.sleep(3000);
		String fpTitle=dr.getTitle();
		System.out.println(fpTitle);
		dr.findElement(By.id("username")).sendKeys("myusername@osa.com");
		Thread.sleep(3000);
		dr.findElement(By.name("password")).sendKeys("Sabiha34@");
		Thread.sleep(5000);
		dr.findElement(By.xpath("//button[@id='login_button']")).click();
		Thread.sleep(5000);
		dr.quit();	
		
		
		
	}
	
	 
	

}
