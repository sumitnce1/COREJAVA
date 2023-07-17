//9. Write a method named isEven that accepts an integer number.  The method should return true if the given no. is even, or false otherwise
public class IsEven {

	public static void main(String[] args) {
		int n= 10;
		boolean isNoEven = isNoEven(n);
		System.out.println(isNoEven);
	}
	public static boolean isNoEven(int n) {
		if(n%2==0) {
			return true;
		}
		else {
			return false;
		}
	}

}
