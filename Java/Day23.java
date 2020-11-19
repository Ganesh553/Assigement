package p1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Day23 {

	static int WagPerHour;
	static int FullDayHour;
	static int PartTimeHour;
	static int Monthwage;
	public static void main(String[] args) 
	{
		int present = 1;
						
        Random rand = new Random();       
    	int a = rand.nextInt(2)+1;
    	if (a == present)
    		System.out.println("Employe is Prenent");
    	else
    		System.out.println("Employe is Absent");
    	
    	int dailywage = DailyWageEmployee(20, 8);
    	
    	int partTimewage = PartTimeWageEmployee(20, 8, 8);
    	int monthlywage = MonthlyWages(20, 20, 8, 8);
    	int monthlywageWithinHrs = TotalMonthlyWages(20, 100, 20);
    	System.out.println("Select wages of employee 1.dailywage 2.partTimewage 3.monthlywage 4.100hr working in 20 days => ");
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
    	 	
    	HashMap map = new HashMap();
    	map.put("Dailywage", dailywage);
    	map.put("PartTimewage", partTimewage);
    	map.put("Monthlywage", monthlywage);
    	map.put("MonthlywageWithinHrs", monthlywageWithinHrs);
    	System.out.println(map);
    	
    	switch (n) {
    	  case 1:
    		  System.out.println("Daily Wages of Employee is");
    		  System.out.println("RS."+dailywage);
    	    break;
    	  case 2:
    		  System.out.println("Part Time Employee And Wages");
    		  System.out.println("RS."+partTimewage);
    	    break;
    	  case 3:
    		  System.out.println("Total wages for a Month(20 Days) include partTime of Employee ");
    		  System.out.println("RS."+monthlywage);
      	    break;
    	  case 4:
    		  System.out.println("Total wages for a Month(20 Days) and 100 working hour of Employee ");
    		  System.out.println("RS."+monthlywageWithinHrs);
      	    break;
    	  default:
    		    System.out.println("You'r not selected proper number");   		    
    	}  	
   	}
    static int TotalMonthlyWages(int Monthwage, int exacthours, int WagPerHour) {
		int Totalwage = Monthwage * exacthours * WagPerHour;
		return Totalwage;
	}
	static int MonthlyWages(int Monthwage, int WagPerHour, int PartTimeHour, int FullDayHour) {
		int TotalWageMonth = Monthwage * WagPerHour * PartTimeHour * FullDayHour;
		return TotalWageMonth;
	}
	static int PartTimeWageEmployee(int WagPerHour, int FullDayHour, int PartTimeHour ) {
		int PartTimeWage = FullDayHour * WagPerHour * PartTimeHour;
		 return PartTimeWage;
	}
	static int DailyWageEmployee(int WagPerHour, int FullDayHour ) {
		 int totalWage = FullDayHour * WagPerHour;
		 return totalWage;
	}
}
