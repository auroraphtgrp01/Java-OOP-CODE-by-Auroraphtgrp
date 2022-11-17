import java.util.Scanner;

public class CACULATEDPS {
    long a1, a2, b1, b2, u1, u2, k, k1, k2, k3, d1, d2, a11, b11, a12, b12, z1, z2, j1, j2;
    String x;

    void Input() {
        System.out.println("LE MINH TUAN  ");
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap phan so 1 : ");
        System.out.println("Tu: ");
        a1 = in.nextLong();
        System.out.println("Mau<>0: ");
        a2 = in.nextLong();
        System.out.println("Nhap phan so 2 : ");
        System.out.println("Tu: ");
        b1 = in.nextLong();
        System.out.println("Mau<>0: ");
        b2 = in.nextLong();
        System.out.println("Nhap phep toan ( + , - , * , / ) : ");
        x = in.next();
        a11 = a1;
        a12 = a2;
        b11 = b1;
        b12 = b2;
        u1 = a2;
        u2 = b2;
    }

    long UCLN(long a, long b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    void Output() {
        // quydong
        a1 = a1 * u2;
        a2 = a2 * u2;
        b1 = b1 * u1;
        b2 = b2 * u1;

        switch (x) {
            case "+": {
                // cong
                u1 = a1 + b1;
                u2 = a2;
                k = UCLN(u1, u2);
                u1 = u1 / k;
                u2 = u2 / k;
                System.out.println(a11 + "/" + a12 + " " + " " + x + " " + b11 + "/" + b12 + " = " + u1 + "/" + u2);
                break;
            }
            case "-": {
                // tru
                d1 = a1 - b1;
                d2 = a2;
                if (d1 < 0) {
                    d1 = Math.abs(d1);
                    k1 = UCLN(d1, d2);
                    d1 = d1 / k1;
                    d2 = d2 / k1;
                    d1 = d1 * (-1);
                } else {
                    k1 = UCLN(d1, d2);
                    d1 = d1 / k1;
                    d2 = d2 / k1;
                }
                System.out.println(a11 + "/" + a12 + " " + " " + x + " " + b11 + "/" + b12 + " = " + d1 + "/" + d2);
                break;
            }
            case "*": {
                // nhan
                z1 = a11 * b11;
                z2 = a12 * b12;
                k2 = UCLN(z1, z2);
                z1 = z1 / k2;
                z2 = z2 / k2;
                System.out.println(a11 + "/" + a12 + " " + " " + x + " " + b11 + "/" + b12 + " = " + z1 + "/" + z2);
                break;
            }
            case "/": {
                if (a2 == 0 || b2 == 0 || a1 == 0 || b1 == 0) {
                    System.out.println("Ko chia 0");
                    break;
                } else {
                    // chia
                    j1 = a11 * b12;
                    j2 = a12 * b11;
                    k3 = UCLN(j1, j2);
                    j1 = j1 / k3;
                    j2 = j2 / k3;
                    System.out.println(a11 + "/" + a12 + " " + " " + x + " " + b11 + "/" + b12 + " = " + j1 + "/" + j2);

                }
                break;
            }
            
            }
        }
    

    public static void main(String[] args) {
        CACULATEDPS in = new CACULATEDPS();
        in.Input();
        in.Output();

    }

}
