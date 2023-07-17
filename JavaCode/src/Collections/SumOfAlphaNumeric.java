//WAP to take input a  alpha numeric string from user  and print the 
//sum of digits that are available with in that entered string .
package Collections;
import java.util.*;
public class SumOfAlphaNumeric {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.print("enter alphanumric string: ");
        String str = sc.nextLine();
        
        int s=0;
        for(int a=0;a<str.length();a++) {
            char ch = str.charAt(a);
            
            if(Character.isDigit(ch)) {
                int digit = Character.getNumericValue(ch);
                s=s+digit;
            }
        }     
        System.out.println("sum of aplhanumeric: "+s);
    }
}
