package PTB2;
import java.util.Scanner;
public class PTB2 { 
     double a,b,c;
     void nhap(){
         Scanner in=new Scanner(System.in);
         System.out.print("Nhap A,B,C:  ");
         a=in.nextDouble();
         b=in.nextDouble();
         c=in.nextDouble();
         in.close();                 }

     void xuat() { 
        double delta=b*b-4*a*c; 
        if(delta<0) System.out.println("PT VO NGHIEM ");
        if(delta==0) System.out.println("PT CO NGHIEM KEP " + -b/2*a);
        if(delta>0) 
{
    double x1,x2;
    x1=(-b+Math.Math.Math.sqrt(delta))/2*a;
    x2=(-b-Math.Math.Math.sqrt(delta))/2*a;
    System.out.println("PHUONG TRINH CO 2 NGHIEM PHAN BIET "+x1+" ; "+x2);
}
     }
     public static void main(String[] args) { 
         PTB2 a= new PTB2();
         a.nhap();
         a.xuat();
         
     }
}
