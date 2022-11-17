package btjava2;
import java.util.Scanner;

public class HTRON {
    double r;
    void input()
    {
        System.out.println("LE MINH TUAN ");
        System.out.println("CHUONG TRINH TINH S VA P HINH TRON ");
        Scanner in=new Scanner(System.in);
        System.out.print("NHAP BAN KINH: ");
        r=in.nextDouble();
    }
    void output(){
        System.out.println("CHU VI HTRON LA : "+2*3.14*r);
        System.out.println("DIEN TICH HTRON LA : "+3.14*r*r);
    }
    public static void main(String[] args) {
        HTRON in=new HTRON();
        in.input();
        in.output();    }
    
}
