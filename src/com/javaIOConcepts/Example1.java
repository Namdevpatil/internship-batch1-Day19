package com.javaIOConcepts;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		
		String name;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		name = scanner.nextLine();//reading input
		
		scanner.close();
		
		System.out.println(name);//writing on the console

	}

}
