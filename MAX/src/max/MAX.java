package max;
import java.util.Scanner;

public class MAX {
    long a,b,c,d,Max;
    void Input(){ 
           System.out.println("LE MINH TUAN ");
           System.out.println("CHUONG TRINH TIM MAX 4 SO ");
           Scanner in=new Scanner(System.in);
           System.out.println("NHAP A: ");a=in.nextLong();
           System.out.println("NHAP B: ");b=in.nextLong();
           System.out.println("NHAP C: ");c=in.nextLong();
           System.out.println("NHAP D: ");d=in.nextLong();
           
    }
    long MAX(long a, long b)
    { 
       long max=a;
        if(a < b) {
            max=b;
        } 
       return max;
    }
    void Output()
    { 
        Max=MAX(MAX(a,b),(MAX(c,d)));
        System.out.println("SO LON NHAT LA: "+Max);
    }

  
    public static void main(String[] args) {
     MAX in=new MAX();
     in.Input();
     in.Output();
    }
    
}
