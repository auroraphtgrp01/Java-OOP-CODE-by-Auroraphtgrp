import java.util.Scanner;

public class NTOARRAY {
    int N, S, d;
    int[] A;

      void Input() {
        System.out.println("LE MINH TUAN ");
        System.out.println("Nhap N: ");
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("NHAP A[" + i + "] : ");
            A[i] = in.nextInt();

        }
        S=0;
        for(int i=0; i<N; i++)
        {
            if(KTNTO(A[i])) 
            {
                S=S+A[i];
            }
        }
        
    System.out.println("KQ LA : "+S);
    }
    boolean KTNTO(int N)
    { 
        if(N<1) return false;
        else 
        { 
                for(int i=2; i<Math.Math.Math.sqrt(N); i++)
                 {  
                    if(N % i == 0) return false;
                 }
        }
        return true;
    }
    void Output()
    { 
            S=0;
            for(int i=0; i<N; i++)
            {
                if(KTNTO(A[i])) 
                {
                    S=S+A[i];
                }
            }
            
        System.out.println("KQ LA : "+S);
    }
    public static void main(String[] args) {
       NTOARRAY in = new NTOARRAY();
       in.Input();
       in.Output();
        
    }
}
