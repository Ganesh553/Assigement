package p1;

public class TwoDarray {

	public static void main(String[] args) 
	{
		int rows = 2; 
		int columns = 4;
		int[][] A = {{1, 1, 1, 1}, {2, 3, 5, 2}};
        int[][] B = {{2, 3, 4, 5}, {2, 2, 4, -4}};
        int sum = 0;
        for (int i=0; i<=rows-1; i++)
        {
        	for(int j=0;j<=columns-1;j++)
        	{
        		sum=sum + A[i][j];
        	}
        }
        System.out.println("Sum of 2D array is "+sum);

		
	}

}
