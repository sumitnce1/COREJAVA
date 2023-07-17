//3.WAP to input any string and print each character separately
package Assign3;
import java.util.Scanner;
public class StringToChar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
	    String sr = scan.nextLine();
	     
	    for (int i=0; i<sr.length(); i++) {
	    	char ch = sr.charAt(i);
	    	
	    	System.out.print(ch+ " ");
	    	}
	}
}
