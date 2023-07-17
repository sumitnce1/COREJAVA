package string;

import java.util.Scanner;

class Student {
    private long rollNo;
    private String name;
    private String course;
    private String phNo;
    private String email;
    private String address;

    // Method to set input from user
    public void setInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        rollNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Course: ");
        course = scanner.nextLine();
        System.out.print("Enter Phone No: ");
        phNo = scanner.nextLine();
        System.out.print("Enter Email: ");
        email = scanner.nextLine();
        System.out.print("Enter Address: ");
        address = scanner.nextLine();
    }

    // Method to get details of student
    public void getDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Phone No: " + phNo);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
    }

    // Method to replace vowels with '$' in name
    public String replaceVowels() {
        return name.replaceAll("[AEIOUaeiou]", "\\$");
    }

    // Method to replace '@' in email with roll no
    public void replaceEmail() {
        String rollNoStr = String.valueOf(rollNo);
        email = email.replace("@", rollNoStr.substring(rollNoStr.length() - 5));
        System.out.println("Updated Email: " + email);
    }
}

public class pro1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Student[] students = new Student[n];

        // Create objects of Student class and invoke methods
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            students[i] = new Student();
            students[i].setInput();
            students[i].getDetails();
            System.out.println("Updated Name with replaced vowels: " + students[i].replaceVowels());
            students[i].replaceEmail();
            System.out.println();
        }
    }
}

