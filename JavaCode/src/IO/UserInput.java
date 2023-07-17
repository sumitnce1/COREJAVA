package IO;
import java.io.*;
public class UserInput {

	public static void main(String[] args) throws IOException {
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name: ");
        String name = obj.readLine();
        
        System.out.println("Enter Age: ");
        int age= Integer.parseInt(obj.readLine());
        
        System.out.println("Enter salary: ");
        float sal= Float.parseFloat(obj.readLine());
        
        System.out.println("Enter any charcter: ");
//        char ch= (char)obj.read();
        int a=obj.read();
        char ch=(char)a;
        System.out.println(ch);
        
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Salary: " +sal);
	}

}
