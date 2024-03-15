package com.javaIOOperationsWithByteData;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example5 {

	public static void main(String[] args) throws IOException
	{
		
		File inputFile = new File("D:\\New folder\\Java Development\\Workspace_internship1\\IO\\message1.txt");
		FileInputStream fileInputStream = new FileInputStream(inputFile);
		BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
		
		
		File outputFile = new File("D:\\New folder\\Java Development\\Workspace_internship1\\IO\\message3.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
		
		try
		{
			int i = 0;
			
			while((i = bufferedInputStream.read()) != -1)
			{
				bufferedOutputStream.write(i);
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			bufferedInputStream.close();
			bufferedOutputStream.close();
		}
		
	}

}
