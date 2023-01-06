import java.util.Scanner;
public class test{
	public static void main (String[] args) {
	Scanner op = new Scanner(System.in);
	System.out.print("Select [1] for Square of asterisks \n \t[2] for Right triangle of asterisks: ");
	int Oper = op.nextInt();
		

if (Oper == 1){
	Scanner sz = new Scanner(System.in);
	System.out.print("Enter size of square: \t");
	int size = sz.nextInt();
	
	for (int row=1; row<=size; ++row){
			for (int col=1; col<=size; ++col){
					System.out.print("* \t");
			}
		System.out.print("\n\n\n");
	}
}

else if (Oper == 2){
	Scanner sz = new Scanner(System.in);
	System.out.print("Enter size: \t");
	int size = sz.nextInt();
	
	for (int row=1; row<=size; ++row){
			for (int col=1; col<=row; ++col){
					System.out.print("* \t");
			}
		System.out.print("\n\n\n");
	}
}
	}
}
	
	
	