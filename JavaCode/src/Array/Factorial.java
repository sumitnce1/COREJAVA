//3. Find factorial for given no Program in Java
package Array;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Number");
		int n= input.nextInt();
		
		int fact=1;
		for(int i=1; i<=n; i++) {
			fact= fact*i;
		}
		System.out.println("Facotial= "+fact);
	}
}
