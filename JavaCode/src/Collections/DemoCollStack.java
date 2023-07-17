package Collections;
import java.util.*;
public class DemoCollStack {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(21);
		s.push(98);
		s.push("PC");
		s.push(124);
//		System.out.println(s.peek());
//		System.out.println(s.search(98));
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
	}

}
