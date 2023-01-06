import java.util.*;
public class fprac12{
	public static void main(String args[]) { 
	Scanner input = new Scanner (System.in);
	int x = input.nextInt();
	square(x);
	System.out.println("The square of "+n+ "is " + (n*n));
	power(2,3);
	}
	public static void square(int n){
		return n*n;
	}
	public static void power(int base, int exp){
		int p = base;
		for(int i = 1; i <exp; i++){
			p = p*base;
		}
		System.out.println("The product is "+p);
	}
}