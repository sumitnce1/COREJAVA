
public class BreakOne {

	public static void main(String[] args) {
		for(int a=0; a<3; a++) {
			for(int j=0; j<3; j++) {
				if(a==j)
					break;
				System.out.println(a+" "+j);
			}
//			System.out.println();
		}

	}

}
