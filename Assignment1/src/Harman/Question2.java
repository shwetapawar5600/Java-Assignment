package Harman;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfStudents, n;
		Scanner s=new Scanner(System.in);
		System.out.print("Number of Students: ");
		numberOfStudents=s.nextInt();
		double sum=0;
		int grades[]= new int[numberOfStudents];
		for(int i=0;i<numberOfStudents;i++) {
			System.out.printf("Grade of student %d: ",(i+1));
			n=s.nextInt();
			while(n>100) {
				System.out.println("Invalid garde. Try again...");
				System.out.printf("Grade of student %d: ",(i+1));
				n=s.nextInt();
				}
			grades[i]=n;
			sum+=n;
			}
		System.out.println("Average: "+ sum/numberOfStudents);
		s.close();

	}

}
