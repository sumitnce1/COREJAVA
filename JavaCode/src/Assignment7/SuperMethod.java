package Assignment7;

class Base{
Base() {
    System.out.println("Parent class.");
  }
}
class Derive extends Base{
	Derive(){
		System.out.println("Child class");
	}
}
public class SuperMethod {

	public static void main(String[] args) {
		Derive obj= new Derive();
		Derive obj1= new Derive();
	}

}
