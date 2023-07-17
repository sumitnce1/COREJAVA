//5. How to swap 2 number in java

import java.util.Scanner;
public class SwapTwoNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 1st Number: ");
		int n1 = input.nextInt();
		System.out.print("Enter 2nd Number: ");
		int n2 = input.nextInt();
		
		int n3= n1;
		n1=n2;
		n2=n3;
		
		System.out.println("After Swap 1st No is: " +n1);
		System.out.println("and After Swap 2nd No. is: "+n2);

	}

}