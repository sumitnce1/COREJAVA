//3. WAP to create a class and define a constructor with in it and you have to initialize the object of that class.
package Assignment4;

public class InitializeObjectClass {
    int n;
    InitializeObjectClass(int n) {
        this.n = n;
    }
    int getData() {
        return n;
    }

    public static void main(String[] args) {
        InitializeObjectClass obj = new InitializeObjectClass(33);
        int value = obj.getData();

        System.out.println(value);
    }
}