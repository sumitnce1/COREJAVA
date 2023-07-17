//4. WAP to input a number and print table of that number
package Assignment4;

import java.util.Scanner;

public class Table4 {
	public static void tablePrint(int n) {
		for(int i=1; i<=10; i++){
			int r=n*i;
			System.out.println(n +"x" +i +"= " +r);
		}
	}

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter Any Number: ");
		int n= input.nextInt();
		tablePrint(n);	
	}
}
