package com.test.common;

import io.appium.java_client.android.AndroidDriver;

public class Swipe {
	private static int width=0;
	private static int height=0;
	private static void screenSize(AndroidDriver driver){
		 width=driver.manage().window().getSize().width;
	     height=driver.manage().window().getSize().height;
	}
	public static void swipeToLeft(AndroidDriver driver,int duration,int num){
		screenSize(driver);
		for(int i=0;i<num;i++){
			driver.swipe(width*7/8, height/2, width/8, height/2,duration);
		}
		;
	}
	
	public static void swipeToRight(AndroidDriver driver,int duration,int num){
		screenSize(driver);
		for(int i=0;i<num;i++){
			driver.swipe(width/4, height/2, width*3/4, height/2, duration);
		}
	}
	
	public static void swipeUp(AndroidDriver driver,int duration,int num){
		screenSize(driver);
		for(int i=0;i<num;i++){
			driver.swipe(width/2, height*3/4, width/2, height/4, duration);
		}
		
	}
	
	public static void swipeDown(AndroidDriver driver,int duration,int num){
		screenSize(driver);
		for(int i=0;i<num;i++){
			driver.swipe(width/2, height/4, width/2, height*3/4, duration);
		}
	}


}
