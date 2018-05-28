
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.util.Strings;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
public class Train1 {
/*
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException*/
	@SuppressWarnings("unused")
	public static void main(String[] args) throws MalformedURLException {
	//AndroidDriver<AndroidElement> driver;
		File f = new File("src");
	 File fs= new File (f,"selendroid-test-app-0.17.0.apk");	
DesiredCapabilities capabilities = new DesiredCapabilities();
     
     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
     capabilities.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
     AndroidDriver<AndroidElement> driver1 = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    
     driver1.findElementByClassName("android.widget.TextView").click();
     driver1.findElementById("io.selendroid.testapp:id/startUserRegistration").click();
     driver1.findElementById("io.selendroid.testapp:id/inputUsername").sendKeys("bond");
     driver1.findElementById("io.selendroid.testapp:id/inputEmail").sendKeys("bond@mail.com");
     driver1.findElementById("io.selendroid.testapp:id/inputPassword").sendKeys("bond12");
     driver1.findElementById("io.selendroid.testapp:id/inputName").clear();
     
     driver1.findElementById("io.selendroid.testapp:id/inputName").sendKeys("Mr.bond");
     driver1.hideKeyboard();
     driver1.findElementById("io.selendroid.testapp:id/input_preferedProgrammingLanguage").click();
     driver1.findElementByXPath(("//android.widget.CheckedTextView[@text='PHP']")).click();
    // driver1.findElementByClassName("io.selendroid.testapp:id/input_adds").click();
     driver1.findElementByXPath(("//android.widget.Button[@text='Register User (verify)']")).click();
     
     
     
     return;
	}

}
