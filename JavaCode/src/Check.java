import java.util.Scanner;
public class Check {

	public static void main(String[] args) {
		Scanner inputt = new Scanner(System.in);

        System.out.print("Enter the first float number: ");
        float n1 = inputt.nextFloat();

        System.out.print("Enter the second float number: ");
        float n2 = inputt.nextFloat();

        float sum = n1 + n2;
        int result = (int)sum;

        System.out.println("The sum of the integral parts is: " + result);
	}

}
