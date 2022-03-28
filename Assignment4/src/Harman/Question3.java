package Harman;
import java.util.Scanner;
import java.io.File;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File myFile = new File("data");
        try {
            Scanner s = new Scanner(myFile);
            double bigDouble = Double.MIN_VALUE; 
            double smallDouble = Double.MAX_VALUE; 
            double currentDouble;
            while (s.hasNextDouble()) {
                currentDouble = s.nextDouble();
                if (currentDouble > bigDouble) {
                    bigDouble = currentDouble; 
                }
                if (currentDouble < smallDouble) {
                    smallDouble = currentDouble; 
                }
            }
            System.out.println("Largest number: " + bigDouble); 
            System.out.println("Smallest number: " + smallDouble);
        } catch (Exception l) {
            System.err.println(l.getMessage());
        }
	}

}
