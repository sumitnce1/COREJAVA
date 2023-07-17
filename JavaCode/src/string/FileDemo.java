package string;
import java.io.*;

public class FileDemo {

	public static void main(String[] args)throws Exception {
		File f = new File("String");
//		System.out.println(f.exists());
		f.mkdir();
//		System.out.println(f.exists());
		File f2= new File(f,"demo.txt");
		f2.createNewFile();
		System.out.println(f2.exists());
	}

}
