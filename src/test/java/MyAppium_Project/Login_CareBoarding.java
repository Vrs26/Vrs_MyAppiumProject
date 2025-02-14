package MyAppium_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;


import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Login_CareBoarding extends Appium_BaseClass {
	

	@Test
	
	public void Login_module() {
		
		//Select the language and Continue click
		
		driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc='Continue']")).click();
		
		// GetStart button
		
		driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@content-desc='Get Started']")).click();
		
		// enter the Email
		

       driver.findElement(AppiumBy.className("//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView")).sendKeys("viraj@youmail.com");
		
		// Enter the password

		driver.findElement(AppiumBy.xpath("//android.widget.EditText")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText")).sendKeys("Viraj@9999");
		
	
	}
	
	
	

}
