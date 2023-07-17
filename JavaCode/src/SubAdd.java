//8. WAP to input two number and perform substraction when 1st number is greater than the second number otherwise perform addition .
import java.util.Scanner;
public class SubAdd {
	public static void main(String[] args) {
		int  n1, n2, result;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
	    n1 = input.nextInt();
	    System.out.print("Enter 2nd number: ");
	    n2 = input.nextInt();
	    if(n1>n2) {
	    	result=n1-n2;
	    	System.out.println("Subtraction is: " +result);
	    }
	    else {
	    	result=n1+n2;
	    	System.out.println("Addition is: " +result);
	    }
	}
}
