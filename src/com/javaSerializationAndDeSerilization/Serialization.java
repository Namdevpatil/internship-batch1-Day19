package com.javaSerializationAndDeSerilization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) throws IOException
	{
		
	
		File outputFile = new File("D:\\New folder\\Java Development\\Workspace_internship1\\IO\\productObject1.txt");
		FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		
		try
		{
			
			Product product = new Product(2200, "Sony TV", 127822.34);
			objectOutputStream.writeObject(product);
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			objectOutputStream.close();
		}
		
	}


}
