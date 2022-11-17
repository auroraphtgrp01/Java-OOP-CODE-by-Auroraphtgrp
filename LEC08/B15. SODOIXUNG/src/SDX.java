import java.util.Scanner;
public class SDX {
    long a, S = 0, N, S1 = 0,s1=0;

    void Input() {
        System.out.println("LE MINH TUAN");
        System.out.println("Liet ke so doi xung <=N");
        Scanner ip = new Scanner(System.in);
        do {
            System.out.print("Nhap so nguyen >0: ");
            N = ip.nextLong();
        } while (N <= 0);
    }
    boolean SDX_check(int N)
    {   
        long S1=0;
        long N1=N;
        while (N != 0) {
            S = N % 10;
            N = N / 10;
            S1=S1*10+S;
       }
     if(S1==N1)
      { 
            return true;
      }
      else {
        return false;
      }
       
    }
    void Output()
    { 
        for(int i=10; i<=N; i++ ) 
        { 
            if(SDX_check(i)) 
            s1+=i;
        }
        System.out.print(s1+" ");

    }
    public static void main(String[] args) {
        SDX ip = new SDX()
;        ip.Input();
         ip.Output();
    }
}
