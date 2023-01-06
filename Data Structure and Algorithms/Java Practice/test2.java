import java.util.Scanner;
public class test2{
	public static void main(String[] args){
	Scanner num = new Scanner (System.in);
	System.out.print("Enter a Number:");
	int no = num.nextInt();
	System.out.print("Binary:");
	
	int a;
	while ('a'>0){
	a = no % 2;
	System.out.print(a);
	}
}
}
	
	