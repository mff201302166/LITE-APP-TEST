package com.test.testcase;

import org.openqa.selenium.WebElement;
import  org.testng.annotations.Test;

import com.test.common.IconLocate;
import com.test.common.IconOperate;
import com.test.common.StartAppium;
import com.test.common.Swipe;

public class FirstToAPP extends StartAppium  {
	@Test
	public void toLoginPage() throws Exception
	{
	    Thread.sleep(2000);
	    Swipe.swipeToLeft(driver,800,1);
	    Thread.sleep(1000);
	    Swipe.swipeToLeft(driver,800,1);
		Thread.sleep(1000);
		Swipe.swipeToLeft(driver,800,1);
		Thread.sleep(1000);
		Swipe.swipeToLeft(driver,800,1);
		Thread.sleep(1000);
		Swipe.swipeToLeft(driver,800,1);
		Thread.sleep(1000);
	    WebElement nowEx=IconLocate.findIcon("ID", "com.android.intest.xin.cttdb:id/btn_start_use_id", false, 0);
		IconOperate.clickIcon(nowEx);   
	   
	}
	

}
