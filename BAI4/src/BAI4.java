import java.util.Scanner;

public class BAI4 {
    long x, y ;
    void input(){
        System.out.println("LE MINH TUAN");
        System.out.println("Tinh luy thua");
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap co so:");
        x = in.nextLong();
        System.out.println("Nhap so mu : ");
        y = in.nextLong();


    }
    void output(){
        System.out.print(x+"^"+y +"=");
        for(int i = 1; i <= y;i++){
            System.out.print(x+"*");
        }
        System.out.print( "\b =" +  luythuaxy(x, y));
        
        
    }
    double luythuaxy(long x, long y){
        long kq = 1;
        for(int i = 0; i < y; i++){
            kq = kq * x;
        }
        return kq;
    }


    public static void main (String[] agrs){
        BAI4 in = new BAI4();
        in.input();
        in.output();
    }
}