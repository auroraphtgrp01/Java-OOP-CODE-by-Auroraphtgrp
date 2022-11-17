import java.util.Scanner;

public class PTB1 {
    double x, a, b;

    void Input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Giai ax+b=0");
        System.out.println("Nhap a: ");
        a = in.nextDouble();
        System.out.println("nhap b: ");
        b = in.nextDouble();

    }

    void Output() {
        if (a == 0) {
            if (b == 0) {
                System.out.println(a + "x" +((b>=0)?"+":"") + "=0");
                System.out.print("vo so no");
            } else
            System.out.println(a + "x" +((b>=0)?"+":"") + "=0");

            System.out.print("vo no");

        } else {
            x = -b / a;
            System.out.println(a + "x" +((b>=0)?"+":"") + "=0");

            System.out.print("X = " + x);
        }
    }

    public static void main(String[] args) {
        PTB1 in = new PTB1();
        in.Input();
        in.Output();
    }
}
