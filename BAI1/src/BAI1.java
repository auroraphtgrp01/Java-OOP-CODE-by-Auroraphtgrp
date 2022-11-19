import java.util.Scanner;

public class BAI1 {
    double n;
    /**
     * 
     */
    void input(){
     System.out.println("LE MINH TUAN ");
     System.out.println("Tinh n!");
     Scanner in = new Scanner(System.in);
     do {
        System.out.println("Nhap n > 0: ");
        n = in.nextLong();

     } while(n < 0);

    }
    void output(){
        // System.out.print(n +"! = ");
            System.out.println( "\b=" + SUM1(n));

    }
    double SUM1( double n){
        double S=0;
        for (int i = 1; i <=n ; i++) {
            S=S+1/i;
        
        }
        return S;
    }

    public static void main(String[] agrs){
        BAI1 in = new BAI1();
        in.input();
        in.output();
    }
}