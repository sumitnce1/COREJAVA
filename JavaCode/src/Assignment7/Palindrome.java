//2. Write a program to check the given number is	PALINDROME or not?
package Assignment7;
import java.util.Scanner;
public class Palindrome{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");  
	    int n=sc.nextInt();
	    int s=0;
	    int rev=n;    
	    
	    while(n>0)
	    {
	    	int r=n%10;
	    	s=(s*10)+r;
	    	n=n/10;    
	    }
	    if(rev==s)
	    	System.out.println(rev+" is palindrome");    
	    else
	        System.out.println(rev+" is not palindrome");
	}
}
