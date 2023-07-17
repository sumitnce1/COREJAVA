package Collections;
import java.util.*;
import java.util.Vector;

public class DemoColl3 {

	public static void main(String[] args) {
		Vector v=new Vector();
		System.out.println(v.capacity());
		for(int a=0; a<20;a++) {
			v.addElement(a);
		}
		System.out.println(v);
		System.out.println(v.capacity());
		v.addElement("win");
		System.out.println(v);
		System.out.println(v.capacity());
		
	}

}
