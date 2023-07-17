import java.util.Scanner;

public class AverageOfNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 1st no.: ");
		float n1 = input.nextFloat();
		System.out.println("Enter 2nd no.: ");
		float n2 = input.nextFloat();
		System.out.println("Enter 3rd no.: ");
		float n3 = input.nextFloat();
		System.out.println("Enter 4th no.: ");
		float n4 = input.nextFloat();
		System.out.println("Enter 5th no.: ");
		float n5 = input.nextFloat();
		
		float sum = n1+n2+n3+n4+n5;
		float avg= sum/5;
		System.out.println(avg);

	}

}
