package string;

public class Std {
    String name;

    public Std() {
        this.name = "Unknown";
    }
    public Std(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Std s1 = new Std();
        System.out.println("Student1: " + s1.getName());

        Std s2 = new Std("Sumit");
        System.out.println("Student2: " + s2.getName());
    }
}