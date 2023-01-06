public class FinalsPractice
{
	public static void main(String[] args) {
//hetero array
        /*	Object arr[] = new Object [5];
		arr[0] = new String ("I love hatdogs");
		arr[1] = new Integer (5);
		int t = (Integer)arr[1];
		System.out.println(arr[1]);
        */
        //printing "array" of 5
	/*	
		int array[] = new int [5];
		array[0] = 5;
		array[1] = 5;
		array[2] = 5;
		
	for(int i = 0; i< array.length;i++){
	   	System.out.println(array[i]); 
    }
    //enchanced for loop
for ( int f: array){
    System.out.println("This is an enchanced for loop");
        System.out.println(f);
}
*/
// arraycopy
       /* int orig [] = {1,2,3,4,5};
        int temp[]= {10,9,8,7,6,5,4,3,2,1};
        System.arraycopy(orig,1,temp,2,orig.length-1);
        orig = temp;
        temp = null;
        
        for (int num: orig){
            System.out.print(num);
        }
*/
//substring - used to extract a portion of a string object
String tite = "United States of America";
    System.out.println(tite.substring(6));
    System.out.println(tite.substring(0,3));
//length method - length() provides the number of characters in the string
        int length = tite.length();
        System.out.println("The number of words: "+length);
//charAt() method - used to find (fine) the char at any string position
System.out.println("charAt method");
System.out.println(tite.charAt(1));
//concat() method - used to concatenate strings
String a = "I love";
String b = "You, parents!";
String c = a.concat(b);
System.out.println(c + " from Sian!");
//replace() method - replace characters in String
String x = "Adrian Garett";
String y = x.replace('t', '1');
System.out.println(x);
System.out.println("After being replaced");
System.out.println(y);
//toLowerCase() & toUpperCase() - converting strings to lowercase and vice versa
String pogi = "sdfjKODFJklfgdfkog";
System.out.println(pogi.toUpperCase());
System.out.println(pogi.toLowerCase());
//the equals() method - this method compares if both of them have same length and characters in the same sequence
String ey = "Adrian";
String why = "adRiAN";
System.out.println(ey.equals(why));
//not equal becuase String why is has a space at the end of the string

//equalsIgnoreCase() - Compares this String to another String, ignoring case considerations. 
System.out.println(ey.equalsIgnoreCase(why));
//compareTo() method - Compares two strings lexicographically.  
String name = "Abigail";
String name2 = "abigail";
//if name and name 2 are equal the value is 0
//if name is less than name 2, the value is negative
//if name comes after b the value is positive
System.out.println(name.compareTo(name2));

//trim() method- used to remove white spaces
String kobe = "         Kobeeee                  ";
System.out.println(kobe);
System.out.println(kobe.trim( ));
 //split() method - Splits this string around matches of the given regular expression.
        String str = "word1, word2@@, word3@word4?word5.word6";
        String results [] = str.split("[, ?.@]+");
        for(String k: results){
            System.out.println(k);
        }
        //another example
        String str2 = "Adriannnnnnnnnn";
        String results2 [] = str2.split("n");
        for (String kk:results2){
            System.out.println(kk);
        }
        //last example
        //i removed the spaces of my name thus printing it per line but it can also print in one line by using print only
        String str3="Adrian Garett Sian";
        String results3 [] = str3.split(" ");
        for(String kkk: results3){
            System.out.println(kkk);
        }
        
}
}
