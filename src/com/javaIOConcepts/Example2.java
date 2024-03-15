package com.javaIOConcepts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example2 {

	public static void main(String[] args) throws IOException
	{
		
		String name;
		
		//Scanner scanner = new Scanner(System.in);
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your name: ");
		
		try
		{
			name = reader.readLine();//reading input			
			System.out.println(name);//writing on the console
		}
		catch (IOException e) 
		{
			
			e.printStackTrace();
			
		}
		finally 
		{
			reader.close();
		}

	}

}
