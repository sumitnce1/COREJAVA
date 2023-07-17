package Assignment7;
import java.util.Scanner;

public class DispChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        int uc=0,lc=0,dc=0,spc=0,sym=0;
        
        for (int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            
            if (Character.isUpperCase(ch)) {
                uc++;
            }
            else if (Character.isLowerCase(ch)) {
                lc++;
            }
            else if (Character.isDigit(ch)) {
                dc++;
            }
            else if (Character.isSpaceChar(ch)) {
                spc++;
            }
            else {
                sym++;
            }
        }
        
        System.out.println("Lowercase: " +lc);
        System.out.println("Uppercase: " +uc);
        System.out.println("Special: "+sym);
        System.out.println("Spaces: "+spc);
        System.out.println("Digits: "+dc);       
	}

}
