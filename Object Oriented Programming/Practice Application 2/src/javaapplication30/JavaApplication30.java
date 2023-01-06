package javaapplication30;
import java.util.Scanner;
public class JavaApplication30 {

    public static void main(String[] args) {

	int numbers = 111 ;//one million two hundred thirty four thounsands five hundred sixty seven pesos
	if (numbers < 0){
		System.out.print ("Negative ");
		numbers*=-1;
	}
         int millions = (int)numbers/1000000;
        int millions1 = (int) numbers % 1000000;
        
if (millions == 1){
	System.out.print("one million ");
}
 else if (millions == 2){
	System.out.print("two million ");	
}
else if (millions== 3){
	System.out.print("three million ");
}
else if (millions == 4){
	System.out.print("four million ");
}
else if (millions == 5){
	System.out.print("five million ");
}
else if (millions == 6){
	System.out.print("six million ");
}
else if (millions == 7){
	System.out.print("seven million ");
}
else if (millions == 8){
	System.out.print("eight million ");
}
else if (millions == 9){
	System.out.print("nine million ");
}
        int hundredthousands = (int) millions1/100000;
        int hundredthousands1 = (int) millions1 % 100000;

if ( hundredthousands == 1){
	System.out.print("one hundred ");
}
 else if (hundredthousands == 2){
	System.out.print("two hundred ");	
}
else if (hundredthousands== 3){
	System.out.print("three hundred ");
}
else if (hundredthousands == 4){
	System.out.print("four hundred ");
}
else if (hundredthousands == 5){
	System.out.print("five hundred ");
}
else if (hundredthousands == 6){
	System.out.print("six hundred ");
}
else if (hundredthousands == 7){
	System.out.print("seven hundred ");
}
else if (hundredthousands== 8){
	System.out.print("eight hundred ");
}
else if (hundredthousands == 9){
	System.out.print("nine hundred ");
}
        int tenthousands = (int)hundredthousands1/10000;
        int tenthousands1 = (int) hundredthousands1 % 10000;

if ( tenthousands == 1){
	System.out.print("one ");
}
if (tenthousands1 == 10){
	System.out.print("Ten");
}
else if (tenthousands1 == 11){
	System.out.print("Eleven");
}
else if (tenthousands1 == 12){
	System.out.print("Twelve");
}
else if (tenthousands1 == 13){
	System.out.print("Thirteen");
}
else if (tenthousands1 == 14){
	System.out.print("Fourteen");
}
else if (tenthousands1 == 15){
	System.out.print("Fithteen");
}
else if (tenthousands1 == 16){
	System.out.print("Sixteen");
}
else if (tenthousands1 == 17){
	System.out.print("Seventeen");
}
else if (tenthousands1 == 18){
	System.out.print("Eighteen");
}
else if (tenthousands1 == 19){
	System.out.print("Nineteen");
}
 else if (tenthousands  == 2){
	System.out.print("twenty ");	
}
else if (tenthousands == 3){
	System.out.print("thirty ");
}
else if (tenthousands  == 4){
	System.out.print("fourty ");
}
else if (tenthousands == 5){
	System.out.print("fifty ");
}
else if (tenthousands  == 6){
	System.out.print("sixty ");
}
else if (tenthousands == 7){
	System.out.print("Seventy ");
}
else if (tenthousands == 8){
	System.out.print("Eighty ");
}
else if (tenthousands  == 9){
	System.out.print("Ninety ");
}        
    int thousand = tenthousands1 /1000;
    int thousand1 = tenthousands1  % 1000;


if (thousand == 1){
	System.out.print("one thousand");
}
if (thousand == 2){
	System.out.print("two thousand");	
}
if (thousand == 3){
	System.out.print("three thousand ");
}
if (thousand == 4){
	System.out.print("four thousand ");
}
if (thousand == 5){
	System.out.print("five thousand ");
}
if (thousand == 6){
	System.out.print("six thousand ");
}
if (thousand == 7){
	System.out.print("seven thousand ");
}
if (thousand == 8){
	System.out.print("eight thousand ");
}
if (thousand == 9){
	System.out.print("nine thousand ");
}
		int hundreds = thousand1 / 100;


if (hundreds == 1){
	System.out.print("One hundred ");
}
else if (hundreds == 2){
	System.out.print("Two hundred ");
}
else if (hundreds == 3){
	System.out.print("Three hundred ");
}
else if (hundreds == 4){
	System.out.print("Four hundred ");
}
else if (hundreds == 5){
	System.out.print("Five hundred ");
}
else if (hundreds == 6){
	System.out.print("Six hundred ");
}
else if (hundreds == 7){
	System.out.print("Seven hundred ");
}
else if (hundreds == 8){
	System.out.print("Eight hundred ");
}
else if (hundreds == 9){
	System.out.print("Nine hundred ");
}
    

int hundreds1 = thousand1 % 100;

if (hundreds1 == 10){
	System.out.print("Ten");
}
else if (hundreds1 == 11){
	System.out.print("Eleven");
}
else if (hundreds1 == 12){
	System.out.print("Twelve");
}
else if (hundreds1 == 13){
	System.out.print("Thirteen");
}
else if (hundreds1 == 14){
	System.out.print("Fourteen");
}
else if (hundreds1 == 15){
	System.out.print("Fithteen");
}
else if (hundreds1 == 16){
	System.out.print("Sixteen");
}
else if (hundreds1 == 17){
	System.out.print("Seventeen");
}
else if (hundreds1 == 18){
	System.out.print("Eighteen");
}
else if (hundreds1 == 19){
	System.out.print("Nineteen");
}

		int tens = hundreds1 / 10;
		int tens1 = hundreds1 % 10;

if (tens == 1){
	System.out.print("One ");
}
else if (tens == 2){
	System.out.print("Twenty ");
}
else if (tens == 3){
	System.out.print("Thirty ");
}
else if (tens == 4){
	System.out.print("Fourty ");
}
else if (tens == 5){
	System.out.print("Fifty ");
}
else if (tens == 6){
	System.out.print("Sixty ");
}
else if (tens == 7){
	System.out.print("Seventy ");
}
else if (tens == 8){
	System.out.print("Eighty ");
}
else if (tens == 9){
	System.out.print("Ninety ");
}
		int once = tens1 / 1;
		int once1 = tens1 % 1;
if (once == 1){
	System.out.print("One");
}
else if (once == 2){
	System.out.print("Two");
}
else if (once == 3){
	System.out.print("Three");
}
else if (once == 4){
	System.out.print("Four");
}
else if (once == 5){
	System.out.print("Five");
}
else if (once == 6){
	System.out.print("Six");
}
else if (once == 7){
	System.out.print("Seven");
}
else if (once == 8){
	System.out.print("Eight");
}
else if (once == 9){
	System.out.print("Nine");
}
        }
    }


	

        



    