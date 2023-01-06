import java.util.*;
	public class NACION_FMP2{

		public static void main (String args[]){
			
	Scanner input = new Scanner (System.in);
	
	int temp,swap;
	
	int sort[] = new int [10];
	
		for (int i = 0; i <sort.length; i++){
		System.out.print("arr["+ i + "]:");
			sort [i] = input.nextInt();
		}
		do {
			swap = 0;
			for (int i = 0; i <sort.length-1; i++){
			if (sort[i]>sort[i+1]){
				temp =sort[i];
				sort[i]=sort[i+1];
				sort[i+1] = temp;
				swap = 1;
			}
		}
			}while (swap == 1);
					System.out.print("\n ASENDING ORDER \n");
					for (int i = 0; i <sort.length; i++){
					System.out.println(sort[i]);
			}
			
		do {
			swap = 0;
			for (int i = 0; i <sort.length-1; i++){
			if (sort[i]<sort[i+1]){
				temp =sort[i];
				sort[i]=sort[i+1];
				sort[i+1] = temp;
				swap = 1;
			}
		}
			}while (swap == 1);
					System.out.print("\n DESCENCING ORDER \n");
					for (int i = 0; i <sort.length; i++){
					System.out.println(sort[i]);
			}
			
			

		}
	}
		
		