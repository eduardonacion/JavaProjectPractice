import java.util.*;
	public class NACION_FMP3{

		public static void main (String args[]){
			
	Scanner input = new Scanner (System.in);
	
		int a[][] = new int[3][3]; 
		int b[][] = new int[3][3]; 
		int c[][] = new int[3][3]; 
		
		System.out.print("ENTER VALUE FOR TABLE A \n");
			for (int row = 0; row < a.length; row++){
				for (int col = 0; col< a.length; col++){
				System.out.print( "A["+row+"]["+col+ "]:");
					a[row][col]= input.nextInt();
				}
			}
		System.out.print("ENTER VALUE FOR TABLE B \n");
			for (int row = 0; row < b.length; row++){
				for (int col = 0; col< b.length; col++){
				System.out.print( "B["+row+"]["+col+ "]:");
					b[row][col]= input.nextInt();
				}
			}
		System.out.print("TABLE A \n");
			for (int row = 0; row < a.length; row++){
				for (int col = 0; col< a.length; col++){
				System.out.print(a[row][col]);
				System.out.print("\t");
				}
				System.out.println();
			}
		System.out.print("TABLE b \n");
			for (int row = 0; row < b.length; row++){
				for (int col = 0; col< b.length; col++){
				System.out.print(b[row][col]);
				System.out.print("\t");
				}
				System.out.println();
			}
		
		System.out.print("TABLE C \n");
			for (int row = 0; row < c.length; row++){
				for (int col = 0; col< c.length; col++){
				c[row][col]= a[row][col]+b[row][col];
				System.out.print(c[row][col]);
				System.out.print("\t");
				}
				System.out.println();
			}
			
		
			
		}
	}
				