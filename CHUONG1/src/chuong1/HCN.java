package CHUONG1;
import java.util.Scanner;
public class HCN {
    double a,b;
    void input(){
            System.out.println("Nhap A, B : ");
            Scanner kb=new Scanner(System.in);
            a=kb.nextDouble();
            b=kb.nextDouble();
        }
    void output(){
         System.out.println("HELLO");
    }

     public static void main(String[] args) {
       HCN in = new HCN();
       in.input();
       in.output();
       
    }
}

    

