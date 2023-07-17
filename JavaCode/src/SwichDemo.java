
public class SwichDemo {

	public static void main(String[] args) {
		int z=10;
		switch(z+5) {
			case 10:
				System.out.println("Value is 10;");
				break;
			case 11+5:
				System.out.println("Value is same;");
				break;
			default:
				System.out.println("Default part");
		}

	}

}
