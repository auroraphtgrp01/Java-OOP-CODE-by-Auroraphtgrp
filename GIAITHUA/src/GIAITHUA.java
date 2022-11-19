import java.util.Scanner;

public class GIAITHUA {
    int n;

    void Input()
    { 
            System.out.println("LE MINH TUAN - CHUONG TRINH TINH N! ");
            Scanner in=new Scanner(System.in);
            System.out.println("Nhap N : ");
            n=in.nextInt();
   }
   int GIAITHUA1(int N)
   { 
    if(N==1) return 1;
    else return GIAITHUA1(N-1)*N;
   }
   void Output()
   {
        System.out.println("KQ la : "+GIAITHUA1(n));
   }
    public static void main(String[] args) throws Exception {
        GIAITHUA in = new GIAITHUA();
        in.Input();
        in.Output();
    }
}
