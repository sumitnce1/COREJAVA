package string;
import java.io.*;
public class FileFolder {

	public static void main(String[] args)throws Exception {
		 File f =new File("C:\\Users\\User\\Desktop\\Java\\JavaCode\\String", "java1.txt");
//		 f.mkdir();
		 f.createNewFile();
		 System.out.println(f.exists());

	}

}
