//2. Print Reverse number in java program
package Assignment4;

import java.util.Scanner;
public class Reverse2 {

	public static void main(String[] args) {
		int n, rev=0, rem;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Any Number: ");
		n= input.nextInt();
		
		while(n!=0) {
			rem = n%10;
			rev = rev*10+rem;
			n = n/10;
		}
		System.out.println("Reverse Number is: " +rev);
	}
}
