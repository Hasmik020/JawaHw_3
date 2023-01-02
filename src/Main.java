public class Main {
    public static void main(String[] args) {
        int c;
        int a = 22;
        int b = 11;
        c = a * a + b * b;
        System.out.println("Squares' sum = " + c);

//      The Surface of the Table
        a = 6;
        b = 9;
        c = 7;
        System.out.println("The Tables' Surface = " + c * (a + b) / 2);

//      Three Digits
        int digit = 249;
        int digit1 = digit / 100;
        int digit2 = (digit % 100) / 10;
        int digit3 = digit % 10;
        System.out.println("digit1 = " + digit1);
        System.out.println("digit2 = " + digit2);
        System.out.println("digit3 = " + digit3);
    }
}
