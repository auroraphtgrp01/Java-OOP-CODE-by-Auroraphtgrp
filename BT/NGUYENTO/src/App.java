import java.util.Scanner;

public class App {
    int N;

    void Input() {
        Scanner ip = new Scanner(System.in);
        System.out.println("LE MINH TUAN");
        System.out.println("Kiem tra so nguyen to");

        System.out.println("Nhap 1 so nguyen to ");
        N = ip.nextInt();
    }

    boolean snt(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)

            {
                return false;
            }

        }
        return true;
    }

    void Output() {
        if (snt(N))
            System.out.println("Yes");
        else
            System.out.println("No");

    }

    public static void main(String[] args) {
        App in = new App();
        in.Input();
        in.Output();
    }
}
