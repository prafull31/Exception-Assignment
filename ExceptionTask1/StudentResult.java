package com.yash.ExceptionTask1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentResult {
	int Marathi;
	int English;
	int Physics;
	int Chemistry;
	int total;
	
	Scanner sc = new Scanner(System.in);
	public void checkResult() throws Exception
	{
		System.out.println("Marathi");
		Marathi = sc.nextInt();
		System.out.println("English");
		English=sc.nextInt();
		System.out.println("Physics");
		Physics=sc.nextInt();
		System.out.println("Chemistry");
		Chemistry=sc.nextInt();
		
		total=((Marathi+English+Physics+Chemistry)*100/400);
		System.out.println(total);
		
		if(Marathi<0||English<0||Physics<0||Chemistry<0)
		{
			throw new NegativeMarksException("Negative Input");
		}
		
		if(Marathi<35||English<35||Physics<35||Chemistry<35)
		{
			throw new FailInOneSubject("fail in more than one sub");
		}
		if(total<(160*100)/400)
		{
			throw new FailExeption("Fail");
		}
		
	}
	public static void main(String[] args) throws Exception {
		StudentResult sr = new StudentResult();
		sr.checkResult();
	}

}
