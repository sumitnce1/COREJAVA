// 10. WAP to input ‘N’ no. of data in an array from the user and find the second 
//biggest data without perform sorting on that array 
package Assignment4;
import java.util.Scanner;
public class FindSecondBiggestDataInArray10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the size of the array: ");
	    int n = sc.nextInt();

	    int[] arr = new int[n];
	    System.out.println("Enter " + n + " elements in the array:");

	    for (int i = 0; i < n; i++) {
	       arr[i] = sc.nextInt();
	    }

	    int largest = Integer.MIN_VALUE;
	    int secondLargest = Integer.MIN_VALUE;

	    for (int i = 0; i < n; i++) {
	         if (arr[i] > largest) {
	            secondLargest = largest;
	            largest = arr[i];
	         } 
	         else if (arr[i] > secondLargest && arr[i] != largest) {
	            secondLargest = arr[i];
	         }
	      }

	      if (secondLargest == Integer.MIN_VALUE) {
	         System.out.println("There is no second largest element in the array.");
	      } else {
	         System.out.println("The second largest element in the array is " + secondLargest);
	      }
	}
}
