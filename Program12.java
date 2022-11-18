package javaChallenge12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

//Given an array of integers arr, return true if the number of occurrences of each value in the array is unique, or false otherwise.
//
//Example 1:
//
//Input: arr = [1,2,2,1,1,3]
//Output: true
//Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
//Example 2:
//
//Input: arr = [1,2]
//Output: false
//Example 3:
//
//Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
//Output: true
public class Program12 {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the size of an array");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int [] intArray = new int[size];
		System.out.println("================================");
		System.out.println("Enter array elements");
		for(int i=0;i<=size-1;i++)
		{
			intArray[i]=sc.nextInt();
		}
		sc.close();
		Arrays.sort(intArray);
		int count=0;
		Set<Integer> intSet = new LinkedHashSet<Integer>();
		for(int i=0;i<=size-1;i++)
		{
			intSet.add(intArray[i]);
			
		}
		
	
		List<Integer> intList = new ArrayList<Integer>(intSet);
		List<Integer> resultList = new ArrayList<Integer>();
		
		for(int i=0; i<=intList.size()-1;i++) 
		{
			count=0;
			for(int j=0;j<=size-1;j++)
			{
				
				if(intList.get(i)==intArray[j])
				{
					
 					count++;
				}
				
			}
			
			resultList.add(count);
			
			
		}
		
		//System.out.println(resultList);
		
		Set<Integer> resultSet = new LinkedHashSet<Integer>();
		boolean add =true;
		for(int i=0;i<=resultList.size()-1;i++)
		{
			 add= resultSet.add(resultList.get(i));
			if(add==false)
			{
				
				break;
			}
		
		}
		
		if(add==false)
		{
			System.out.println(add);
		}
		else
		{
			System.out.println(add);
		}
		
		
	}
	
}