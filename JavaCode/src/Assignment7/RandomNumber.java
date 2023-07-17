//4.  How to Generate random number in java Program
package Assignment7;
import java.util.*;
public class RandomNumber {

	public static void main(String[] args) {
		Random r= new Random();
		
		System.out.println("Random number: "+(r.nextInt(500)));	
	}

}
