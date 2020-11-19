package p1;

import java.util.Random;
import java.util.Scanner;

public class Day19 {

	public static void main(String[] args) {
		int WagPerHour = 20;
		int FullDayHour = 8;
		int PartTimeHour = 8;
		int Monthwage = 20;
		int present = 1;
		
        Random rand = new Random();       
    	int a = rand.nextInt(2)+1;
    	if (a == present)
    		System.out.println("Employe is Prenent");
    	else
    		System.out.println("Employe is Absent");
    	System.out.println("Select wages of employee 1.dailywage 2.partTimewage 3.monthlywage=> ");
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	
    	switch (n) {
    	  case 1:
    		  System.out.println("Daily Wages of Employee is");
    		  int totalDaylyWages = FullDayHour * WagPerHour;
    		  System.out.println("RS."+totalDaylyWages);
    	    break;
    	  case 2:
    		  System.out.println("Part Time Employee And Wages");
    		  int PartTimeWage = FullDayHour * WagPerHour * PartTimeHour;
    		  System.out.println("RS."+PartTimeWage);
    	    break;
    	  case 3:
    		  System.out.println("Total wages for a Month(20 Days) include partTime of Employee ");
    		  int TotalWageMonth = WagPerHour * FullDayHour * Monthwage * PartTimeHour;
    		  System.out.println("RS."+TotalWageMonth);
      	    break;
    	  default:
    		    System.out.println("You'r not selected proper number");   		    
    	}
	}
}
