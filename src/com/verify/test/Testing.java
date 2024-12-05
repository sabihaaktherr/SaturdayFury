package com.verify.test;

public class Testing {
	
	public static void verify(String expectedValue,String actualValue) {
		 
      if(expectedValue.equals(actualValue)) {
			
			System.out.println("Status:Pass");
		}
		
		else {
			System.out.println("Status:Failed");
			System.out.println("Expected Value:  " +expectedValue);
			System.out.println("Expected Value  :" +actualValue);
		
		}
		
	}
	 

}
