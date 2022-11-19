import java.util.Scanner;
public class AXB {
    int a,S;
    void input()
    {
            System.out.println("LE MINH TUAN - CHUONG TRINH TINH TOAN A X B");
            System.out.println("NHAP A,B :");
            Scanner in = new Scanner(System.in);
            a = in.nextInt();
            
    }
    void output()
    {   
        S=S+(a % 10);
        a=a/10;
        S=S+(a % 10);
        a=a/10;
        S=S+(a%10);
        a=a/10;
        S=S+(a%10);
        a=a/10;
        S=S+(a%10);

        System.out.println("KQ LA"+S);

    }

    public static void main(String[] args){
        AXB in = new AXB();
        in.input();
        in.output();
    }
}
