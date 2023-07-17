package IO;

public class OuterDemo {
	
	static class Nested{
		void show() {
			System.out.println("meethod");
		}
	}

	public static void main(String[] args) {
		Nested obj = new Nested();
		obj.show();

	}
}
