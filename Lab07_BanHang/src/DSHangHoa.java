import java.io.File;
import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;

public class DSHangHoa {
    ArrayList<HangHoa> a = new ArrayList<HangHoa>();

    public void readFile(String fileName) {
        try {
            File f = new File(fileName);
            if (f.exists()) {
                System.out.println("File Availble! ");
                Scanner read = new Scanner(f);
                while (read.hasNext()) {
                    Scanner line = new Scanner(read.nextLine());
                    String ma, ngaythang, nsx = "";
                    double dongia, soluong;
                    ma = line.next();
                    ngaythang = "";
                    while (!line.hasNextDouble()) {
                        ngaythang = line.next();
                    }
                    dongia = line.nextDouble();
                    soluong = line.nextDouble();
                    while (line.hasNext()) {
                        nsx = nsx + line.next() + " ";
                    }
                    if (nsx.trim().equalsIgnoreCase("nk") || nsx.trim().equalsIgnoreCase("tn")) {
                        a.add(new HangDienMay(ma, ngaythang, dongia, soluong, nsx));
                    } else
                        a.add(new HangThuCong(ma, ngaythang, dongia, soluong, nsx));
                }
            }
        } catch (Exception e) {

        }
    }

    public void addList() {
        String addMa, addNgayThang, addNsx;
        double addDonGia, addSoLuong;
        Scanner ip = new Scanner(System.in);
        System.out.print("Vui long nhap ma hang: ");
        addMa = ip.next();
        System.out.print("Vui long nhap ngay thang: ");
        addNgayThang = ip.next();
        System.out.print("Vui long nhap don gia: ");
        addDonGia = ip.nextDouble();
        System.out.print("Vui long nhap so luong: ");
        addSoLuong = ip.nextDouble();
        System.out.print("Vui long nhap nsx (noi san xuat / nha san xuat): ");
        addNsx = ip.next();
        System.out.println(addNsx);
        if (addNsx.trim().equalsIgnoreCase("NK") || addNsx.trim().equalsIgnoreCase("TN")) {
            HangDienMay x = new HangDienMay(addMa, addNgayThang, addDonGia, addSoLuong, addNsx);
            a.add(x);
            System.out.println("Ban da them thanh cong 1 ma hang dien may ! ");
            System.out.println(x);

        } else {
            HangThuCong y = new HangThuCong(addMa, addNgayThang, addDonGia, addSoLuong, addNsx);
            a.add(y);
            System.out.println("Ban da them thanh cong 1 hang thu cong ! ");
            System.out.println(y);
        }
    }

    public void printList(ArrayList y, String Title) {
        System.out.println(Title);
        for (Object x : y) {
            System.out.println(x);
        }
        System.out.println("");
    }

    public void deleteList() {
        Scanner ip = new Scanner(System.in);
        String cache, ask;
        int k = -1;
        System.out.print("Nhap ma hang can xoa : ");
        cache = ip.next();
        // find ma
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getMaHang().equalsIgnoreCase(cache)) {
                k = i;
                break;
            }
        }
        if (k != -1) {
            System.out.println("Ban co chac chan muon xoa ma " + cache + " ? (yes/no) ");
            ask = ip.next();
            if (ask.trim().equalsIgnoreCase("yes".trim())) {
                a.remove(k);
            } else
                System.out.println("Ban da huy ! ");

        } else
            System.out.println("Khong ton tai ma hang nay ! ");

    }

    public void findHangHoa() {
        String ma;
        boolean kt = false;
        Scanner ip = new Scanner(System.in);
        System.out.print("Nhap Ma Hang Can Tim: ");
        ma = ip.next();
        for (HangHoa k : a) {
            if (k.getMaHang().trim().equalsIgnoreCase(ma)) {
                System.out.println(k);
                kt = true;
            }
        }
        if (kt == false) {
            System.out.println("Khong tim thay ma hang nay ! ");
        }
    }

    public void tinhTongTien() {
        double s = 0, s1 = 0;
        int d = 0, d1 = 0;
        for (HangHoa x : a) {
            if (x instanceof HangDienMay) {
                s += x.thanhTien();
                d++;
            } else if (x instanceof HangThuCong) {
                s1 += x.thanhTien();
                d1++;
            }
        }
        System.out.println("Tong Thanh Tien Cua Hang Dien May La : " + s / d);
        System.out.println("Tong Thanh Tien Cua Hang Thu Cong La : " + s1 / d1);
    }

    public void Output() {

        addList();
        deleteList();
        findHangHoa();
        printList(a, "IN DANH SACH HANG HOA !");
        tinhTongTien();
    }

    public static void main(String[] args) {
        DSHangHoa x = new DSHangHoa();
        System.out.println("LE MINH TUAN");
        x.readFile("E:\\FileReader\\HangHoa_Lab07.txt");
        x.Output();
    }
}