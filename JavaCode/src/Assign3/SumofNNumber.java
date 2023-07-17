//1.WAP to calculate sum of first N number  (N-take input from user)
package Assign3;
import java.util.Scanner;
public class SumofNNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = scan.nextInt();
		
		int Result = 0;
		for(int i=1; i<=num; i++) {
			Result=Result+i;
		}
		System.out.println(Result);
	}
}
