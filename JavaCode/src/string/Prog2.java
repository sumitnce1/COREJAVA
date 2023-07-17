package string;
class CalPower {
    int calculatePower(int base, int exponent) {
        return (int) Math.pow(base, exponent);
    }
}

class ChildCalPower extends CalPower {
    int calculatePower(int base, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}

public class Prog2 {
    public static void main(String[] args) {
        ChildCalPower childCalPower = new ChildCalPower();
        int base = 2;
        int exponent = 3;
        int result = childCalPower.calculatePower(base, exponent);
        System.out.println("The result: " + result);
    }
}