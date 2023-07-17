//12.WAP to input any string and count total no. of vowel and consonant
package Assignment4;
import java.util.Scanner;
public class VowelConsonant12 {

	public static void main(String[] args) {
		int vowel=0, consonant=0;;
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toUpperCase();

        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if (ch>='A' && ch<='Z') {
                if (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                    vowel++;
                }
                else {
                    consonant++;
                }
            }
        }
        System.out.println("Number of vowels: " + vowel);
        System.out.println("Number of consonants: " + consonant);
	}
}
