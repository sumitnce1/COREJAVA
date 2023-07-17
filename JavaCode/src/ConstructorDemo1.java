class ThisDemo{
	int a;
	int b;
	void input(int a, int b) {
		this.a=a;
		this.b=b;
	}
	void show() {
		System.out.println(a+ " "+b);
	}
}
public class ConstructorDemo1 {

	public static void main(String[] args) {
		ThisDemo obj= new ThisDemo();
		obj.input(120,160);
		obj.show();
	}
}
