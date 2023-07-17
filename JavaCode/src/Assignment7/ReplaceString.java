//3 .Replace string with another string in java Program
package Assignment7;
import java.util.Scanner;
public class ReplaceString {

	public static void main(String[] args) {		
		 Scanner sc=new Scanner(System.in);
	     System.out.print("Enter a string: ");
	     String str=sc.nextLine();
	     
	     System.out.print("Enter string replace: ");
	     String b=sc.nextLine();
	     
	     System.out.print("Enter replacement string: ");
	     String c=sc.nextLine();

	     String d=str.replace(b,c);
	     
	     System.out.println("final string: "+d);
	}

}
