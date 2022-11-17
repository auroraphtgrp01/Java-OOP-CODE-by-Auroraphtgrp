import java.util.Scanner;

public class NUMBERMAX {
    long a, S = 0, N, S1 = 0;

    void Input() {
        System.out.println("LE MINH TUAN");
        System.out.println("Tim so lon nhat cua mot so nguyen duong");
        Scanner ip = new Scanner(System.in);
        do {
            System.out.print("Nhap so nguyen >0: ");
            N = ip.nextLong();
        } while (N <= 0);
    }
    void sht() {
        long MAX = 0;
        System.out.print("MAX = ");
        while (N != 0) {
            S = N % 10;
            N = N / 10;
            if (S > MAX)
                MAX = S;
        }
        System.out.print("\b\b= " + MAX);
    }
    public static void main(String[] args) {
        NUMBERMAX ip = new NUMBERMAX();
        ip.Input();
        ip.sht();
    }
}
