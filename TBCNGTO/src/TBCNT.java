import java.util.Scanner;
public class TBCNT {
    int N,S,d;
    void input()
    {
        System.out.println("LE MINH TUAN");
        System.out.println("NHAP N : ");
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
    }
    boolean KtNto(int n)
    { 
        if(n<1) return false;
        for(int i=2; i<Math.Math.Math.sqrt(n); i++)
        {
            if(n % i == 0) return false;
        }
        return true;
    }
    void Output()
    { 
        for(int i=0; i<N; i++ ) 
         {
            if(KtNto(i)) 
                {
                    d++;
                    S=S+i;
                } 
         }
         S=S/d;
         System.out.println("KQ LA " + S);
    }
    public static void main(String[] args) {
        TBCNT in = new TBCNT();
        in.input();
        
        in.Output();
    }
}
