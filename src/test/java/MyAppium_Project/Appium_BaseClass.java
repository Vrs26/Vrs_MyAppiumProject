package MyAppium_Project;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Appium_BaseClass {
	
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	
	@BeforeClass
	
	public void configureAppium() throws MalformedURLException, InterruptedException {

	    // Set the environment variables for Android and Java SDK paths
	    Map<String, String> env = new HashMap<>(System.getenv());
	    env.put("ANDROID_HOME", "C:\\Users\\Admin\\AppData\\Local\\Android\\Sdk");
	    env.put("JAVA_HOME", "C:\\Program Files\\Java\\jdk-23");

	    // Start the Appium server automatically
	    AppiumDriverLocalService service = new AppiumServiceBuilder()
	            .withAppiumJS(new File("C:\\Users\\Admin\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
	            .withIPAddress("127.0.0.1")
	            .usingPort(4725)
	            .withTimeout(Duration.ofSeconds(300))
	            .build();

	    // Start Appium server
	    service.start();

	    
	    UiAutomator2Options options = new UiAutomator2Options();
	    options.setDeviceName("MyAppiumEmulator1");
	    options.setPlatformName("Android");
	    options.setCapability("platformVersion", "15");
	    options.setApp(System.getProperty("user.dir") + "\\src\\test\\java\\Resource\\app-release.apk");

	    // Initialize the AndroidDriver
	    driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	   
	   // service.stop();
		 
	}

	@AfterClass
	public void tearDown() {
		
	 
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
