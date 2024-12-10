package com.varification.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Varification {
	
	public static void main(String[] args) throws InterruptedException {
		
		
  System.setProperty("webdriver.crome.driver","C:\\Users\\Syed\\Desktop\\OSA0122202322A\\Class folder\\Mitul Vhai class note 06.04.2023\\Selenium\\chromedriver.exe\\");
		
		ChromeDriver dr=new ChromeDriver();
		dr.get("https://www.osaconsultingtech.com");
		dr.findElement(By.xpath("//a[text()='Forum']")).click();
		Thread.sleep(3000);
		dr.findElement(By.id("username")).sendKeys("diamondsabiha@gmail.com");
		Thread.sleep(5000);
		dr.findElement(By.name("password")).sendKeys("Mu*****");
        dr.findElement(By.xpath("//button[@id='login_button']")).click();
		Thread.sleep(5000);
		
		String expectedstudentpagetitle= "Student Page";
		String actualstudentpagetitle=dr.getTitle();
		if(expectedstudentpagetitle.equals(actualstudentpagetitle)) {
			
			System.out.println("Status:pass");
		}
		
		
		else {
			System.out.println("Status:Failed");
			System.out.println("Expected Value:" +expectedstudentpagetitle);
			System.out.println("Expected Value  :" +actualstudentpagetitle);
		}
		
	    dr.quit();	
  
  
  
  
  
  
	}
	
	
	
	

}
