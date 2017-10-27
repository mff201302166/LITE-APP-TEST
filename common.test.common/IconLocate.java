package com.test.common;

import  java.util.List;

import  org.openqa.selenium.WebElement;

public class IconLocate extends StartAppium {
	public static WebElement Icon;
	public static WebElement findIcon(String locateWay,String path,boolean multiElements,int n){
		//单元素查找		
		if(locateWay=="ID" & multiElements==false)
		{
			Icon=driver.findElementById(path);
		}
		else if(locateWay=="XPATH" & multiElements==false)
		{
			Icon=driver.findElementByXPath(path);
		}
		else if(locateWay=="CLASSNAME" & multiElements==false)
		{
			Icon=driver.findElementByClassName(path);
		}
		else if(locateWay=="ANDROIDUIAUTOMATOR" & multiElements==false)
		{
			Icon=driver.findElementByAndroidUIAutomator(path);
		}
		
		//多元素查找
		else if(locateWay=="ID" & multiElements==true)
		{
			List <WebElement> Icons=driver.findElementsById(path);	
			Icon=Icons.get(n);
		}
		else if(locateWay=="XPATH" & multiElements==true)
		{
			List <WebElement> Icons=driver.findElementsByXPath(path);
			Icon=Icons.get(n);
		}
		else if(locateWay=="CLASSNAME" & multiElements==true)
		{
			List <WebElement> Icons=driver.findElementsByClassName(path);
			Icon=Icons.get(n);
		}
	   
		return Icon;
			
	}
  

}
