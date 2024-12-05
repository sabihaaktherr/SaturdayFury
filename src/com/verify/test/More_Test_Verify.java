package com.verify.test;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;


public class More_Test_Verify {
	ChromeDriver dr;
	
	//@Ignore
	@Test
	public  void VerifyhomepageTitle() throws InterruptedException {
		
		String expectedhomepageTitle="OSA Consulting Tech Corp || Best Available Resources For Software Industry";
		String actualhomepagetitle=dr.getTitle();		
		Testing.verify(expectedhomepageTitle, actualhomepagetitle);
		Thread.sleep(5000);	
	}
		
	
	@Test
		public  void varifyforumpageTitle() throws InterruptedException {
		    
			dr.findElement(By.xpath("//a[text()='Forum']")).click();
			Thread.sleep(5000);
			String expectedForumpageTitle="OSA Consulting Tech - All the projects.";
			String actualForumpagetitle=dr.getTitle();		
			Testing.verify(expectedForumpageTitle, actualForumpagetitle);
				
			}
			
		
	@Test
	public  void varifystudentpageTitle() throws InterruptedException {
		
		dr.findElement(By.xpath("//a[text()='Forum']")).click();
		Thread.sleep(5000);
		dr.findElement(By.id("username")).sendKeys("diamondsabiha@gmail.com");
		Thread.sleep(5000);
		dr.findElement(By.name("password")).sendKeys("Munna5090");
       dr.findElement(By.xpath("//button[@id='login_button']")).click();
		Thread.sleep(5000);
		
		String expectedstudentpagetitle= "Student Page";
		String actualstudentpagetitle=dr.getTitle();
		Testing.verify(expectedstudentpagetitle, actualstudentpagetitle);
		
		
	
	}
    
	@Before
	public void before() {
		dr= openBrowser();
	}
	
	@After
	public void after() { 
		dr.quit();
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("=========Start The Case=========");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("+++++++++Complete The Case++++++++++");
		
		
		
	}
	
	public  ChromeDriver openBrowser()  {
		
		System.setProperty("webdriver.crome.driver", "C:\\Users\\Syed\\Desktop\\OSA0122202322A\\Class folder\\Mitul Vhai class note 06.04.2023\\Selenium\\chromedriver.exe\\");
		ChromeDriver dr=new ChromeDriver();
		dr.get("https://www.osaconsultingtech.com");
		
		return dr;
	}
	
	
	
}


