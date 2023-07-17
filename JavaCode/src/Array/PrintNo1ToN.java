//4. Write a program to Print 1 to N numbers using loop
package Array;
import java.util.Scanner;
public class PrintNo1ToN {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a number to print: ");
		int n=input.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println(i);
		}
	}
}
