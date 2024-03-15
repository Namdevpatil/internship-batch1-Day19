package com.javaIOOperationsWithByteData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example4 {

	public static void main(String[] args) throws IOException
	{
		
		File inputFile = new File("D:\\New folder\\Java Development\\Workspace_internship1\\IO\\message1.txt");
		FileInputStream fileInputStream = new FileInputStream(inputFile);
		
		File outputFile = new File("D:\\New folder\\Java Development\\Workspace_internship1\\IO\\message2.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
		
		try
		{
			int i = 0;
			
			while((i = fileInputStream.read()) != -1)
			{
				fileOutputStream.write(i);
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			fileInputStream.close();
			fileOutputStream.close();
		}
		
	}

}
