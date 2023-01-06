public class practice5{
    public static void main(String[] args) {
		int number = 4357;
		int newones;
		int hun;
		int newtens;
		int tens;
		int newhundred;
		int newthou;

			
				newones = number/1000;
				hun = number % 1000;
				newtens = hun/100;	
				tens = hun % 100;
				newhundred = tens/10;
				newthou = tens % 10;
				
	System.out.println(number + "" + newthou + newones + newtens+ newhundred);
		
		
		
		
		
		}
	}
	