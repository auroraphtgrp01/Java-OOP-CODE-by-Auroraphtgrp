import java.io.WriteAbortedException;
import java.util.Scanner;

import javax.sound.midi.MidiChannel;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class NUMBERMAXMIN {
    long a, S = 0, N, S1 = 0;

    void Input() {
        System.out.println("TÊN: ");
        System.out.println("Tim hieu cua chu so Max - chu so Min");
        Scanner ip = new Scanner(System.in);
        do {
            System.out.print("Nhap so nguyen >0: ");
            N = ip.nextLong();
        } while (N <= 0);
    }
    long MAX(long N)
    {
        long MAX1 = 0;
        while (N != 0) {
            S = N % 10;
            N = N / 10;
            if(S==9) return 9;
            else {
            if (S > MAX1)
                MAX1 = S;
            }
       }
       return MAX1;
    }
    long MIN(long N)
    {
        long MIN1 = 9;
        while (N != 0) {
            S = N % 10;
            N = N / 10;
            if(S==0) return 0;
            else {
            if (S < MIN1)
                MIN1 = S;
            }
       }
       return MIN1;
    }
    void Output()
    { 
        System.out.print("Max - Min = "+MAX(N)+" - "+MIN(N)+" = "+(MAX(N)-MIN(N)));
    }
    public static void main(String[] args) {
        NUMBERMAXMIN ip = new NUMBERMAXMIN();
        ip.Input();
        ip.Output();
    }
}
