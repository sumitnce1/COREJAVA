//WAP to input ‘N’ no. of data in an array from the user and 
//print positions of all those element which is less than 50
package Assignment4;
import java.util.Scanner;

public class PrintLessThanFifty8 {
	
	static void lessThan50(int[] array) {
		for(int i=0; i<array.length; i++) {
			if(array[i]<50) {
				System.out.println("50 less than found postion in array index: " + i+" ");
			}
	}
}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt(); // take input 5 element
		
		int[] array =new int[n];
		System.out.println("Enter array value: ");
		for(int i=0; i<n; i++) {
			
			array[i]=sc.nextInt();
		}
		lessThan50(array);
	}
}

