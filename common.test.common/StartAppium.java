package com.test.common;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeSuite;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.BeforeTest;

public class StartAppium extends BaseDriver {
	@BeforeTest(alwaysRun = true)  
    public void setUp() throws Exception {  
        //����appium  
        DesiredCapabilities capabilities = new DesiredCapabilities();  
        capabilities.setCapability("deviceName","lge-nexus_4-005475cbccd279d4");  
        capabilities.setCapability("automationName","Appium");  
        capabilities.setCapability("platformName","Android");  
        capabilities.setCapability("platformVersion","6.0");  
          
       //���ò���apk  
        capabilities.setCapability("appPackage", "com.android.intest.xin.cttdb");  
        capabilities.setCapability("appActivity","com.android.intest.cttdb.activity.WellComeActivity");  
        capabilities.setCapability("sessionOverride", true);    //ÿ������ʱ����session������ڶ��κ����лᱨ�����½�session  
        capabilities.setCapability("unicodeKeyboard", true);    //���ü���  
        capabilities.setCapability("resetKeyboard", false);     //����Ĭ�ϼ���Ϊappium�ļ���  
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);  
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);  
        
    } 
	
	@AfterTest(alwaysRun = true)  
    public void tearDown() throws Exception {  
        driver.quit();  
    } 
}
