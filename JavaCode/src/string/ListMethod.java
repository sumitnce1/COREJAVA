package string;
import java.io.*;
public class ListMethod {

	public static void main(String[] args) throws Exception {
		File f = new File ("C:\\Users\\User\\Desktop\\Java\\JavaCode\\String");
		String[] s = f.list();
		for(String a:s) {
			System.out.println(a);
		}

	}

}
