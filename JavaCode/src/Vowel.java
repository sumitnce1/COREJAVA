//14.WAP to input a character and determine whether it is Vowel or not( using if/else or switch case  )
import java.util.Scanner;
public class Vowel {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                System.out.println(ch + " is not a vowel.");
                break;
        }

	}

}
