public class Practice1{
	public static void main (String args[]){
		System.out.println(5+10);
		System.out.println("5"+"10");
		System.out.println();
		System.out.println(5+10+"abc");
		System.out.println("abc"+5+10);
		System.out.println(3.333333333333333333333333333333333333);
		
		//casting 1
		byte b1 = 5;
		byte b2 = 10;
		byte b3 = (byte) (b1+b2);
		System.out.println("B3="+b3);
		
		//toggle operator
		boolean isOpen = true;
		System.out.println(!isOpen);
		
		//binary toggle operator
		int x = 1357;
		System.out.println(x);
		//to make it negative (model: changing positive to negative (value +1) or vice versa change 1 to 0 and 0 to 1)
		System.out.println(~x);
		
		//pre or post increment (++) operator
		int a  = 0; int b = 0;
		System.out.println("a="+--a);
		System.out.println("b="+b--);
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		
	}
}
	