//6. Write a program to Print REVERSE of N to 1 number (N-take input from  user)
package Assignment4;
import java.util.Scanner;
public class ReverseNNumber6 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter Any Number: ");
		int n=input.nextInt();
		
		for(int i=n; i>=1; i--) {
			System.out.print(i +" ");
		}
	}
}
