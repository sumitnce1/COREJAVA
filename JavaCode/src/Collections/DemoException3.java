package Collections;

public class DemoException3 {

	public static void main(String[] args) {
		try {
			System.out.println("try block");
				try {
					System.out.println(123/0);
				} 
				catch (NullPointerException e) {
					System.out.println("Inner Catch block");
				}
			System.out.println("try block end");
		} 
		catch (Exception e) {
			System.out.println("outer catch block");
		}
		finally {
			System.out.println("Finally block");
		}
	}
}
