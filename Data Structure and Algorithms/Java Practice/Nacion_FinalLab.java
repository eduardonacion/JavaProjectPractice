
import java.util.*;
public class Nacion_FinalLab {

      public static void main (String args[]){
        int am [] = new int[7];
        String Currency = args[0];
            GetCurrency(args[0]);
        int number = Integer.parseInt(args[1]);
        GetAmount(number,am);
        ToWords(am);
      }

     

      public static void GetCurrency(String a){
          String currency = a;

          if (a.equalsIgnoreCase("Usd")){
              
          }

      }

     

      public static void GetAmount(int b,int a[]){
        
        int millions = (int)b/1000;
        a[1]= millions;
        int millions1 = (int) b % 1000;
        int hundredthousands = (int) millions/100000;
        a[2]= hundredthousands;
        int hundredthousands1 = (int) millions% 100000;
        int tenthousands = (int)hundredthousands/10000;
        a[3]= tenthousands;
        int tenthousands1 = (int) hundredthousands % 10000;
        int thousand = (int)tenthousands/1000;
        a[4]= thousand;
        int thousand1 = (int) tenthousands % 1000;
        int hundreds = (int) thousand / 100;
        a[5]= hundreds;
        int hundreds1 = (int) thousand % 100;
        int tens = (int) hundreds / 10;
        a[6]= tens;
        int tens1 = (int) hundreds % 10;
        int once = (int) tens/ 1;
        a[7]= once;
        int once1 = (int) tens % 1;
        
        }

 

     

      public static void GetCentavo(int c){


      }

     

      public static void ToWords(int a[]){
if (a[1] == 1){
	System.out.print("One millions ");
}
 else if (a[1] == 2){
	System.out.print("Two millions ");	
}
else if (a[1] == 3){
	System.out.print("Three millions ");
}
else if (a[1] == 4){
	System.out.print("Four millions ");
}
else if (a[1] == 5){
	System.out.print("Five millions ");
}
else if (a[1] == 6){
	System.out.print("Six millions ");
}
else if (a[1] == 7){
	System.out.print("Seven millions ");
}
else if (a[1] == 8){
	System.out.print("Eight millions ");
}
else if (a[1] == 9){
	System.out.print("Nine millions ");
}

if (a[2] == 1){
	System.out.print("One hundred thousand ");
}
 else if (a[2] == 2){
	System.out.print("Two hundred thousand ");	
}
else if (a[2] == 3){
	System.out.print("Three hundred thousand ");
}
else if (a[2] == 4){
	System.out.print("Four hundred thousand ");
}
else if (a[2] == 5){
	System.out.print("Five hundred thousand ");
}
else if (a[2] == 6){
	System.out.print("Six hundred thousand ");
}
else if (a[2] == 7){
	System.out.print("Seven hundred thousand ");
}
else if (a[2] == 8){
	System.out.print("Eight hundred thousand ");
}
else if (a[2] == 9){
	System.out.print("Nine hundred thousand ");
}

if (a[3] == 1){
	System.out.print("One ten thousand ");
}
 else if (a[3] == 2){
	System.out.print("Two ten thousand ");	
}
else if (a[3]== 3){
	System.out.print("Three ten thousand ");
}
else if (a[3] == 4){
	System.out.print("Four ten thousand ");
}
else if (a[3]== 5){
	System.out.print("Five ten thousand ");
}
else if (a[3] == 6){
	System.out.print("Six ten thousand ");
}
else if (a[3]== 7){
	System.out.print("Seven ten thousand ");
}
else if (a[3]== 8){
	System.out.print("Eight tenthousand ");
}
else if (a[3] == 9){
	System.out.print("Nine tenthousand ");
}
    



if (a[4] == 1){
	System.out.print("One thousand ");
}
 else if (a[4] == 2){
	System.out.print("Two thousand ");	
}
else if (a[4] == 3){
	System.out.print("Three thousand ");
}
else if (a[4] == 4){
	System.out.print("Four thousand ");
}
else if (a[4] == 5){
	System.out.print("Five thousand ");
}
else if (a[4] == 6){
	System.out.print("Six thousand ");
}
else if (a[4] == 7){
	System.out.print("Seven thousand ");
}
else if (a[4] == 8){
	System.out.print("Eight thousand ");
}
else if (a[4] == 9){
	System.out.print("Nine thousand ");
}


if (a[5] == 1){
	System.out.print("One hundred ");
}
else if (a[5] == 2){
	System.out.print("Two hundred ");
}
else if (a[5] == 3){
	System.out.print("Three hundred ");
}
else if (a[5] == 4){
	System.out.print("Four hundred ");
}
else if (a[5] == 5){
	System.out.print("Five hundred ");
}
else if (a[5] == 6){
	System.out.print("Six hundred ");
}
else if (a[5] == 7){
	System.out.print("Seven hundred ");
}
else if (a[5] == 8){
	System.out.print("Eight hundred ");
}
else if (a[5] == 9){
	System.out.print("Nine hundred ");
}

if (a[6] == 10){
	System.out.print("Ten");
}
else if (a[6]== 11){
	System.out.print("Eleven");
}
else if (a[6] == 12){
	System.out.print("Twelve");
}
else if (a[6] == 13){
	System.out.print("Thirteen");
}
else if (a[6] == 14){
	System.out.print("Fourteen");
}
else if (a[6]== 15){
	System.out.print("Fithteen");
}
else if (a[6] == 16){
	System.out.print("Sixteen");
}
else if (a[6] == 17){
	System.out.print("Seventeen");
}
else if (a[6] == 18){
	System.out.print("Eighteen");
}
else if (a[6] == 19){
	System.out.print("Nineteen");
}
else if (a[6] == 1){
	System.out.print("One ");
}
else if (a[6] == 2){
	System.out.print("Twenty ");
}
else if (a[6] == 3){
	System.out.print("Thirty ");
}
else if (a[6] == 4){
	System.out.print("Fourty ");
}
else if (a[6] == 5){
	System.out.print("Fifty ");
}
else if (a[6] == 6){
	System.out.print("Sixty ");
}
else if (a[6] == 7){
	System.out.print("Seventy ");
}
else if (a[6] == 8){
	System.out.print("Eighty ");
}
else if (a[6] == 9){
	System.out.print("Ninety ");
}		
if (a[7] == 1){
	System.out.print("One");
}
if (a[7] == 2){
	System.out.print("Two");
}
if (a[7] == 3){
	System.out.print("Three");
}
if (a[7] == 4){
	System.out.print("Four");
}
if (a[7] == 5){
	System.out.print("Five");
}
if (a[7] == 6){
	System.out.print("Six");
}
if (a[7] == 7){
	System.out.print("Seven");
}
if (a[7] == 8){
	System.out.print("Eight");
}
if (a[7] == 9){
	System.out.print("Nine");
}	

	}
}