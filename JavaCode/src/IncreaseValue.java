/* 15.WAP to input a number and increase the value of number according to the following condition- 
    n>=500--->+50
    n>=400--->+40
    n>=300--->+30
    n>=200--->+20
    n>=100--->+10
    */
import java.util.Scanner;
public class IncreaseValue {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();

        if(n>=500) {
            n+= 50;
        } else if(n>=400) {
            n+= 40;
        } else if(n>=300) {
            n+= 30;
        } else if(n>=200) {
            n+= 20;
        } else if(n>=100) {
            n+=10;
        }

        System.out.println("Increase value number: "+n);
    }
}
