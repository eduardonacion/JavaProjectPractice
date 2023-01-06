//import.java.util.*;

	public class FPractice5{
		public static void main (String args[]){
		
		int sum = 0;
		for(int i=0; i < args.length; i++){
			System.out.println(args[i]);
			
			sum=sum+Integer.parseInt(args[i]);
		}
		System.out.println("The Sum is: " + sum);
		System.out.println("The average is: " + ((double)sum/args.length));
		
		}
	}