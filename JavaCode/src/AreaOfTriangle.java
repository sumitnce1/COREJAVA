//7. WAP to calculate area of triangle with Heron's formula
import java.util.Scanner;
public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	      
	    System.out.print("Enter length a: ");
	    double a = input.nextDouble();
	      
	    System.out.print("Enter length b: ");
	    double b = input.nextDouble();
	      
	    System.out.print("Enter length c: ");
	    double c = input.nextDouble();
	    
	    double s =(a+b+c)/2;
	    
	    double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
	    System.out.println("Area of Traingle: " +area);

	}

}
