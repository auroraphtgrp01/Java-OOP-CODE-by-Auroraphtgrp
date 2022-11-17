import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class MangSinhVien {
    ArrayList<SinhVien> a = new ArrayList<SinhVien>();
    public void readFile(String nameFile) {
        try {
            File f = new File(nameFile);
            if (f.exists()) {
                System.out.println("Opened File !");
                Scanner read = new Scanner(f);
                while (read.hasNext()) {
                    Scanner line = new Scanner(read.nextLine());
                    String maSV, hoTen;
                    boolean gioiTinh;
                    double Toan, Ly, Hoa;
                    maSV = line.next();
                    hoTen = "";
                    while (!line.hasNextBoolean())
                        hoTen += line.next() + " ";
                    gioiTinh = line.nextBoolean();
                    Toan = line.nextDouble();
                    Ly = line.nextDouble();
                    Hoa = line.nextDouble();
                    SinhVien x = new SinhVien(maSV, hoTen, gioiTinh, Toan, Ly, Hoa);
                    a.add(x);
                }
            } else
                System.out.println("Not Available");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void printArray(String Title) {
        System.out.println(Title);
        for (SinhVien x : a) {
            System.out.println(x);
        }
    }

    public double diemTBGT(boolean gt) {
        double s = 0;
        int d = 0;
        for (SinhVien x : a) {
            if (x.isGioiTinh(gt) == gt) {
                s += x.tinhDTB();
                d++;
            }
        }
        return s / d;
    }

    public int countSV() {
        int d = 0;
        for (SinhVien x : a) {
            if (x.xepLoai() == "Kha") {
                d++;
            }
        }
        return d;
    }

    public double TBchung() {
        int d = 0;
        double s = 0;
        for (SinhVien x : a) {
            if (x.xepLoai() == "Gioi") {
                s += x.tinhDTB();
                d++;
            }
        }
        return s / d;
    }

    public void removeStudents() {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).tinhDTB() < 3.5) {
                a.remove(i);
            }
        }
        printArray("DS sau khi loai bo: ");
    }

    public void sortStudents() {
        for (int i = 0; i < a.size() - 1; i++) {
            for (int j = i + 1; j < a.size(); j++) {
                if (a.get(i).tinhDTB() < a.get(j).tinhDTB()) {
                    SinhVien x = a.get(j);
                    a.set(j, a.get(i));
                    a.set(i, x);
                }
            }
        }
        printArray("DS sau khi sap xep");
    }

    public void Output() {
        System.out.println("LE MINH TUAN");
        System.out.println("2a. Liet ke cac sinh vien : ");
        printArray("");
        System.out.println("");
        System.out.println("2b. Diem trung binh chung theo gioi tinh : ");
        System.out.println("TBC Nam = "+diemTBGT(true));
        System.out.println("TBC Nu = "+diemTBGT(false));
        System.out.println("");
        System.out.println("2c. Co "+countSV()+" loai kha ");
        System.out.println("");
        System.out.println("2d. TBC cua hs gioi: "+TBchung());
        System.out.println("");
        System.out.print("2e. Loai nhung sinh vien co hoc luc kem: ");
        removeStudents();
        System.out.println("");
        System.out.println("2f. Sap xep giam dan theo diem: ");
        sortStudents();
    }

    public static void main(String[] args) {
        MangSinhVien x = new MangSinhVien();
        x.readFile("E:\\SINHVIEN.txt");
        x.Output();
    }
}
