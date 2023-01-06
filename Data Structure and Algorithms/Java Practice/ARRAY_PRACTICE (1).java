//import java.util.*;

public class ARRAY_PRACTICE{

	public static void main(String args[]){
		
		int quiz1 = 80;
		int quiz2 = 85;
		int quiz3 = 90;
		int quiz4 = 95;
		int quiz5 = 100;
		
		System.out.println("QUIZ 1:" + quiz1);
		System.out.println("QUIZ 2:" + quiz2);
		System.out.println("QUIZ 3:" + quiz3);
		System.out.println("QUIZ 4:" + quiz4);
		System.out.println("QUIZ 5:" + quiz5);
		
		System.out.println("\n\n~ USING ARRAY ~");
		int quiz[] = {80,85,90,95,100};
		
		System.out.println("\nQUIZ 1:" + quiz[0]);
		System.out.println("QUIZ 2:" + quiz[1]);
		System.out.println("QUIZ 3:" + quiz[2]);
		System.out.println("QUIZ 4:" + quiz[3]);
		System.out.println("QUIZ 5:" + quiz[4]);
	
	int seatwork[] = {70,75,76,77,78,79,80};
	System.out.println("\n\nseatwork1:" + seatwork[0]);
	System.out.println("seatwork1:" + seatwork[1]);
	System.out.println("seatwork1:" + seatwork[2]);
	System.out.println("seatwork1:" + seatwork[3]);
	System.out.println("seatwork1:" + seatwork[4]);
	System.out.println("seatwork1:" + seatwork[5]);
	System.out.println("seatwork1:" + seatwork[6]);
	
	String names[] = {
		"Stefani",
		"Garett",
		"Russell",
		"Martin"
	};
	System.out.println("\n\nFRIEND 1:" + names[0]);
	System.out.println("FRIEND 2:" + names[1]);
	System.out.println("FRIEND 3:" + names[2]);
	System.out.println("FRIEND 4:" + names[3]);
		
	System.out.println("\n\n ~other declaration~");
	
	String firstName[] = {
		
		new String("Pondivida"),
		new String("Russell Elds"),
		new String("Mejorada"),
	};
	System.out.println("\nSURNAME:" + firstName[0]);
	System.out.println("FIRST NAME:" + firstName[1]);
	System.out.println("MIDDLE NAME:" + firstName[2]);
	
	
	System.out.println("\n\n ~ Different Declaration ~");
	
	int majorsExam [] = new int[2];
		majorsExam[0] = 86;
		majorsExam[1] = 97;
		
	System.out.println("\nPRELIMS SCORE:" + majorsExam[0]);
	System.out.println("\nPRELIMS SCORE:" + majorsExam[1]);
	}

		
}	
	
		