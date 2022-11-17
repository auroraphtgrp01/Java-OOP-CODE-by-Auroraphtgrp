import java.util.Scanner;
public class TBCSDX {
    long n,x,k,j,S=0;
    void input() {
        System.out.println("LE MINH TUAN");
        System.out.println("TB cac so doi xung trong n so nhap tu ban phim");
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so nguyen >0 :");
        n = s.nextLong();
        System.out.print("nhap" + n + " so :");
        do {
            x=s.nextLong();
            if(x>9 && sodoixung(x)==true) {
                S=S+x;
                k++;
            }
            j++;
        } while(j<n);
    }
    void output(){
        System.out.println("TBC ="+S/k);
    }
    boolean sodoixung(long b){
        if(sodaonguoc(b)==b) return true;
        else return false;
    }
    long sodaonguoc(long b) {
        long s=0;
        while(b!=0) {
            long sodu = b%10;
            s = s*10+ sodu;
            b=b/10;
        }
        return s;
    }
    public static void main(String[] args) {
        TBCSDX a = new TBCSDX();
        a.input();
        a.output();
    }
}