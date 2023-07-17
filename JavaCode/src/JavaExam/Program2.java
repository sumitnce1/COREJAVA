package JavaExam;
import java.util.Scanner;

class CalPower{
    protected int denoPow(int a,int b) {
        return (int)Math.pow(a, b);
    }
}
class CalPower1 extends CalPower {
    protected int denoPow(int a,int b){
        int c=1;
        for (int i=0;i<b;i++){
            c=c*a;
        }
        return c;
    }
}
public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);        
//      taking ipnut through user
        System.out.print("Enter base: ");
        int a = sc.nextInt();
        System.out.print("Enter exponent: ");
        int b = sc.nextInt();
        
//      Creating an object CalPower1 class
        CalPower1 pow = new CalPower1();        
        int res= pow.denoPow(a,b);
        System.out.println("Result: "+res);	
	}
}