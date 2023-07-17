//13.Check whether the given integer is multiple of both 5and7
import java.util.Scanner;
public class MultipleOf57 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();

        if (n%5==0 && n%7==0) {
            System.out.println(n+ " is a multiple of both 5 and 7");
        } else {
            System.out.println(n+ " not a multiple of 5 and 7");
        }
	}
}
