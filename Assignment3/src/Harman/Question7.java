package Harman;
import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("N1: ");
		int n1 = s.nextInt();
		System.out.print("N2: ");
		int n2 = s.nextInt();
		try {
			int n3=n1/n2;
			System.out.println(n3);
		}catch(Exception ex) {
			System.out.println("DivideByZeroException caught"); 
		}
		finally {
			System.out.println("Inside finally block");
		}
		s.close();
	}

}
