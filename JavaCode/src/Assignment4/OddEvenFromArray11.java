//11.Write a program to print even and odd number from the array.
package Assignment4;
import java.util.Scanner;
public class OddEvenFromArray11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
        int s = sc.nextInt();
        
        int[] numbers = new int[s];
        System.out.print("Enter array elements: ");
        for (int i=0; i<s; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.print("Even numbers: ");
        for (int n:numbers) {
            if (n%2== 0) {
                System.out.println(n);
            }
        }
        System.out.print("Odd numbers: ");
        for (int n:numbers) {
            if (n%2!= 0) {
                System.out.print(n);
            }
        }
	}
}
