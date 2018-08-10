import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class test {

    public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
        // TODO Auto-generated method stub
        File f= new File("src");
        File fl=new File(f,"ApiDemos-debug.apk");
        
    
DesiredCapabilities cp= new DesiredCapabilities();
cp.setCapability(MobileCapabilityType.DEVICE_NAME, "aravind");
cp.setCapability(MobileCapabilityType.APP,fl.getAbsolutePath()); 
AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cp);
return driver;
}
}