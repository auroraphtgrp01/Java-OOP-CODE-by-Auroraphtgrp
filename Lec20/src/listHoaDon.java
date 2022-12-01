import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import javax.swing.plaf.ListUI;

public class listHoaDon {
    ArrayList<HoaDon> a = new ArrayList<>();

    public void readFile(String nameFile) {
        try {
            File f = new File(nameFile);
            if (f.exists()) {
                System.out.println("File Availble!");
                Scanner read = new Scanner(f);
                while (read.hasNext()) {
                    Scanner line = new Scanner(read.nextLine());
                    String ma, ngaythang = "", hoten = "";
                    double x1, x2;
                    ma = line.next();
                    // System.out.println(ma);
                    ngaythang = line.next();
                    // System.out.println(ngaythang);
                    while (!line.hasNextDouble()) {
                        hoten += line.next() + " ";
                    }
                    // System.out.println(hoten);
                    x1 = line.nextDouble();
                    x2 = line.nextDouble();

                    String ma1 = ma.substring(0, 1);

                    if (ma1.trim().equalsIgnoreCase("G")) {
                        a.add(new HoaDonTheoGio(ma, hoten, new Date(ngaythang), x1, x2));
                        // System.out.println("true");
                    }
                    if (ma1.trim().equalsIgnoreCase("N")) {
                        a.add(new HoaDonTheoNgay(ma, hoten, new Date(ngaythang), x1, x2));
                    }

                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void printArr(ArrayList a, String Title) {
        System.out.println(Title);
        for (Object x : a) {
            System.out.println(x);
        }
    }

    public void printListDay() {
        System.out.println("HOA DON THEO NGAY ");
        for (HoaDon x : a) {
            if (x instanceof HoaDonTheoNgay) {
                System.out.println(x);
            }
        }
    }

    public void printListHours() {
        System.out.println("HOA DON THEO GIO ");
        for (HoaDon x : a) {
            if (x instanceof HoaDonTheoGio) {
                System.out.println(x);
            }
        }
    }

    public void output() {
        readFile("E:\\FileReader\\DonGia.txt");
        printArr(a, "1. ");
        System.out.println("2. ");
        printListDay();
        System.out.println("");
        printListHours();
        System.out.println("");
        sumHoaDonTheoNgayGio();
        hoaDonTheoMotNgay();
        hoaDonTheoGioCuaMotNgay();
        deleteCode();
        findMax();
        sort();
    }

    /*public void hoaDonTheoGio() {
        ArrayList<HoaDon> b = new ArrayList<>();
        double s = 0;
        for (HoaDon x : a) {
            b.add(x);
        }
        HoaDon z = a.get(0);
        s = a.get(0).tinhThanhTien();
        System.out.println(z);
        for (int j = 0; j < b.size(); j++) {
            if (b.get(j).getNgayHD().getNgay() != z.getNgayHD().getNgay()) {
                z = b.get(j);
                s = b.get(j).tinhThanhTien();
                System.out.println(z);
            }
            for (int i = j + 1; i < b.size(); i++) {
                if (z.getNgayHD().getNgay() == b.get(i).getNgayHD().getNgay()
                        && z.getNgayHD().getThang() == b.get(i).getNgayHD().getThang()
                        && z.getNgayHD().getNam() == b.get(i).getNgayHD().getNam()) {
                    s += b.get(i).tinhThanhTien();
                    System.out.println(b.get(i));
                    b.remove(i);
                    i--;
                }
            }
            System.out.println("Tong tien : " + s);
            System.out.println("");
            s = 0;
        }
    }*/

    public void sumHoaDonTheoNgayGio() {
        double s = 0;
        for (HoaDon x : a) {
            if (x instanceof HoaDonTheoGio) {
                s += x.tinhThanhTien();
            }
        }
        System.out.println("3. Hoa Don Theo Gio La : " + s);
        System.out.println("");
        s = 0;
        for (HoaDon x : a) {
            if (x instanceof HoaDonTheoNgay) {
                s += x.tinhThanhTien();
            }
        }
        System.out.println("Hoa Don Theo Ngay La : " + s);
        System.out.println("");
    }

    public void hoaDonTheoMotNgay() {
        Scanner ip = new Scanner(System.in);
        System.out.print("4. Nhap ngay can tim: ");
        String day = ip.nextLine();
        int ngay, thang, nam;
        double s1 = 0;
        String s[] = day.split("/");
        ngay = Integer.parseInt(s[0]);
        thang = Integer.parseInt(s[1]);
        nam = Integer.parseInt(s[2]);
        for (HoaDon x : a) {
            if (x.getNgayHD().getNgay() == ngay && x.getNgayHD().getThang() == thang && x.getNgayHD().getNam() == nam) {
                s1 += x.tinhThanhTien();
            }
        }
        System.out.println("Tong Tien Hoa Don Cua Ngay " + day + " la : " + s1);
        System.out.println("");
    }

    public void hoaDonTheoGioCuaMotNgay() {
        Scanner ip = new Scanner(System.in);
        System.out.print("5. Nhap ngay can tinh tien: ");
        String day = ip.nextLine();
        int ngay, thang, nam;
        double s1 = 0;
        String s[] = day.split("/");
        ngay = Integer.parseInt(s[0]);
        thang = Integer.parseInt(s[1]);
        nam = Integer.parseInt(s[2]);
        for (HoaDon x : a) {
            if (x instanceof HoaDonTheoGio) {
                if (x.getNgayHD().getNgay() == ngay && x.getNgayHD().getThang() == thang
                        && x.getNgayHD().getNam() == nam) {
                    s1 += x.tinhThanhTien();
                }
            }

        }
        System.out.println("Tong Tien Hoa Don Theo Gio Cua Ngay " + day + " la : " + s1);
        System.out.println("");
    }

    public void deleteCode() {
        Scanner ip = new Scanner(System.in);
        System.out.print("6. Nhap ma can xoa: ");
        String ma = ip.nextLine();
        boolean kt = false;
        int i = 0;
        while (i < a.size()) {
            if (a.get(i).getMaHD().trim().equalsIgnoreCase(ma)) {
                a.remove(i);
                kt = true;
            } else
                i++;
        }

        if (kt == false) {
            System.out.println("Khong ton tai ma nay!");
        } else
            printArr(a, "Mang sau khi xoa: ");

        System.out.println("");
    }

    class sort implements Comparator<HoaDon> {
        @Override
        public int compare(HoaDon o1, HoaDon o2) {
            if (o1.tinhThanhTien() < o2.tinhThanhTien())
                return 1;
            if (o1.tinhThanhTien() == o2.tinhThanhTien())
                return 0;
            return -1;
        }
    }

    public void sort() {
        Collections.sort(a, new sort());
        printArr(a, "8. Sau khi sap xep");
    }

    public void findMax() {
        System.out.println("7. Hoa Don Co Thanh Tien Cao Nhat La : ");
        HoaDon x = a.get(0);
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).tinhThanhTien() > x.tinhThanhTien()) {
                x = a.get(i);
            }
        }
        for (HoaDon y : a) {
            if (y.tinhThanhTien() == x.tinhThanhTien()) {
                System.out.println(y);
            }
        }
    }

    public static void main(String[] args) {
        listHoaDon x = new listHoaDon();
        x.output();
    }
}
