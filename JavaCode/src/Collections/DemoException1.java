package Collections;
public class DemoException1 {
	public static void main(String[] args) {
		doF1();

	}
	public static void doF1() {
		System.out.println("Do f1 method");;
		doShow();
		System.out.println(64/0);
//		System.out.println("Do f1 method after");
	}
	public static void doShow() {
		System.out.println("do show method ");
		
	}
}
