package com.javaSerializationAndDeSerilization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {

	public static void main(String[] args) throws IOException
	{
		
	
		File inputFile = new File("D:\\New folder\\Java Development\\Workspace_internship1\\IO\\productObject.txt");
		FileInputStream fileInputStream = new FileInputStream(inputFile);
		
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		
		try
		{
			
			Product product = (Product) objectInputStream.readObject();
			
			System.out.println(product.toString());
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			objectInputStream.close();
		}
		
	}


}
