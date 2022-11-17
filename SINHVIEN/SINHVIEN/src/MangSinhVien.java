import java.io.File;
import java.io.OutputStream;
import java.util.*;

public class MangSinhVien {
    private ArrayList<SinhVien> a = new ArrayList<SinhVien>();
    
    public SinhVien nhap1SinhVien(String cauDan) {
        System.out.println(cauDan);
        java.util.Scanner ip = new Scanner(System.in);
        String ma, ht, ns, qq;
        boolean gt;
        double diem;
        System.out.println("Nhap ma: ");
        ma = ip.nextLine();
        System.out.println("Nhap ho ten: ");
        ht = ip.nextLine();
        System.out.println("Nhap ngay sinh: ");
        ns = ip.nextLine();
        System.out.println("Nhap que quan: ");
        qq = ip.nextLine();
        System.out.println("Nhap gioi tinh ( Nam = true , Nu = false ) :");
        gt = ip.nextBoolean();
        System.out.println("Nhap diem: ");
        diem = ip.nextDouble();

        SinhVien x = new SinhVien(ma, ht, ns, qq, gt, diem);
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
                    String ma, ht, ns, qq;
                    boolean gt;
                    double diem;
                    ma = line.next();
                    ht = "";
                    while (!line.hasNextBoolean())
                        ht = ht + line.next() + " ";
                    gt = line.nextBoolean();
                    ns = line.next();
                    qq = "";
                    while (!line.hasNextDouble())
                        qq = qq + line.next() + " ";
                    diem = line.nextDouble();
                    SinhVien x = new SinhVien(ma, ht, ns, qq, gt, diem);
                    a.add(x);

                }
            } else
                System.out.println("Khong ton tai file");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public double tinhDTChung(boolean gt) {
        double s = 0;
        int d = 0;

        for (SinhVien x : a) {
            if (x.isGioiTinh(gt) == gt) {
                s = s + x.getDiemTB();
                d++;
            }
        }
        if (d == 0)
            return 0;
        return s;
    }

    public double tinhTBchung() {
        double s = 0;
        int d = 0;

        for (SinhVien x : a) {
            s += x.getDiemTB();
            d++;
        }
        if (d == 0)
            return 0;
        return s / d;
    }

    public void xuat(String noiDung) {
        System.out.println(noiDung);
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }

    }

    public void addNgheAn() {
        String s2 = "Nghe An";
        for (SinhVien x : a) {
            if (x.getQueQuan().trim().equalsIgnoreCase(s2.trim())) {
                x.setDiemTB(x.getDiemTB() + 0.5);
            }

        }

    }

    public void removeStudents() {
        int i=0; 
        while(i<a.size()){
            if(a.get(i).getDiemTB()<tinhTBchung()) a.remove(i);
            else i++;
        }
    }

    public void sortStudents() {
        for (int i = 0; i < a.size() - 1; i++) {
            for (int j = i + 1; j < a.size(); j++) {
                if (a.get(i).getDiemTB() < a.get(j).getDiemTB()) {
                    SinhVien x = a.get(j);
                    a.set(j, a.get(i));
                    a.set(i, x);
                }
            }
        }
    }
    public void viThuSinhVien(){
        System.out.println("Vi thu sinh vien: ");
        for(int i = 0; i <a.size(); i++){
            int dem = 0;
            for(int j = 1; j < a.size(); j++)
                if(i!=j)
                    if(a.get(j).getDiemTB() > a.get(i).getDiemTB()){
                        dem++;
                    }
            System.out.println(a.get(i) + " VT " + (dem+1));
            }
        }
    // public void findNgheAn() {
    //     addNgheAn();
    //     String s2 = "Nghe An";
    //     for (SinhVien x : a) {
    //         if (x.getQueQuan().trim().equalsIgnoreCase(s2.trim())) {
    //             System.out.print(x.getMaSV() + " sau khi cong la " + x.getDiemTB());
    //         }
    //     }
    //     System.out.println("");
    // }

    public void output() {
        System.out.println("LE MINH TUAN");
        xuat("Danh sac sinh vien vua nhap: ");
        System.out.println("2b. Diem trung binh chung la :" + tinhTBchung());
        System.out.println("2c. Diem trung binh chung theo gioi tinh : " + tinhDTChung(true));
        System.out.println("2d. Cong 0.5 cho cac sinh vien Nghe An: ");
        
        
        System.out.println("2e. DS sau khi loai cac sinh vien duoi diem tb chung:  ");
        removeStudents();
        xuat("");
        System.out.println("2f. Sap xep giam dan : ");
        sortStudents();
        xuat("");
        System.out.println("2g. ");
        viThuSinhVien();
    }

    public void input() {
        int n;
        Scanner ip = new Scanner(System.in);
        do {
            System.out.print("Nhap so sinh vien > 0: ");
            n = ip.nextInt();
        } while (n <= 0);
        for (int i = 1; i <= n; i++) {
            SinhVien x = nhap1SinhVien("Nhap Sinh Vien Thu " + i);
            a.add(x);
        }
    }

    public static void main(String[] args) {

        MangSinhVien a = new MangSinhVien();
        // a.input();
        a.docFile("E:\\SV1.txt");
        a.output();
    }

}