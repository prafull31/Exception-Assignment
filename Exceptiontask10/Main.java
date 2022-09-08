package com.yash.Exceptiontask10;

public class Main 
{
   public static void main(String[] args)
   {
	   int []arr = {20,34, 50,110, 120,181};
       int n = arr.length;
       ParentClass pc = new ParentClass();
       ParentClass cc = new ChildClass();
       System.out.println(pc.largest(arr, n));
       System.out.println(cc.largest(arr, n));
   }
}
