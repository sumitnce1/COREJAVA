package IO;

interface AnonymousInner {
    public void m1();
}
public class Demo3 {
    public static void main(String[] args) {
        AnonymousInner obj = new AnonymousInner() {
            public void m1() {
                System.out.println("m1 method");
            }
        };
        obj.m1();
    }
}


