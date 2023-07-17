//2.WAP to input 10 data in an 1D array and print sum of the all elements. 
package Assign3;
import java.util.Scanner;
public class SumOf1DArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n =scan.nextInt();
		
		int[] arr = new int[n];
		int sum=0;
		for(int a=0; a<10; a++) {
			System.out.println("Enter 10 Elements: ");
			arr[a]=scan.nextInt();
			sum=sum+arr[a];
		}
		
	}

}
