//13.WAP to input 10 string from user and print only those string which first  character is ”A” and last character is ‘R’
package Assignment4;
import java.util.Scanner;
public class PrintStringAR13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
        String s = sc.nextLine().toLowerCase();
        
		int n=s.length();
		
		if(s.charAt(0)=='a' && s.charAt(n-1)=='r')
			System.out.println("Yes! Found in this string {" +s + "} First character is A and last character is R :)");
		else
			 System.out.println("Not! found in this string " +s + "First character is A and last character is R :(");
	}
}
