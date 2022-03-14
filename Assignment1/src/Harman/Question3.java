package Harman;

class ArrayOp {
	public static int[] copyOf(int[] array){
		return Array.copyOf(array, array.length());
        }
}

public class Question3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={4,5,6,7,8};
		int copyOfArr[] = ArrayOp.copyOf(arr);
		}
}

	