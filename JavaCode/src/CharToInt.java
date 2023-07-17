import java.util.Scanner;

//4. How to convert character to integer in java program
public class CharToInt {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
	    char ch = input.next().charAt(0);
	      
	    int num = (int)ch;
	    
	    System.out.println(num);

	}

}
