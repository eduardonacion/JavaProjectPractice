import java.util.Scanner;
public class test3{
	public static void main (String args []){
	float result; int opr; float n1; float n2; float quo; float mod;
	Scanner oper = new Scanner (System.in);
	Scanner num1 = new Scanner (System.in);
	Scanner num2 = new Scanner (System.in);
	System.out.print("Enter a number:");
	n1 = num1.nextInt();
	System.out.print("Enter another number:");
	n2 = num2.nextInt();
	System.out.println("\nSelect an Operation \n [1] Addition\n [2] Subtraction\n [3] Multiplication\n [4] Division\n [5] Modulo Division\n");
	System.out.print("Operation:");
	opr = oper.nextInt();
	System.out.print("\n");
	
	
	switch (opr){
		case (1):
		result = n1+n2;
		System.out.println(n1 + "+" + n2 + "=" + result);
		break;
		case (2):
		result = n1-n2;
		System.out.println(n1 + "-" + n2 + "=" + result);
		break;
		case (3):
		result = n1*n2;
		System.out.println(n1 + "*" + n2 + "=" + result);
		break;
		case (4):
		quo = n1/n2;
		System.out.println(n1 + "/" +  n2 + "=" + quo);
		break;
		case (5):
		mod = n1%n2;
		System.out.println(n1 + "%" + n2 + "=" + mod);
		break;
	}
	
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}