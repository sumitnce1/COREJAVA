//2. WAP to display all the multiple of 3 with in range 10 to 50
package Array;

public class MultipleOfThree {

	public static void main(String[] args) {
		int a= 10;
		int b= 50;
		for (int i=a; i<=b; i++) {
            if (i%3==0) {
                System.out.print(i+" ");
            }
	   }
	}
}
