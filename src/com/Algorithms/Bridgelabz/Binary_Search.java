package com.Algorithms.Bridgelabz;

import java.util.Scanner;

public class Binary_Search
{
	int binarySearch(int element[] , int key , int start , int end)
	{
		
		while(start <= end)
		{
			int mid = (end +start)/2;
			
			if(element[mid] == key)
			{
				return mid;
			}
			
			if (element[mid] < key)
			{
				start = mid + 1;
			}
			
			else
				end = mid - 1;
		}
		
		return 1;
		
}
	
	
	public static void main(String a[])
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number of Array Element Do you Want :");
		int num = sc.nextInt();
		System.out.println("Enter the Array Element");
		
		int i;
		int element[] = new int[num];
		for ( i =0 ; i < num ;i++)
		{
			element[i] = sc.nextInt();
			
		}
		System.out.println("Array Elements:");
		for ( i =0 ; i <num ;i++)
		{
			System.out.print(" "+element[i]);
				
		}
		int n = element.length;
		
		System.out.println("\n Enter the key :");
		int key = sc.nextInt();		
		
		Binary_Search b  = new Binary_Search();
		
		int result = b.binarySearch(element, key, 0, n - 1);
		
		
		for ( i =0 ; i <num ;i++)
		{
			if(key == element[i])
			{
				System.out.println("Key is Founded at location ->" +result);
			}
			
		}
		
				
	}

}
