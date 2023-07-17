package IO;

public class MethoLocalDemo {
	int a=10;
	static int b=89;
	
	void outer_method() {
		System.out.println("Method inside outer class ");
		
		class InnClass{
			void m1() {
				System.out.println(x);
				System.out.println(y);
			}
			void sum(int a, int y) {
				System.out.println(a+y);
			}
		}
		InnClass i = new InnClass();
//        i.sum(3, 5);
//        i.sum(4, 8);
//		i.m1();
	}
	public static void main(String[] args) {
		MethoLocalDemo obj = new MethoLocalDemo();
        obj.outer_method(); 

	}

}

