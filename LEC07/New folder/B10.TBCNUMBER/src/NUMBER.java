import java.util.Scanner;

public class NUMBER {
    long a, S = 0, N, S1 = 0;

    void Input() {
        System.out.println("TÊN: ");
        System.out.println("Tinh tong cac chu so cua mot so nguyen duong");
        Scanner ip = new Scanner(System.in);

        do {
            System.out.print("Nhap so nguyen >0: ");
            N = ip.nextLong();
        } while (N <= 0);
    }
    void sht() {
        System.out.print("TONG = ");
        while (N != 0) {
            S = N % 10;
            N = N / 10;
            S1 += S;
            System.out.print(S + " + ");
        }
        System.out.print("\b\b= " + S1);
    }
    public static void main(String[] args) {
        NUMBER ip = new NUMBER();
        ip.Input();
        ip.sht();
    }
}
