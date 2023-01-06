public class Practice2{
	public static void main (String args []){
	
	int sum; int dif; int prod; float quo; float mod;
	
	int n1 = 10; int n2 = 3;
	float n3 = 10; float n4 = 3;
	
	sum = n1 + n2;
	dif = n1 - n2;
	prod = n1 * n2;
	quo = n3 / n4;
	mod = n3 % n4;
	
	System.out.println("Sum:" + sum);
	System.out.println("Difference:" + dif);
	System.out.println("Product:" + prod);
	System.out.println("Quotient:" + quo);
	System.out.println("Modulo:" + mod);
	System.out.println("");
	
	// the shift left (<<) operator
	int x = 13;
	System.out.println(x<<2);
	System.out.println("");
	// the shift right (>>) operator
	x = 13;
	System.out.println(x>>2);
	System.out.println("");
	// the unsigned shift right (>>>) operator
	x = 1357;
	System.out.println(x>>>5);
	System.out.println("");
	//the relational operators
	
	System.out.println(n1 == n2);
	System.out.println(n1 != n2);
	System.out.println(n1 >= n2);
	System.out.println(n1 <= n2);
	System.out.println(n1 < n2);
	System.out.println(n1 > n2);
	System.out.println("");
	// Bitwise and (&) Operator
	
	x = 13; int y = 9;
	System.out.println(x & y);
	System.out.println("");
	// Bitwise and (|) Operator
	
	x = 13; y = 9;
	System.out.println(x | y);
	System.out.println("");
	
	// Bitwise and (^) Operator
	x = 13; y = 9;
	System.out.println(x ^ y);
	System.out.println("");
	
	//Logical or operator (&) vs. the short circuit or (&&)operator
	int a = 5; int b = 10;
	System.out.println((a < 5) & (++b != 10));
	System.out.println("a=" + a + "\tb=" + b);
	System.out.println("");
	System.out.println((a < 5) && (++b != 10));
	System.out.println("a=" + a + "\tb=" + b);

	//Logical or operator (|) vs. the short circuit or (||)operator
	System.out.println((a < 5) | (++b != 10));
	System.out.println("a=" + a + "\tb=" + b);
	System.out.println("");
	System.out.println((a < 5) || (++b != 10));
	System.out.println("a=" + a + "\tb=" + b);
	System.out.println("");
	
	//ternary operator
	int quiz = 70;
	if (quiz>=70){
		System.out.println("Pass");
	} 
	else {
		System.out.println("Fail");
	}
		
	System.out.println((quiz>=70) ? "Pass" : "Fail");
	
	char gndr = 'f';
	if (gndr=='m'){
		System.out.println("Male");
	} 
	else {
		System.out.println("Female");
	}
		
	System.out.println((gndr=='m') ? "Male" : "Female");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}