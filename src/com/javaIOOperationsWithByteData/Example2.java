package com.javaIOOperationsWithByteData;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example2 {

	public static void main(String[] args) throws IOException
	{
		
		String text = "Hello Guys, How are you, i hope your doing well";
		
		File file = new File("D:\\New folder\\Java Development\\Workspace_internship1\\IO\\message1.txt");

		FileOutputStream fileOutputStream = new FileOutputStream(file);		
		
		try
		{
			if(fileOutputStream != null)
			{
				byte byteValues[] = text.getBytes();
				
				fileOutputStream.write(byteValues);
				
				System.out.println("the data stored in file");
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			fileOutputStream.close();
		}
		
	}

}
