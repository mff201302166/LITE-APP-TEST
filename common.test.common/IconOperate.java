package com.test.common;

import org.openqa.selenium.WebElement;

import  org.testng.Assert;

public class IconOperate {
	public static void clickIcon(WebElement Icon)
	{
		Icon.click();
	} 
	public static void sendKeys(WebElement Icon,String message)
	{
		Icon.sendKeys(message);
	}
	public static void ifEquals(WebElement Icon)
	{
		Assert.assertEquals(Icon.isEnabled(),true);
	}

}
