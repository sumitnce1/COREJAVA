package Collections;
import java.util.*;
public class GarbageColle1 {

	public static void main(String[] args) {
		Runtime obj = Runtime.getRuntime();
		System.out.println(obj.totalMemory()); // heap size
		System.out.println(obj.freeMemory());
		
		for(int a=0; a<100;a++) {
		Date d = new Date();
		d=null;
//		System.out.println(d);
		}
		System.out.println(obj.freeMemory());
		obj.gc();
		System.out.println(obj.freeMemory());
		
	}
}
