package OOPsJavaExam;
	import java.util.Scanner;

		public class Student {
		    private String PRN;
		    private String name;
		    private String course;
		    private String phno;
		    private String email;
		    private String address;

		    public void setInput() {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter PRN: ");
		        this.PRN = sc.nextLine();
		        System.out.print("Enter name: ");
		        this.name = sc.nextLine();
		        System.out.print("Enter course: ");
		        this.course = sc.nextLine();
		        System.out.print("Enter phone number: ");
		        this.phno = sc.nextLine();
		        System.out.print("Enter email address: ");
		        this.email = sc.nextLine();
		        System.out.print("Enter address: ");
		        this.address = sc.nextLine();
		    }
		    public String getDetails() {
		        return "PRN: " + this.PRN + "\n" +
		               "Name: " + this.name + "\n" +
		               "Course: " + this.course + "\n" +
		               "Phone number: " + this.phno + "\n" +
		               "Email address: " + this.email + "\n" +
		               "Address: " + this.address;
		    }

		    public String replaceVowels() {
		        return this.name.replaceAll("[AEIOUaeiou]", "$");
		    }

		    public String replaceEmail() {
		        String prnSuffix = this.PRN.substring(this.PRN.length() - 5);
		        return this.email.replace("@", "@" + prnSuffix);
		    }
		
		public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
		    System.out.print("Enter the number of students: ");
		    int n = sc.nextInt();

		    Student[] students = new Student[n];
		    for (int i = 0; i < n; i++) {
		        students[i] = new Student();
		        students[i].setInput();
		    }
		    for (int i = 0; i < n; i++) {
		        System.out.println("Details of student " + (i+1) + ":");
		        System.out.println(students[i].getDetails());

		        System.out.println("Name with vowels replaced:");
		        System.out.println(students[i].replaceVowels());

		        System.out.println("Email address with using PRN:");
		    }   
		}
	}