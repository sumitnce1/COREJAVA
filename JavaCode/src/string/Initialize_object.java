package string;

public class Initialize_object {

    String name;
    int sr_no;

    Initialize_object(String n, int a) {
        this.name = n;
        this.sr_no = a;
    }

    public String toString() {
        return "Name: " + this.name + ", Serial No.: " + this.sr_no;
    }

    public static void main(String[] args) {
        Initialize_object n = new Initialize_object("Khushee", 41);
        System.out.println(n);
    }
}
