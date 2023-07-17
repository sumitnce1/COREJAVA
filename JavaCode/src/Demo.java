class MainDemo{
	static int f1(int a, int b) { //non static method
		return a+b;
	}
}
public class Demo {
	public static void main(String[] args) { // static method
//		Demo obj = new Demo(); //create object
//		int r= obj.f1(0,0);
//		System.out.println(r);
		
//		MainDemo obj =new MainDemo();
//		int r =obj.f1(4, 80);
		
		int r= MainDemo.f1(10, 20); //class
		System.out.println(r);

	}

}
