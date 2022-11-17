package ptb2;

import java.util.Scanner;

public class PTB2 {
    double a, b, c;

    void Input() {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap a<>0: ");
        a = in.nextDouble();
        System.out.println("Nhap b: ");
        b = in.nextDouble();
        System.out.println("Nhap c: ");
        c = in.nextDouble();
    }

    void PTB2(double a, double b, double c) {
        System.out.println(a + "x^2" + ((b >= 0) ? "+" : "") + b + "x" + ((c >= 0) ? "+" : "")+c+"=0");
        if (a == 0) {
            if (b == 0) {
                System.out.println("vo no");
            } else {
                System.out.println("x1=x2= " + (-c / b));
            }
            return;
        }
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double x1, x2;
            x1 = (-b + Math.Math.Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.Math.Math.sqrt(delta)) / (2 * a);
            System.out.println("x1= " + x1 + " , x2= " + x2);
        }
        else 
        { 
            if(delta == 0) System.out.println("x1=x2= " + (-b / 2*a));
        
                 else if(delta < 0) System.out.println("vo no");
        }
    }

    void Output() {
        PTB2(a, b, c);
    }

    public static void main(String[] args) {
        PTB2 a = new PTB2();
        a.Input();
        a.Output();
    }
}
