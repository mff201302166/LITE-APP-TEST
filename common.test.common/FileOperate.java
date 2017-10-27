package com.test.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class FileOperate {
	public static void copyFile(File srcFile,File tarFile) throws Exception{
		FileInputStream src=new FileInputStream(srcFile);
		FileOutputStream tar=new FileOutputStream(tarFile);
		int len=0;
		byte[] bytes=new byte[1024];
		while((len=src.read(bytes))!=-1)
		{
			tar.write(bytes, 0, len);
		}
		src.close();
		tar.close();
	}

}
