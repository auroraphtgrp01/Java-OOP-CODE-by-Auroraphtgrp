import java.util.Scanner;

public class NTTBC1 {
    long N, X, S = 0;
    int d = 0, d1 = 0;
    double S1 = 0;

    // input
    void Input() {
        Scanner ip = new Scanner(System.in);
        System.out.println("LE MINH TUAN");
        System.out.println("TRUNG BINH CONG SO NGUYEN TO TRONG N SO NHAP TU BAN PHIM <= N ");
        System.out.print("NHAP SO NGUYEN N > 0:  ");
        do {
            N = ip.nextLong();
        } while (N <= 0);
        System.out.print("Nhap " + N + " so nguyen: ");
        do {
            X = ip.nextLong();
            d++;
            if (KT(X)) {
                S += X;
                d1++;
            }
        } while (d < N);
        S1 += S * 1.0 / d1;
        System.out.printf("%.2f", S1);
    }

    // check ngto
    boolean KT(long n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        NTTBC1 in = new NTTBC1();
        in.Input();
    }
}
