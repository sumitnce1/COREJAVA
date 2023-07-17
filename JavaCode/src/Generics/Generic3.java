package Generics;

class Hospital {
    String[] doctorsName;
    String[] doctorsSpecification;
    Double[] salary;
    
    Hospital(String[] doctorsName, String[] doctorsSpecification, Double[] salary) {
        this.doctorsName = doctorsName;
        this.doctorsSpecification = doctorsSpecification;
        this.salary = salary;
    }
    
    public <E> void displayInfo(E[] arr) {
        System.out.println("Information about the hospital is as follows:");
        for (E element : arr) {
            System.out.println(element);
        }
    }
}

public class Generic3 {
    public static void main(String[] args) { 
        String[] doctorsName = {"nchal", "vaibhav", "khushi", "vishal", "sumit"};
        String[] doctorsSpecification = {"BBS", "ABBS-MD", "BHS", "BOS", "BHMS"};
        Double[] salary = {200009.5, 4343443.3, 31234.435, 2456534.3453};
        
        Hospital h = new Hospital(doctorsName, doctorsSpecification, salary);
        
        h.displayInfo(doctorsName);
        h.displayInfo(doctorsSpecification);
        h.displayInfo(salary);
    }
}
