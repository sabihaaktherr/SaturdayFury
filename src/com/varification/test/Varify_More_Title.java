package com.varification.test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Varify_More_Title {
	
	@Test
	
	
	
//	 public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.crome.driver", "C:\\Users\\Syed\\Desktop\\OSA0122202322A\\Class folder\\Mitul Vhai class note 06.04.2023\\Selenium\\chromedriver.exe\\");
//		ChromeDriver dr=new ChromeDriver();
//		dr.findElement(By.xpath("//a[text()='Forum']")).click();
//		Thread.sleep(5000);
//		dr.findElement(By.id("username")).sendKeys("diamondsabiha@gmail.com");
//		Thread.sleep(5000);
//		dr.findElement(By.name("password")).sendKeys("Mu*****");
//        dr.findElement(By.xpath("//button[@id='login_button']")).click();
//		Thread.sleep(5000);
//		
//		dr.quit();
//
//	}
	
	public  void VerifyhomepageTitle() throws InterruptedException {
		System.setProperty("webdriver.crome.driver", "C:\\Users\\Syed\\Desktop\\OSA0122202322A\\Class folder\\Mitul Vhai class note 06.04.2023\\Selenium\\chromedriver.exe\\");
		ChromeDriver dr=new ChromeDriver();
		dr.get("https://www.osaconsultingtech.com");
		Thread.sleep(5000);	
		String expectedhomepageTitle="OSA Consulting Tech Corp || Best Available Resources For Software Industry";
		String actualhomepagetitle=dr.getTitle();		
		if(expectedhomepageTitle.equals(actualhomepagetitle)) {
			
			System.out.println("Status:Pass");
		}
		
		else {
			System.out.println("Status:Failed");
			System.out.println("Expected Value:  " +expectedhomepageTitle);
			System.out.println("Expected Value  :" +actualhomepagetitle);
		
		}
	
		dr.quit();
	}

	@Test
		public  void varifyforumpageTitle() throws InterruptedException {
			System.setProperty("webdriver.crome.driver", "C:\\Users\\Syed\\Desktop\\OSA0122202322A\\Class folder\\Mitul Vhai class note 06.04.2023\\Selenium\\chromedriver.exe\\");
			ChromeDriver dr=new ChromeDriver();
			dr.get("https://www.osaconsultingtech.com");
			Thread.sleep(5000);	
			dr.findElement(By.xpath("//a[text()='Forum']")).click();
			Thread.sleep(5000);
			String expectedForumpageTitle="OSA Consulting Tech - All the projects.";
			String actualForumpagetitle=dr.getTitle();		
			if(expectedForumpageTitle.equals(actualForumpagetitle)) {
				
				System.out.println("Status:Pass");
			}
			
			else {
				System.out.println("Status:Failed");
				System.out.println("Expected Value:  " +expectedForumpageTitle);
				System.out.println("Expected Value  :" +actualForumpagetitle);
			}
			
			dr.quit();
		
	}
	
	
	@Test
	public  void varifystudentpageTitle() throws InterruptedException {
		System.setProperty("webdriver.crome.driver", "C:\\Users\\Syed\\Desktop\\OSA0122202322A\\Class folder\\Mitul Vhai class note 06.04.2023\\Selenium\\chromedriver.exe\\");
		ChromeDriver dr=new ChromeDriver();
		dr.get("https://www.osaconsultingtech.com");
		Thread.sleep(5000);	
		dr.findElement(By.xpath("//a[text()='Forum']")).click();
		Thread.sleep(5000);
		dr.findElement(By.id("username")).sendKeys("diamondsabiha@gmail.com");
		Thread.sleep(5000);
		dr.findElement(By.name("password")).sendKeys("Munna5090");
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
