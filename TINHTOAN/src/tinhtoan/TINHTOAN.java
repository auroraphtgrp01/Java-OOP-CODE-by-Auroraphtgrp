
package tinhtoan;
import java.util.Scanner;
public class TINHTOAN {
    long a,b,d;
    double c;
    void input() {
        System.out.println("LE MINH TUAN ");
        System.out.println("CHUONG TRINH TINH TOAN ");
        Scanner in= new Scanner(System.in);
        System.out.print("NHAP A: "); a=in.nextLong();
        System.out.print("NHAP B: "); b=in.nextLong();
    }
    void output() {
        System.out.println("TONG LA: "+a+b);
        d=a-b;
        System.out.println("HIEU LA : "+d);
        System.out.println("TICH LA : "+a*b);
        System.out.println("THUONG LA : "+a/b);
        System.out.println("CHIA LAY DU : "+a % b);
        c=Math.pow(a,b);
        System.out.println("MU : "+c);    
    }
    public static void main(String[] args) {
        TINHTOAN in=new TINHTOAN();
        in.input();
        in.output();
    }
    
}
