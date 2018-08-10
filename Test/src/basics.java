import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basics extends test{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver= capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//FindElementbyxpath("//classname[@attribute='value']")
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click(); 
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		
		//FindElementbyid("attributevalue")
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementById("android:id/edit").sendKeys("Hello_Aravind_You_did_it");
		driver.findElementByXPath("//android.widget.Button[@text='OK']").click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		
		
//		driver.findElementByXPath("//*[@resource-id='android:id/text1[3]']").click();
//		driver.findElementById("//android.widget.TextView:3[@resource-id='android:id/text1").click();
		

	}

}
