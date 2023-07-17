package string;
import java.io.*;
public class ReadFile {

	public static void main(String[] args) throws Exception {
		File f= new File("abc.txt");
//		System.out.println(f.length());
		char [] ch= new char [(int)(f.length())];
		
		FileReader fr= new FileReader("abc.txt");
		
		fr.read(ch);
		for(char c:ch) {
			System.out.print(c);
		}
		
//		System.out.println((char)fr.read());
//		System.out.println((char)fr.read());
		fr.close();

	}

}
