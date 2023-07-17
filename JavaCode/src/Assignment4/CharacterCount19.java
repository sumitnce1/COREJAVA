//19.WAP to input a string from user and a character also & count the occurrence of that character in the given string.
package Assignment4;
import java.util.Scanner;
public class CharacterCount19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();

		System.out.print("Enter character which you find: ");
		char ch = sc.next().charAt(0);

		int c=0;
		for (int i=0; i<str.length(); i++) {
			if (str.charAt(i)==ch) {
				c++;
			}
		}
		System.out.println("Your character founded: "+c +" times");
	}
}