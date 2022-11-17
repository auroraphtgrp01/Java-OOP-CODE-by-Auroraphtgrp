import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class MangHinh {
    public ArrayList<HinhVuong> a = new ArrayList<HinhVuong>();

    public void readFile(String fileName) {
        try {
            File f = new File(fileName);
            if (f.exists()) {
                Scanner read = new Scanner(f);
                System.out.println("File Availble ! ");
                while (read.hasNext()) {
                    Scanner line = new Scanner(read.nextLine());
                    double a1 = 0;
                    a1 = line.nextDouble();
                    if (line.hasNext()) {
                        double b = 0;
                        b = line.nextDouble();
                        a.add(new HinhChuNhat(a1, b));
                    } else
                        a.add(new HinhVuong(a1));
                }

            } else
                System.out.println("File not found !");
        } catch (Exception e) {
        }
    }

    public void printArr() {
        for (HinhVuong x : a) {
            System.out.println(x);
        }
    }

    public int countHCN() {
        int d = 0;
        for (HinhVuong x : a) {
            if (x instanceof HinhChuNhat) {
                d++;
            }
        }
        return d;
    }

    public int countHV() {
        int d = 0;
        d = a.size() - countHCN();
        return d;
    }

  
    public HinhVuong maxS(){
        HinhVuong x =  a.get(0);
        for(int i = 0; i < a.size(); i++){
            if(a.get(i).dienTich() > x.dienTich()){
                x = a.get(i);
            }
        }
        return x;
    }

    public HinhVuong maxSHCN(){
        HinhVuong x =  a.get(0);
        for(int i = 0; i < a.size(); i++){
            if (a.get(i) instanceof HinhChuNhat) 
                if(a.get(i).dienTich() > x.dienTich()){
                    x = a.get(i);
            }
        }
        return x;
    }
     
    public void sortS(){
        for(int i=0; i<a.size(); i++ ) { 
              for(int j=i+1; j<a.size(); j++ ){ 
                if (a.get(i).dienTich() < a.get(j).dienTich()) {
                    HinhVuong x = a.get(j);
                    a.set(j, a.get(i));
                    a.set(i, x);
                }
            }
        }
        printArr();
    }



    public void Output() {
        
        System.out.println("Cau 1: ");
        printArr();
        System.out.println("");
        System.out.println("Cau 2: "+maxS());
        System.out.println("");
        System.out.println("Cau 3: "+countHV()+" hinh vuong ");
        System.out.println("");
        System.out.println("Cau 4: "+countHCN()+" hinh chu nhat ");
        System.out.println("");
        System.out.println("Cau 5: ");
        System.out.println("");
        System.out.println(maxSHCN());
        System.out.println("");
        System.out.println("Cau 6: ");
        sortS();
       
        
        
    }

    public static void main(String[] args) {
        MangHinh x = new MangHinh();
        x.readFile("E:\\HinhHoc.txt");
        x.Output();
     
    }
}
