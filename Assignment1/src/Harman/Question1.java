package Harman;


public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20, firstNumber = 1, secondNumber = 1 ,sum=0;
		System.out.println("First 20 fibonacci numbers are: ");
		for (int i=1;  i <= n; i++) {
		      System.out.print(firstNumber + ", ");

		      int nextNumber = firstNumber + secondNumber;
		      firstNumber = secondNumber;
		      secondNumber = nextNumber;
		}
	
		System.out.println(" ");
		System.out.println("Average: "+(sum/20));
	}

}
