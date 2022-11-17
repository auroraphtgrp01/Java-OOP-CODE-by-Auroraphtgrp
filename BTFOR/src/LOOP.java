import java.util.Scanner;

public class LOOP {
    long N;
    Float S;

    void Input() {
        Scanner ip = new Scanner(System.in);
        System.out.println("PHAN TRAN THIEN AN");
        System.out.println("Tinh S(N) = 1 - 1/2 + 1/3 - 1/4 +...- 1/n");
        do {
            System.out.println("Nhap N>0: ");
            N = ip.nextLong();
        } while (N <= 0);
    }
    double GIAITHUA(double N)
    { 
        double S = 1;
        for(int i=1; i<=N; i++ ) 
         { 
            S*=i;
         }
         return S;
    }
    double SUM(long N) {
        double S = 0;
        for (int i = 1; i <= N; i++) {
            S*=-1;
            S += i / GIAITHUA(i+1);
           
        }
        return S;
    }
   
    
    void Output() {
        System.out.print("S(" + N + ") = 1 - ");
        for (int i = 2; i <= N - 1; i+=2) {
            System.out.print("1 / " + i + " + ");
            {
                for(int j = 3; i<=N-1; i+=2)
                {
                    System.out.print("1 / " + j + " - ");
                }
            }
        }
        System.out.print("1 / " + N + " = ");
        System.out.printf("%.4f", SUM(N));

    }

    public static void main(String[] args) {
        LOOP ip = new LOOP();
        ip.Input();
        ip.Output();
    }
}
