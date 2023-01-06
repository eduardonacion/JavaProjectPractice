import java.util.Scanner;

public class NACION_FMP1 {

    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
        System.out.println("What is your first integer");
            int first = input.nextInt();
        System.out.println("What is your second integer");
            int second = input.nextInt();
            int third = 0;
            int mul = 0;
            int rem = 0;
            int quo = 0;
        for (int i = 0; i < second ; i+=1) {
            mul = third += first;
           }
                System.out.println("The Product is " +  mul);
        
        for (int i = first;  first >= second ; i++) {
            first = first - second;     
            quo++;
        }
                System.out.println("The Quotient is " +  quo);      
        for (int i = 0; first >= second ; i++){
            first = first - second;
        }
                System.out.println("The Remainder is " +  first);
    }
}
