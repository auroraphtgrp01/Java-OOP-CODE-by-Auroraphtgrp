import java.util.Scanner;
public class HCN {
    double a,b;
     
        void Input(){ 
        System.out.println("CHUONG TRINH TINH DIEN TICH VA CHU VI HCN :");
        System.out.print("Nhap Canh A: ");
        Scanner kb=new Scanner(System.in);
        a = kb.nextDouble();
        System.out.print("Nhap Canh B: ");   
        b = kb.nextDouble();
     
    }
        void Output(){ 
                System.out.println("DIEN TICH LA : "+a*b);
                System.out.println("CHU VI LA :"+a+b);
        }
    public static void main(String[] args) {
        HCN t = new HCN();
        t.Input();
        t.Output();
    }
    
}

