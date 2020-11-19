package p1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);      
		System.out.print("Enter first number- "); 
		int n = sc.nextInt(); 
		int [] arr = new int[n];
		System.out.println("Enter the elements of the array: ");  
		for(int i=0; i<n; i++)  
		{    
		arr[i]=sc.nextInt();  
		}  
		System.out.println("Array elements are: "); 
		for (int i=0; i<n; i++)   
		{  
		System.out.println(arr[i]);  
		}	
		int duplicate[] = new int[arr.length];
		int j=0;
		for (int i=0; i<arr.length-1; i++)   
		{  
		  if (arr[i] != arr[i+1])
		  {
			  duplicate[j] = arr[i];
			  j++;
		  }
		}
		duplicate[j++] = arr[arr.length-1];
		System.out.println("Remove dublicate Array : ");
		for (int i=0; i<n; i++)   
		{  
		System.out.println(duplicate[i]);  
		}
	}
}
