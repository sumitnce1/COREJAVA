package string;
import java.io.*;
public class WriteFile {

	public static void main(String[] args) throws IOException {
//		FileWriter fw =new FileWriter("abc.txt");
//		fw.write("Software application");
//		fw.write("\n");
//		fw.write("JAva programmming");
//		fw.write("\n");
//		fw.write("C++ programmming");
//		fw.flush();
//		fw.close();

		
//		-----------------------
		FileWriter fw =new FileWriter("abc.txt ", true);
		fw.write("a");
		fw.write(" Computer ");
		fw.write("Array input2");
		fw.write("\n");
		fw.write("Array input3");
		
		fw.flush();
		fw.close();
	}

}

