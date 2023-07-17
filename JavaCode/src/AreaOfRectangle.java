/* 1.Write a program to print the area of a rectangle by creating a class named 'Area' having 
 * two methods. First method named as 'setDimension' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle 
 * are entered by user with  in main method.
 *
 */
import java.util.Scanner;

class Area {
	
	int a;
	int b;
	void setDimension(int length, int breadth) {
		a= length;
		b= breadth;		
	}
	int getArea() {
		return a*b;
	}
	
}

public class AreaOfRectangle {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter length: ");
		int l=input.nextInt();
		
		System.out.println("Enter Breadth: ");
		int b= input.nextInt();
		
		Area obj = new Area();
		obj.setDimension(l, b);
		int result=obj.getArea();
		System.out.println("Area of Rectangle: "+result);
		
	}

}
