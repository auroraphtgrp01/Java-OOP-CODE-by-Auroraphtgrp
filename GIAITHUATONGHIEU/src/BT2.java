public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
import java.util.Scanner;

public class BT2 {
    long N;
    Float S;

    void Input() {
        Scanner ip = new Scanner(System.in);
        // System.out.println("Tinh S(N) = 1 - 1/2 + 1/3 - 1/4 +...- 1/n");
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
            S=S+(i*((i%2==1)?1.0:-1.0))/GIAITHUA(i+1);
           
        }
        return S;
    }
   
    
    void Output() {
       
    for(int i =1 ; i<= N ; i ++ ) 
 { 
    System.out.print(i+"/"+(i+1)+"!"+((i%2==1)?"-":"+"));
    
 }
 System.out.println("\b = "+SUM(N));
}
    public static void main(String[] args) {
        BT2 ip = new BT2();
        ip.Input();
        ip.Output();
    }
}
