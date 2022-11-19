import java.util.Scanner;

public class App {
    long N;

    void Input() {
        Scanner ip = new Scanner(System.in);
        System.out.println("LE MINH TUAN");
        System.out.println("Liet ke so nguyen to >= N  ");
        do {
            System.out.println("Nhap N>0: ");
            N = ip.nextLong();
        } while (N <= 0);
    }

    boolean snt(long n) {
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
        for(int i =1; i<=N ; i++) 
         {  
            if(snt(i)) 
            System.out.print(i+" ");
         }

    }

    public static void main(String[] args) {
        App in = new App();
        in.Input();
        in.Output();
    }
}
