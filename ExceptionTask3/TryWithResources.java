package com.yash.ExceptionTask3;

import java.util.Scanner;

public class TryWithResources {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value");
		int b=sc.nextInt();
		try
		{
		 System.out.println("try ");
		 
		 int a= b/0;
		 
		 System.out.println(a);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("catch block");
		}
		finally
		{
			System.out.println("finally block");
		}
		
		
	}

}
