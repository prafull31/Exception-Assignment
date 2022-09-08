package com.yash.Exceptiontask10;

public class Test 
{
	 static int arr[] = {20,34, 50,110, 120,181};
     
     
     static int largest()
     {
         int i;
          
         
         int max = arr[0];
       
        
         for (i = 1; i < arr.length; i++)
             if (arr[i] > max)
                 max = arr[i];
       
         return max;
     }
      
     
     public static void main(String[] args)
     {
         System.out.println("Largest in given array is " + largest());
     }
 }