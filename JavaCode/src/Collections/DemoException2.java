package Collections;
import java.io.FileNotFoundException;
public class DemoException2 {

	public static void main(String[] args) {
		
		try {
//			System.out.println("hello");
			System.out.println(123/8);
//			System.out.println("hii");
		} 
		catch (NullPointerException e) {
				System.out.println("Null");
		}
		finally {
			System.out.println(123/0);
		}
		System.out.println("outside try catch");
	}
}
