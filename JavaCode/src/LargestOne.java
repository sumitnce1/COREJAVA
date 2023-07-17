//10.WAP to input 3 number and Find Largest one.
import java.util.Scanner;
public class LargestOne {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st no.: ");
        int n1 = input.nextInt();

        System.out.print("Enter 2nd no: ");
        int n2 = input.nextInt();

        System.out.print("Enter 3rd no: ");
        int n3 = input.nextInt();

        int l= n1;
        if (n2>l) {
        	l=n2;
        }
        if (n3>l) {
            l=n3;
        }
        System.out.println("The largest number is: " + l);

	}

}
