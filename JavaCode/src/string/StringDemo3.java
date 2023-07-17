package string;

public class StringDemo3 {

	public static void main(String[] args) {
		StringBuffer br=new StringBuffer("object oriented programming");
//		System.out.println(br);
		br.append("OOPS");
//		System.out.println(br);
		br.reverse();
		br.delete(4, 9);
		br.append(" mobile");
		System.out.println(br);
	}

}
