package p1;

import java.util.Scanner;

public class MaxMin {
	public static void main(String arg[]) {
		
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Enter first number- ");  
		int n = sc.nextInt(); 
		int [] arr = new int[n];
		int small = arr[0];
        int big = arr[0];
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
		System.out.println(arr.length); 
		for (int j=0;j<=arr.length-1;j++)
		{
			if(arr[j] > big)
                big = arr[j];
        else if (arr[j] < small)
                small = arr[j];
		}
		System.out.println("Largest Number is : " + big);
        System.out.println("Smallest Number is : " + small);
	}
}
