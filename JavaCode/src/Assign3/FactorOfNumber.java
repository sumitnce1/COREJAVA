//4.WAP to input a number and print all the factor of that number.
package Assign3;
import java.util.Scanner;
public class FactorOfNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n= scan.nextInt();
		
		for (int i=1; i<=n; i++) {
            if (n%i==0){
            	
                System.out.println(i + " ");
            }
        }
	}

}
