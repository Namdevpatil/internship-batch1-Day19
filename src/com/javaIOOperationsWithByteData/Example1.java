package com.javaIOOperationsWithByteData;

import java.io.File;
import java.io.IOException;

public class Example1 {

	public static void main(String[] args) throws IOException
	{
		
		File file = new File("D:\\New folder\\Java Development\\Workspace_internship1\\IO\\message1.txt");

		if(file.exists())
		{
			System.out.println("the file is exists");
		}
		else
		{
			System.out.println("the file is not exists");
		}
		
	}

}
