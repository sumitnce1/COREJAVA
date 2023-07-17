//Create a class “Student” having four methods
//• First method named as “setInput” which take input from user[PRN,name,course,phno,email,address] Second method named as “getDetails” that returns all the above information of student(like- name,PRN,course,phno,email,address) • Using third method name of student should be changed like all vowels should be replace by ’$’ and return that updated name  In fourth method email-id of the students should be changed like ‘@’ symbol should be replaced by your PRN (last 5 digit of your PRN) and display it. And create N no. of objects of that class using Array of Object and invoke all the above methods */
package JavaExam;
import java.util.Scanner;
class Student{
	public long PRN,phno;
	String name,course,email,address;
	Scanner sc1 = new Scanner(System.in);
//	First method named as setInput and taking input with user	
	public void setInput(){
		System.out.print("Enter PRN: ");
        PRN = sc1.nextLong();
        sc1.nextLine();
        System.out.print("Enter Name: ");
        name=sc1.nextLine();
        System.out.print("Enter Course: ");
        course=sc1.nextLine();
        System.out.print("Enter Phone No: ");
        phno=sc1.nextLong();
        sc1.nextLine();
        System.out.print("Enter Email: ");
        email=sc1.nextLine();
        System.out.print("Enter Address: ");
        address=sc1.nextLine();
        System.out.println("-----------------------");
	}
//	Second method named as getDetails that returns all the above information of student
	public void getDetails() {
        System.out.println("PRN: "+PRN);
        System.out.println("Name: " +name);
        System.out.println("Course: " +course);
        System.out.println("Phone No: "+phno);
        System.out.println("Email: " +email);
        System.out.println("Address: "+address);
    }
//Third method name replceNameInVowel that returns all the above information of student
    public String replceNameInVowel() {
    	StringBuilder replce = new StringBuilder();
    	String vowels = "AEIOUaeiou";
    	for (int i = 0; i < name.length();i++) {
    	char c = name.charAt(i);
    		if (vowels.contains(String.valueOf(c))) {
    		replce.append("$");
    		} 
    		else
    		{
    		replce.append(c);
    		}
    	}
    	return replce.toString();
    }
// forth method name replceEmail email-id of the students should be changed like @ symbol should be replaced by your PRN
    public void replceEmail() {
        String eml = String.valueOf(PRN);
        email = email.replace("@", eml.substring(eml.length()-5));
        System.out.println("Student update email: " +email);
    }
}
public class Program1 {
	public static void main(String[] args) {
//		create Scanner object to read input
		Scanner sc=new Scanner(System.in);
//		taking input with user number of students
        System.out.print("Enter no. of students: ");
        int n=sc.nextInt();
//		Create array of Student objects with size n
        Student[] std = new Student[n];
//      loop through each student to input and disply        
        for (int i=0;i<n;i++){
            System.out.println("Enter details for Student" +(i+1)+" ");
            std[i]=new Student();
            std[i].setInput(); // call setInput method
            std[i].getDetails(); // call getDetails method
            System.out.println("Name updated with vowel: " + std[i].replceNameInVowel()); // print replceNameInVowel 
            std[i].replceEmail(); // call replceEmail method
        }
	}
}