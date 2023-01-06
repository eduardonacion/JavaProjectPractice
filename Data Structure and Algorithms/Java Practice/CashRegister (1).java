package schoolrelated;

import java.util.Scanner;

public class CashRegister {

    public static void main(String[] args) {

        int arr[][] = {{40,0}, {45,0}, {70,0}, {50,0}, {30,0}}; // array for the price of the foods 
        
        DisplayMenu(); //diplsay menu method

        SelectItem(); //select item method

    }
//menu of the product

    public static void DisplayMenu() {
        System.out.println();
        System.out.println("----Menu-----");
        System.out.println("Hamburger....... 40.00");
        System.out.println("Cheese Burger....... 45.00");
        System.out.println("Chicken meal....... 70.00");
        System.out.println("Spaghetti....... 50.00");
        System.out.println("French Fries........ 30.00");
        System.out.println();
    }

    public static void SelectItem() {
        Scanner input = new Scanner(System.in);
        String  another = ""; //dictates for another entry
        
        do{
            System.out.print("Select Item: ");
            int item = input.nextInt();
            System.out.print("Select Quantity");
            int quantity = input.nextInt();
            
            //array
            System.out.println("Select another item?    ");
            another = input.next();
        }while(another.charAt9=)
            
            
        }
    }


