import java.util.*;

public class LEC10 {
    ArrayList<Integer> a = new ArrayList<Integer>();

    void input() {
        Scanner s = new Scanner(System.in);
        System.out.println("LE MINH TUAN :");
        int n;
        do {
            System.out.print("Nhap so phan tu mang > 0 :");
            n = s.nextInt();
        } while (n <= 0);
        for (int i = 0; i <= n; i++) {
            int x = (int) (Math.random() * 100);
            a.add(x);
        }
    }

    void xuat(String nd) {
        System.out.print(nd);
        for (int i = 0; i < a.size(); i++)
            System.out.print(a.get(i) + " ");
        System.out.println(" ");
    }

    void cau2() {
        int max = a.get(0);
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > max) {
                max = a.get(i);
            }
        }
        System.out.println("2.Max = " + max);
    }

    void cau3() {
        int max = a.get(0);
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > max) {
                max = a.get(i);
            }
        }
        int min = a.get(0);
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) < min) {
                min = a.get(i);
            }
        }
        int s = max - min;
        System.out.println("3.Max - Min = " + max + " - " + min + " = " + s);
    }

    void cau4() {
        int s = a.get(0) + a.get(1);
        for (int i = 1; i < a.size() - 1; i++) {
            if (s < a.get(i) + a.get(i + 1)) {
                s = a.get(i) + a.get(i + 1);
            }
        }
        System.out.println("4.Tong 2 so lien tiep =" + s);
    }

    void cau5() {
        int s = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) % 2 == 0) {
                s = s + a.get(i);
            }
        }
        System.out.print("5.Tong cac so chan =");
        for (int i = 0; i < a.size(); i++)
            if (a.get(i) % 2 == 0)
                System.out.print(a.get(i) + "+");
        System.out.println("\b=" + s);
    }

    boolean snt(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    void cau6() {
        int s = 0, j = 0;
        for (int i = 0; i < a.size(); i++) {
            if (snt(a.get(i)) == true) {
                s = s + a.get(i);
                j++;
            }
        }
        System.out.print("6.TB cac so nguyen to =");
        for (int i = 0; i < a.size(); i++)
            if (snt(a.get(i)) == true)
                System.out.print(a.get(i) + " + ");
        System.out.println("\b=" + s / j);
    }

    int SDNguoc(int x) {
        int s = 0;
        while (x > 0) {
            int sd = x % 10;
            s = s * 10 + sd;
            x = x / 10;
        }
        return s;
    }

    boolean SDX(int x) {
        if (x > 9 && SDNguoc(x) == x)
            return true;
        return false;
    }

    void cau7() {
        int s = 0;
        for (int i = 0; i < a.size(); i++)
            if (SDX(a.get(i)) == true)
                s = s + a.get(i);
        System.out.print("7.Tong cac so doi xung = ");
        for (int i = 0; i < a.size(); i++)
            if (SDX(a.get(i)) == true)
                System.out.print(a.get(i) + " + ");
        System.out.println("\b=" + s);
    }

    boolean TCS(int x) {
        int s = 0;
        while (x != 0) {
            int sodu = x % 10;
            s = s * 10 + sodu;
            x = x / 10;
        }
        if (s > 10)
            return true;
        return false;
    }

    void cau8() {
        System.out.print("8.Cac chu so > 10 : ");
        for (int i = 0; i < a.size(); i++)
            if (TCS(a.get(i)) == true)
                System.out.print(a.get(i) + " ");
        System.out.println();
    }

    void cau9() {
        int x, k;
        System.out.print("9.");
        Scanner ip = new Scanner(System.in);
        System.out.print("Nhap gia tri va chi so can chen : ");
        k = ip.nextInt();
        x = ip.nextInt();
        a.add(k, x);
        xuat("");
        System.out.println();
    }

    void cau10() {
        int x1;
        System.out.print("10.");
        Scanner ip = new Scanner(System.in);
        System.out.print("Nhap chi so can xoa : ");
        x1 = ip.nextInt();
        a.remove(x1);
        xuat("Mang sau khi xoa: ");
        System.out.println();
    }

    void cau11() {
        System.out.print("11.");
        Collections.sort(a);
        System.out.println("Mang sau khi sap xep");
        xuat("");
    }

    void output() {
        xuat("1.Mang vua nhap ngau nhien :");
        int i=0;
        cau2();
        cau3();
        cau4();
        cau5();
        cau6();
        cau7();
        cau8();
        cau9();
        cau10();
        cau11();
    
    }

    public static void main(String[] args) {
        LEC10 a = new LEC10();
        a.input();
        a.output();
    }
}