import java.util.Scanner;
public class FIBONACCI {
    int n;
    void input()
    {
        System.out.println("LE MINH TUAN - CHUONG TRINH TIM FIBONACCI");
        Scanner in = new Scanner(System.in);
        System.out.println("NHAP N : ");
        n = in.nextInt();
    }
    int KTra(int n)
    { 
            if(n==0 || n==1) 
            {
                return 1;
            }
            else {
              return  KTra(n-1)+KTra(n-2);
            }
    }
    void Output()
    { 
            System.out.println("KQ LA");
            for(int i=0; i<n; i++)
            {
                    System.out.println(KTra(i));
            }
    }
    public static void main(String[] args) throws Exception {
        FIBONACCI a=new FIBONACCI();
        a.input();
        a.Output();

    }
}
