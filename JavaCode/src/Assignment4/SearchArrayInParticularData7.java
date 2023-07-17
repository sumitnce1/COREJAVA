//7. WAP to input ‘N’ no. of data in an array and search a given particular  data from this array
package Assignment4;
import java.util.Scanner;
public class SearchArrayInParticularData7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " array element: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        
        System.out.print("Which element you find in this above array: ");
        int search = input.nextInt();
        
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == search) {
                System.out.println("Element found array in index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found in array");
        }
    }
}