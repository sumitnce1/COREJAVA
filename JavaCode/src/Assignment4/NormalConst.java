//2. WAP to create a class and define default constructor with in it and also define a normal method in 
//it and invoke both methods using their Instance
package Assignment4;

public class NormalConst {
	public NormalConst() {
		System.out.println("Default Constructor");
	}
	void Method() {
		System.out.println("Normal Method");
	}

	public static void main(String[] args) {
		NormalConst obj= new NormalConst();
		obj.Method();
	}
}
