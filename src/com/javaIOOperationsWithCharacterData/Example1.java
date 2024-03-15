package com.javaIOOperationsWithCharacterData;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example1 {

	public static void main(String[] args) throws IOException
	{
		
		File inputFile = new File("D:\\New folder\\Java Development\\Workspace_internship1\\IO\\message1.txt");
		FileReader fileReader = new FileReader(inputFile);
		
		File outputFile = new File("D:\\New folder\\Java Development\\Workspace_internship1\\IO\\message4.txt");
		FileWriter fileWriter = new FileWriter(outputFile);
		
		try
		{
			int i = 0;
			
			while((i = fileReader.read()) != -1)
			{
				fileWriter.write(i);
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			fileReader.close();
			fileWriter.close();
		}
		
	}

}
