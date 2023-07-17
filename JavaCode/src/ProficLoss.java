//6. WAP to input C.P and S.P and determine whether the seller get profit or loss.
import java.util.Scanner;
public class ProficLoss {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	     System.out.print("Enter the C.P: ");
	     double cp = input.nextDouble();
	     System.out.print("Enter the S.P: ");
	     double sp = input.nextDouble();
	      
	     if (sp > cp) {
	        double profit = sp - cp;
	        System.out.println("seller get profit of:" + profit);
	      } 
	     else if (cp > sp) {
	        double loss = cp - sp;
	        System.out.println("seller is loss of:" + loss);
	      }
	     else {
	    	 System.out.println("No Profit No Loss");
	     }

	}
}
