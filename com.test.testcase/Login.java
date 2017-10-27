package com.test.testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.test.common.*;

public class Login extends StartAppium {
	@Parameters({"username","password"})
	@Test
	//输入错误的用户名或密码
	public void errorLogin(String username,String password) throws Exception
	{
		try{
			toLogin(username, password);
			Thread.sleep(3000);
			driver.findElementById("com.android.intest.xin.cttdb:id/printview_log_id");
			driver.findElementsByAndroidUIAutomator("text(\"登录失败，用户名或密码错误\")");
			
		}
		catch(Exception e){
			ScreenShot.getScreenShot(driver, "异常登录");
			
		}
		
	}
	//未重置手机号
	public void noResetLogin(String username,String password) throws Exception
	{
		try{
			toLogin(username, password);
			driver.findElementById("com.android.intest.xin.cttdb:id/printview_log_id");
			driver.findElementByAndroidUIAutomator("test(\"您的账号与手机绑定失败，如若需要，请到云服务网重置!\")");	
			
		}
		catch(Exception e){
			ScreenShot.getScreenShot(driver, "未重置手机号异常");
		}
		
	}
	//重置手机号后第一次登陆
	public void resetLogin(String username,String password)throws Exception
	{
		try{
			toLogin(username, password);
			driver.findElementById("com.android.intest.xin.cttdb:id/printview_log_id");
			driver.findElementByAndroidUIAutomator("test(\"您的账号与手机绑定失败，请重新绑定\")");
			WebElement bindPhoneIcon=IconLocate.findIcon("ID", "com.android.intest.xin.cttdb:id/btn_rebund_id", false, 0);
			IconOperate.clickIcon(bindPhoneIcon);
			Thread.sleep(3000);
			driver.findElementById("com.android.intest.xin.cttdb:id/img_car_id");
			
		}
		catch(Exception e){
			ScreenShot.getScreenShot(driver, "第一次正常登录异常");
		}
		
	}
	//重置手机号后非第一次登陆
	public void correctLogin(String username,String password)throws Exception
	{
		try{
			
		}
		catch(Exception e){
			ScreenShot.getScreenShot(driver, "非第一次正常登录异常");
		}
		toLogin(username, password);
		driver.findElementById("com.android.intest.xin.cttdb:id/printview_log_id");

	}
	
	public void toLogin(String username,String password)
	{
		WebElement userInputIcon=IconLocate.findIcon("ID", "com.android.intest.xin.cttdb:id/log_id_usename", false, 0);
		IconOperate.sendKeys(userInputIcon, username);
		WebElement pwordInputIcon=IconLocate.findIcon("ID", "com.android.intest.xin.cttdb:id/log_id_pass", false, 0);
		IconOperate.sendKeys(pwordInputIcon, password);
		WebElement login=IconLocate.findIcon("ID", "com.android.intest.xin.cttdb:id/log_id_but", false, 0);
		IconOperate.clickIcon(login);
}
	
	

}
