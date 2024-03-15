package com.javaIOOperationsWithByteData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Example3 {

	public static void main(String[] args) throws IOException
	{
		
		File file = new File("D:\\New folder\\Java Development\\Workspace_internship1\\IO\\message1.txt");

		//FileOutputStream fileOutputStream = new FileOutputStream(file);
		
		FileInputStream fileInputStream = new FileInputStream(file);
		
		try
		{
			int i = 0;
			
			while((i = fileInputStream.read()) != -1)
			{
				System.out.print((char)i);
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			fileInputStream.close();
		}
		
	}

}
