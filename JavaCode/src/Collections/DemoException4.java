package Collections;

public class DemoException4 {

	public static void main(String[] args) {
		try {
//			System.out.println(4/0);
			String str = null;
			System.out.println(str.length());
			} 
		catch (ArithmeticException | NullPointerException e) 
		{
			System.out.println(e);
		}
	}
}
