package string;

public class PrintAnInteger {
	public void print1(int n, char c) {
		System.out.println(n+ "and" +c);
	}
	public void print2(char c, int n) {
		System.out.println(c+ "and" +n);
	}

	public static void main(String[] args) {
		PrintAnInteger obj=new PrintAnInteger();
		
		obj.print1(11, 'S');
		obj.print2('S', 11);
	}

}
