package com.test.testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.test.common.*;

public class Login extends StartAppium {
	@Parameters({"username","password"})
	@Test
	//���������û���������
	public void errorLogin(String username,String password) throws Exception
	{
		try{
			toLogin(username, password);
			Thread.sleep(3000);
			driver.findElementById("com.android.intest.xin.cttdb:id/printview_log_id");
			driver.findElementsByAndroidUIAutomator("text(\"��¼ʧ�ܣ��û������������\")");
			
		}
		catch(Exception e){
			ScreenShot.getScreenShot(driver, "�쳣��¼");
			
		}
		
	}
	//δ�����ֻ���
	public void noResetLogin(String username,String password) throws Exception
	{
		try{
			toLogin(username, password);
			driver.findElementById("com.android.intest.xin.cttdb:id/printview_log_id");
			driver.findElementByAndroidUIAutomator("test(\"�����˺����ֻ���ʧ�ܣ�������Ҫ���뵽�Ʒ���������!\")");	
			
		}
		catch(Exception e){
			ScreenShot.getScreenShot(driver, "δ�����ֻ����쳣");
		}
		
	}
	//�����ֻ��ź��һ�ε�½
	public void resetLogin(String username,String password)throws Exception
	{
		try{
			toLogin(username, password);
			driver.findElementById("com.android.intest.xin.cttdb:id/printview_log_id");
			driver.findElementByAndroidUIAutomator("test(\"�����˺����ֻ���ʧ�ܣ������°�\")");
			WebElement bindPhoneIcon=IconLocate.findIcon("ID", "com.android.intest.xin.cttdb:id/btn_rebund_id", false, 0);
			IconOperate.clickIcon(bindPhoneIcon);
			Thread.sleep(3000);
			driver.findElementById("com.android.intest.xin.cttdb:id/img_car_id");
			
		}
		catch(Exception e){
			ScreenShot.getScreenShot(driver, "��һ��������¼�쳣");
		}
		
	}
	//�����ֻ��ź�ǵ�һ�ε�½
	public void correctLogin(String username,String password)throws Exception
	{
		try{
			
		}
		catch(Exception e){
			ScreenShot.getScreenShot(driver, "�ǵ�һ��������¼�쳣");
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
