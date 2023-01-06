import java.util.*;
public class fprac11{
	public static void main(String args[]) { 
	Scanner input = new Scanner (System.in);
	String x = input.nextLine();
	greet();
	greet(x);
	greet("Nacion");
	greet(21);
	greet("Nacion", 21,14);
	
	}
	public static void greet(){
		System.out.println("Hello ");
	}
	public static void greet(String fname){
		System.out.println("Hello "+ fname);
	}	
	public static void greet(int age){
		System.out.println("My age is "+ age);
	}
	public static void greet(String fname,int age){
		System.out.println("Name:"+fname+"\n Age:"+age);
	}
	public static void greet(String fname,int age,int years){
		System.out.println("Name: "+fname+"\n Age: "+age+ "\nYears in teaching "+years);
	}
}