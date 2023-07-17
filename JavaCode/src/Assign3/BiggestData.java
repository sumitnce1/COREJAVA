package Assign3;
import java.util.*;
public class BiggestData {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		double arr[]= new double[n];
		for(int i=0; i<n; i++) {
			System.out.println("Enter Element: ");
			arr[i] = sc.nextDouble();
			
		}
		double big=0;
		for(int i=0;i<n; i++) {
			if(big<arr[i]) {
				big=arr[i];
			}
		}
		System.out.println("Biggest Number: "+big);
	}

}
