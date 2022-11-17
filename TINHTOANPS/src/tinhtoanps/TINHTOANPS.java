package tinhtoanps;

import java.util.Scanner;

import javax.sql.rowset.spi.SyncFactory;

public class TINHTOANPS {
    long a1, a2, b1, b2, u1, u2, k, k1, k2, k3, d1, d2, a11, b11, a12, b12, z1, z2, j1, j2;

    void Input() {
        System.out.println("LE MINH TUAN ");
        System.out.println("CHUONG TRINH TINH TOAN 2 PHAN SO ");
        Scanner in = new Scanner(System.in);
        System.out.println("NHAP A1: ");
        a1 = in.nextLong();
        System.out.println("NHAP A2: ");
        a2 = in.nextLong();
        System.out.println("NHAP B1: ");
        b1 = in.nextLong();
        System.out.println("NHAP B2: ");
        b2 = in.nextLong();
        a11 = a1;
        a12 = a2;
        b11 = b1;
        b12 = b2;
        u1 = a2;
        u2 = b2;
    }

    long UCLN(long a, long b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    void Output() {
        if(a2==0 || b2==0 )
        { 
            System.out.print("SAI ! ");
        }
        else
        {       // quydong
        a1 = a1 * u2;
        a2 = a2 * u2;
        b1 = b1 * u1;
        b2 = b2 * u1;
        // cong
        u1 = a1 + b1;
        u2 = a2;
        k = UCLN(u1, u2);
        u1 = u1 / k;
        u2 = u2 / k;
        // tru
        d1 = a1 - b1;
        d2 = a2;
        if (d1 < 0) {
            d1 = Math.abs(d1);
            k1 = UCLN(d1, d2);
            d1 = d1 / k1;
            d2 = d2 / k1;
            d1 = d1 * (-1);
        } else {
            k1 = UCLN(d1, d2);
            d1 = d1 / k1;
            d2 = d2 / k1;
        }
        // nhan
        z1 = a11 * b11;
        z2 = a12 * b12;
        k2 = UCLN(z1, z2);
        z1 = z1 / k2;
        z2 = z2 / k2;
        // chia
        j1 = a11 * b12;
        j2 = a12 * b11;
        k3 = UCLN(j1, j2);
        j1 = j1 / k3;
        j2 = j2 / k3;

        System.out.println("KET QUA CUA PHEP CONG LA: " + u1 + "/" + u2);
        System.out.println("KET QUA CUA PHEP TRU LA: " + d1 + "/" + d2);
        System.out.println("KET QUA CUA PHEP NHAN LA: " + z1 + "/" + z2);
        System.out.println("KET QUA CUA PHEP CHIA LA: " + j1 + "/" + j2);

    }
}
    public static void main(String[] args) {
        TINHTOANPS in = new TINHTOANPS();
        in.Input();
        in.Output();

    }
    

}
