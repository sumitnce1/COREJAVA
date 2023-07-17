/* Assign and print the roll number, phone number and address of two students having names "Sam" and "Ram" 
respectively by creating two objects of class 'Student'. */

package Assignment4;

public class Student1 {
	
	int Roll_No;
	String name, address;
	double Phone_No;
	
	void getStudentData(int r, String n, double p, String a) {
		Roll_No= r;
		name= n;
		Phone_No= p;
		address= a;
	}
	void display() {
		System.out.println("Roll Number: " +Roll_No);
		System.out.println("Roll Number: " +name);
		System.out.println("Roll Number: " +Phone_No);
		System.out.println("Roll Number: " +address +"\n");
	}
	
	public static void main(String[] args) {
		Student1 sam = new Student1();
        Student1 ram = new Student1();

        sam.getStudentData(1,"Sam",12367890,"CDAC Patna India");
        ram.getStudentData(2,"Ram",98703210,"CDAC Pune India");

        sam.display();
        ram.display();
	}
}