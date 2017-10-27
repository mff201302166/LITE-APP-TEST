package com.test.common;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;

import io.appium.java_client.android.AndroidDriver;
public class ScreenShot extends FileOperate {
	public static void getScreenShot(AndroidDriver driver,String screenname)throws Exception{
		SimpleDateFormat formatter=new SimpleDateFormat("yyyy.MM.dd-HH:mm:ss");
		String time=formatter.format(new Date());
		String dirName=System.getProperty("user.dir")+"\\�쳣ͼƬ";
		if(!(new File(dirName).isDirectory())){
			new File(dirName).mkdir();
		}
		File screen=driver.getScreenshotAs(OutputType.FILE);
		copyFile(screen,new File(dirName+"\\"+time+ screenname+".jpg"));				
		
	}

}
