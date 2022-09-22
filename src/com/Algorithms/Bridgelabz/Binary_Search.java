package com.Algorithms.Bridgelabz;
import java.lang.reflect.Array;
import java.util.*;

public class Binary_Search 
{
	public static void main(String a[])
	{
		
		String arr[] = {"Sneha","Pranit","Prachi","Puja"};
		
		System.out.println(arr);
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the key:-");
		String key=sc.toString(); 
	   int result=Arrays.binarySearch(arr,key);
       if (result <0)
       {
    	   System.out.println("Element is not found!"); 
       }
       else  
               
    	   System.out.println("Element is found: "+result);
	}
}
