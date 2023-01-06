//import.java.util.*;

	public class FPractice7{
		public static void main (String args[]){
		
		int mult[][] = new int [10][10];
		
		//Storing the value to array and displaying
		
			for(int row=0 ; row<10 ; row++){
				for(int col=0 ; col<10 ; col++){
					mult[row][col] = (row + 1)*(col + 1);
					System.out.print("\t" + mult[row][col]);
					
				}
				System.out.println();
			}
			
		}
	}