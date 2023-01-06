package cashregister;

import java.util.Scanner;

public class CashRegister {

    public static void main(String[] args) {

        int val[] = {0,40,45,70,50,30};
        int finalqty[] = new int [6];
        String menu [] = {null, "Hamburger","Cheese Burger","Chicken meal","Spaghetti","French Fries"};
                
        DisplayMenu();

        SelectItem(val,finalqty,menu); 

    }


    public static void DisplayMenu() {
        System.out.println();
        System.out.println("----Menu-----");
        System.out.println("[1]Hamburger     . . . . . .  40.00");//9
        System.out.println("[2]Cheese Burger . . . . . .  45.00");//11
        System.out.println("[3]Chicken meal  . . . . . .  70.00");//12
        System.out.println("[4]Spaghetti      . . . . . . 50.00");//8
        System.out.println("[5]French Fries . . . . . . . 30.00");//12
        System.out.println();
    }

    public static void SelectItem(int a[], int b[],String c[]) {
        Scanner input = new Scanner(System.in);
        int item1 = 0;
	int item2 = 0;
	int item3 = 0;
        int item4 = 0;
        int item5 = 0;
        
        char  another = ' '; 
        int product;
        int quantity;
        do{
            System.out.print("Select Item: ");
                product = input.nextInt();
            System.out.print("Select Quantity: ");
                quantity = input.nextInt();
           
        switch(product){
            case 1:
                item1 = item1 + quantity;
                b[1] = item1;
                break;
            case 2:
                item2 = item2 + quantity;
                b[2] = item2;
                break;
            case 3:
                item3 = item3 + quantity;
                b[3] = item3;
                break;
            case 4:
                item4 = item4 + quantity;
                b[4] = item4;
                break;
           case 5:
                item5 = item5 + quantity;
                b[5] = item5;
                break;
        }
              
            System.out.println("Select another item? Y/N   ");
                another = input.next().charAt(0);
          }while ((another == 'y') || (another == 'Y'));
                
                    
        System.out.println("ITEMS/s ORDERED ---------------- QUANTITY ---------------- AMOUNT");
        int total;
        for (int i = 0; i <b.length; i++) {
                if(b[i] != 0){
                    System.out.println(c[i]+"    . . . . . ."+a[i]+"------------"+ b[i]+"-------------"+b[i]*a[i]);
                }
            }
        }

}


    


