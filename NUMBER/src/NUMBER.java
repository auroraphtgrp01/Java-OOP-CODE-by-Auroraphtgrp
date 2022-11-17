import java.util.Scanner;
public class NUMBER {
    long a,S;
    void Input()
    { 
        System.out.println("LE MINH TUAN");
        Scanner ip = new Scanner(System.in);
        System.out.println("Nhap So: ");
        a = ip.nextLong();
        
    }
  
    void Output()
    {   
        S=S+(a % 10);
        a=a/10;
        S=S+(a % 10);
        a=a/10;
        S=S+(a%10);

        System.out.println("KQ LA"+S);

    }
    public static void main(String[] args)  {
        NUMBER ip = new NUMBER();
        ip.Input();
        ip.Output();
    }
}
