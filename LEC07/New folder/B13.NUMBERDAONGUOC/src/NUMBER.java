import java.util.Scanner;
public class NUMBER {
    long a, S = 0, N, S1 = 0;

    void Input() {
        System.out.println("TÊN:  ");
        System.out.println("Tim so dao nguoc cua mot so nguyen duong");
        Scanner ip = new Scanner(System.in);
        do {
            System.out.print("Nhap so nguyen >0: ");
            N = ip.nextLong();
        } while (N <= 0);
    }
    
    void Output()
    {   
        System.out.print("So dao: ");
        long S1=0;
        int fs=1;
        while (N != 0) {
            S = N % 10;
            N = N / 10;
            S1=S1*10+S;
       }
       System.out.print(S1);
       
    }
   
    public static void main(String[] args) {
        NUMBER ip = new NUMBER();
        ip.Input();
        ip.Output();
    }
}
