import java.util.*;

public class fprac13{
	public static void main (String args[]){
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		
		System.out.println(num + "!="+factorial(num));
	}
	public static int factorial(int number){
		if(number==0){
			return 1;
		}
		else{
			return number * factorial(number -1);
		}
	}
}