import java.io.File;
import java.util.*;

public class MangHinhHop {
    ArrayList<HCN> a = new ArrayList<HCN>();

    public HCN createHCN(String Title) {
        System.out.println(Title);
        Scanner ip = new Scanner(System.in);
        double dai, rong, cao;
        System.out.print("Nhap vao chieu dai: ");
        dai = ip.nextDouble();
        System.out.print("Nhap vao chieu rong: ");
        rong = ip.nextDouble();
        System.out.print("Nhap vao chieu cao: ");
        cao = ip.nextDouble();
        HCN x = new HCN(dai, rong, cao);
        return x;
    }

    public void docFile(String tenFile) {
        try {
            File f = new File(tenFile);
            if (f.exists()) {
                System.out.println("Da mo duoc file");
                Scanner read = new Scanner(f);
                while (read.hasNext()) {
                    Scanner line = new Scanner(read.nextLine());
                    double a1, b, c;
                    a1 = line.nextInt();
                    b = line.nextInt();
                    c = line.nextInt();
                    a.add(new HCN(a1, b, c));

                }
            } else
                System.out.println("Khong ton tai file");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void Input() {
        int n;
        Scanner ip = new Scanner(System.in);

        do {
            System.out.println("Nhap so hinh chu nhat > 0 : ");
            n = ip.nextInt();
        } while (n <= 0);
        for (int i = 1; i <= n; i++) {
            HCN x = createHCN("Nhap hcn thu " + i);
            a.add(x);
        }
    }

    public void printArray() {
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }

    public double maxVHCN() {
        double maxV = 0;
        for (HCN x : a) {
            if (x.thetichHCN() > maxV) {
                maxV = x.thetichHCN();
            }
        }

        return maxV;
    }

    public double minVHCN() {
        double minV = 1.79769313486231570e+308d;
        for (HCN x : a) {
            if (x.thetichHCN() < minV) {
                minV = x.thetichHCN();
            }
        }

        return minV;
    }

    public void findMaxV() {
        for (HCN x : a) {
            if (x.thetichHCN() == maxVHCN()) {
                System.out.print(x);
            }
        }
        System.out.println("");
    }

    public void findMinV() {
        for (HCN x : a) {
            if (x.thetichHCN() == minVHCN()) {
                System.out.print(x);
            }
        }
        System.out.println("");
    }

    public double maxSxq() {
        double maxSxq = 0;
        for (HCN x : a) {
            if (x.dientichXungQuanh() > maxSxq) {
                maxSxq = x.dientichXungQuanh();
            }
        }
        return maxSxq;
    }

    public void findMaxSxq() {
        for (HCN x : a) {
            if (x.dientichXungQuanh() == maxSxq()) {
                System.out.print(x);
            }
        }
        System.out.println("");
    }

    public double sxqTB(){
        double s=0;
        int d=0;
        for(HCN x:a){ 
            s+=x.dientichXungQuanh();
            d++;
        }
        if(d==0) return 0;
        return s/a.size();
    }

    public int findSxq_Sday() {
        int d=0;
        for (HCN x : a) {
            if (x.dientichDay() > sxqTB()) {
                d++;
            }
        }
        return d;
    }


    public void Output() {
        System.out.print("Cau 1.");
        printArray();
        System.out.print("Cau 2. ");
        findMaxV();
        System.out.print("Cau 3. ");
        findMinV();
        System.out.print("Cau 4. ");
        findMaxSxq();
        System.out.print("Cau 5. "+findSxq_Sday());
        
       
        
    }
    public static void main(String[] args) {
        MangHinhHop x = new MangHinhHop();
        // x.Input();
        x.docFile("E:\\HCN.txt");
        // x.printArray();
        x.Output();
    }
}