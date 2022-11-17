
import java.util.Scanner;
public class TINHTOANPS {
    long a1,a2,b1,b2,u1,u2,k,k1,k2,k3,c1,c2;
    void Input(){
        System.out.println("LE MINH TUAN ");
        System.out.println("CHUONG TRINH TINH TOAN 2 PHAN SO ");
        Scanner in=new Scanner(System.in);
        System.out.println("NHAP A1: ");a1=in.nextLong();
        System.out.println("NHAP A2: ");a2=in.nextLong();
        System.out.println("NHAP B1: ");b1=in.nextLong();
        System.out.println("NHAP B2: ");b2=in.nextLong();
//        a11=a1;
//        a12=a2;
//        b11=b1;
//        b12=b2;
    }
    long UCLN(long a, long b){
        while(a != b) 
        {
            if(a > b) {
                a=a-b; 
            }
            else {
               b=b-a;         
            }
     }
        return a;
    }
//     void Output(){
//         a1=a1*u2;
//         a2=a2*u2;
//         b1=b1*u1;
//         b2=b2*u1;
//         //cong
//         u1=a1+b1;
//         u2=a2;
//         //tru
//         d1=a1-b1;
//         d2=a2;
// //        //nhan
// //        z1=a11*b11;
// //        z2=a12*b12;
// //        //chia
// //        j1=a11/b11;
// //        j2=a12/b12;
// //        
//         k=UCLN(u1,u2);
//         k1=UCLN(d1,d2);
// //        k2=UCLN(z1,z2);
// //        k3=UCLN(j1,j2);
//         System.out.println("KET QUA CUA PHEP CONG LA: "+u1/k+"/"+u2/k);
//         System.out.println("KET QUA CUA PHEP TRU LA: "+d1/k1+"/"+d2/k1);
// //        System.out.println("KET QUA CUA PHEP NHAN LA: "+z1/k2+"/"+z2/k2);
// //        System.out.println("KET QUA CUA PHEP CHIA LA: "+j1/k3+"/"+j2/k3);
        
        
//     }
    public static void main(String[] args) {
        TINHTOANPS in=new TINHTOANPS();
        in.Input();
        in.Output();
    }
    
}
