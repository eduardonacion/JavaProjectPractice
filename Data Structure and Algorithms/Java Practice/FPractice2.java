import java.util.*;

public class FPractice2{

	public static void main(String args[]){
	
		int arr[] = new int[10];
		Scanner input = new Scanner(System.in);
		for(int cnt = 0; cnt < arr.length ; cnt++){
			arr[cnt] = input.nextInt();
			
		}
		/*
			arr[0] = 91;
			arr[1] = 92;
			arr[2] = 93;
			arr[3] = 94;
			arr[4] = 95;
			arr[5] = 96;
			arr[6] = 97;
			arr[7] = 98;
			arr[8] = 98;
			arr[9] = 99;*/
			
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println(arr[2]);
			System.out.println(arr[3]);
			System.out.println(arr[4]);
			System.out.println(arr[5]);
			System.out.println(arr[6]);
			System.out.println(arr[7]);
			System.out.println(arr[8]);
			System.out.println(arr[9]);
			
	System.out.println("\n\n ~ USING LOOPING STATEMENT ~");
	
		for(int i = 0; i <= 9; i++){
			
			System.out.println(arr[i]);
			
		}
	
	System.out.println("\n\n ~ USING ENHANCED FOR STATEMENT ~");
	
			for(int ind : arr){
				System.out.println(ind);
			}
			
			String coffee[] = {"Americano", "Mochiatto", "Espresso", "3in1"};
			
				for (String c : coffee){
						System.out.println(c);
				}
	}
}