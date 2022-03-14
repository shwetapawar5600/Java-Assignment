package Harman;
import java.util.Scanner; 

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int i,j,n,a[][];
        System.out.print("Enter the number of rows: ");
        n=s.nextInt(); 
        a=new int[n][n];
        
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++) {
                if(j==0 || j==i) {
                    a[i][j]=1;
                }
                else {
                    a[i][j]=a[i-1][j-1]+a[i-1][j];
                }
            }
        }
        
        System.out.println("\nOUTPUT:\n");
        for(i=0;i<n;i++){
            for(j=0;j<=i;j++) {
            	System.out.print(a[i][j]+"\t");
            }

            System.out.println();
        }
        
	}

}
