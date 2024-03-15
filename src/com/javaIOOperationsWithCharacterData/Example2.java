package com.javaIOOperationsWithCharacterData;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example2 {

	public static void main(String[] args) throws IOException
	{
		
		File inputFile = new File("D:\\New folder\\Java Development\\Workspace_internship1\\IO\\message1.txt");
		FileReader fileReader = new FileReader(inputFile);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		File outputFile = new File("D:\\New folder\\Java Development\\Workspace_internship1\\IO\\message5.txt");
		FileWriter fileWriter = new FileWriter(outputFile);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		
		try
		{
			int i = 0;
			
			while((i = bufferedReader.read()) != -1)
			{
				bufferedWriter.write(i);
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			bufferedReader.close();
			bufferedWriter.close();
		}
		
	}

}
