//11.Check whether the given integer is multiple of 5

import java.util.Scanner;
public class MultipleOfFive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        if (num%5==0) {
            System.out.println("multiple of 5 is."+num );
        } 
        else {
            System.out.println("Multiple of 5 is not "+num);
	  }
	}

}
