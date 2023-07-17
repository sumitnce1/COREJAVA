package IO;

class Outer{
	class Inner{ 
		void m1() {
			System.out.println("inner class");
		}
	}
}

public class DemoInnerClass {
//	class Inner{ 
//		void m1() {
//			System.out.println("inner class");
//		}
//	}
	public static void main(String[] args) {
		// create object of outer class
//		DemoInnerClass obj = new DemoInnerClass();  
		// create object of inner
//		DemoInnerClass.Inner objinner = obj.new Inner();  
//		objinner.m1();
		
//		DemoInnerClass.Inner obj = new DemoInnerClass().new Inner();
//		obj.m1();
		
	}

}
