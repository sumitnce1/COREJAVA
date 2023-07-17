/* 9. Write a program to display sequence of numbers in TRIANGLE format
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15 */
package Assignment4;
import java.util.Scanner;
public class PatternTriangle9 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the any no. of triangle: ");
		int n=sc.nextInt();
		
		int r=1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(r+" ");
				r++;
			}
			System.out.println();
		}
	}
}
