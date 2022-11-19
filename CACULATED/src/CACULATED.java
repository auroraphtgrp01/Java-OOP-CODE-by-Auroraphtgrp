import java.util.Scanner;

public class CACULATED {
    long a, b, s;
    String x;

    void Input() {
        Scanner ip = new Scanner(System.in);
        System.out.println("LE MINH TUAN ");
        System.out.println("Nhap so nguyen 1 : ");
        a = ip.nextLong();
        System.out.println("Nhap so nguyen 2: ");
        b = ip.nextLong();
        System.out.println("Nhap phep toan ( + , - , * , / ): ");
        x = ip.next();
    }

    void Output() {

        switch (x) {
            case "+": {
                s = a + b;
                System.out.println(a + " " + x + " " + b + " = " + s);
                break;
            }
            case "-": {
                s = a - b;
                System.out.println(a + " " + x + " " + b + " = " + s);
                break;
            }
            case "*": {
                s = a * b;
                System.out.println(a + " " + x + " " + b + " = " + s);
                break;
            }
            case "/": {
                if (b == 0) {
                    System.out.println("Ko chia 0");
                    break;
                } else {
                    s = a / b;
                    System.out.println(a + " " + x + " " + b + " = " + s);
                }
                break;
            }

        }
    }

    public static void main(String[] args) {
        CACULATED x = new CACULATED();
        x.Input();
        x.Output();
    }
}
