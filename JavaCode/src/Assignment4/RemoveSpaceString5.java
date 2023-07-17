//5. How to remove space in string both end in java Program
package Assignment4;
import java.util.Scanner;
public class RemoveSpaceString5 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Please The String with Space: ");
		String str=input.nextLine();
		
		String removeSpace= str.trim();
		System.out.println("Here is your String with remove space: "+"\n" +removeSpace);
	}
}
