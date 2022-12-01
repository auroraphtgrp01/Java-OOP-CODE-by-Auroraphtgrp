
// import java.io.File;
// import java.util.ArrayList;
// import java.util.Scanner;

// public class DanhSachHangHoa {

//     ArrayList<HangHoa> a = new ArrayList<>();
//     int arr[] = new int[200];
//     int arr1[] = new int[200];
//     public void docFile(String tenFile) {
//         try {
//             File f = new File(tenFile);
//             if (f.exists()) {
//                 System.out.println("Da mo duoc file");
//                 Scanner read = new Scanner(f);
//                 while (read.hasNext()) {
//                     Scanner line = new Scanner(read.nextLine());
//                     String ma, nt, nsx;
//                     int sl, dg;
//                     ma = line.next();
//                     nt = line.next();
//                     sl = line.nextInt();
//                     dg = line.nextInt();
//                     nsx = line.nextLine();
//                     if (nsx.trim().equalsIgnoreCase("TN".trim())
//                             || nsx.trim().equalsIgnoreCase("NK".trim())) {
//                         a.add(new HangDienMay(nsx, ma, new NgayThang(nt), dg, sl));
//                     } else {
//                         a.add(new HangThuCong(nsx, ma, new NgayThang(nt), dg, sl));
//                     }
//                 }
//             } else {
//                 System.out.println("File khong ton tai ");
//             }
//         } catch (Exception e) {

//         }
//     }

//     // cau 1
//     public void xuatDanhSach(String cauDan) {
//         System.out.println(cauDan);
//         for (HangHoa x : a) {
//             System.out.println(x);
//         }
//     }

//     // cau 2
//     public void danhSachHoaDonTN(String cauDan) {
//         System.out.println(cauDan);
//         for (HangHoa x : a) {
//             if (x instanceof HangDienMay) {
//                 if (((HangDienMay) x).noiSanXuat.trim().equalsIgnoreCase("TN".trim())) {
//                     System.out.println(x);
//                 }
//             }
//         }
//     }

//     public void danhSachHoaDonNK(String cauDan) {
//         System.out.println(cauDan);
//         for (HangHoa x : a) {
//             if (x instanceof HangDienMay) {
//                 if (((HangDienMay) x).noiSanXuat.trim().equalsIgnoreCase("NK".trim())) {
//                     System.out.println(x);
//                 }
//             }
//         }
//     }

//     public void danhSachHoaDonHangThuCong(String cauDan) {
//         System.out.println(cauDan);
//         for (HangHoa x : a) {
//             if (x instanceof HangThuCong) {
//                 System.out.println(x);
//             }
//         }
//     }

//     // cau 3
//     public double tongTienTrongNuoc() {
//         double S = 0;
//         for (HangHoa x : a) {
//             if (x instanceof HangDienMay) {
//                 if (((HangDienMay) x).noiSanXuat.trim().equalsIgnoreCase("TN".trim())) {
//                     S = S + x.tinhThanhTien();
//                 }
//             }
//         }
//         return S;
//     }

//     public double tongTienNhapKhau() {
//         double S = 0;
//         for (HangHoa x : a) {
//             if (x instanceof HangDienMay) {
//                 if (((HangDienMay) x).noiSanXuat.trim().equalsIgnoreCase("NK".trim())) {
//                     S = S + x.tinhThanhTien();
//                 }
//             }
//         }
//         return S;
//     }

//     public double tongTienThuCong() {
//         double S = 0;
//         for (HangHoa x : a) {
//             if (x instanceof HangThuCong) {
//                 S = S + x.tinhThanhTien();
//             }
//         }
//         return S;
//     }
//     // cau 4

//     public void xoaHoaDonTheoMa(String stt) {
//         for (int i = 0; i < a.size(); i++) {
//             if (a.get(i).maHang.trim().equalsIgnoreCase(stt.trim())) {
//                 a.remove(i);
//                 i--;
//             }
//         }
//     }

//     // cau5
//     public HangHoa tongThanhTienLonNhat() {
//         HangHoa y = a.get(0);
//         for (int i = 0; i < a.size(); i++) {
//             if (y.tinhThanhTien() < a.get(i).tinhThanhTien()) {
//                 y = a.get(i);
//             }
//         }
//         return y;
//     }

//     // cau 6
//     public double tongTienTheoNgay(int ngay) {
//         double S = 0;
//         for (HangHoa x : a) {
//             if (x.ngayThang.getNgay() == ngay) {
//                 S = S + x.tinhThanhTien();
//             }
//         }
//         return S;
//     }

//     // cau7
//     public double tongTienTheoThang(int thang) {
//         double S = 0;
//         for (HangHoa x : a) {
//             if (x.ngayThang.getNgay() > 0 && x.ngayThang.getNgay() < 31) {
//                 if (x.ngayThang.getThang() == thang) {
//                     S = S + x.tinhThanhTien();
//                 }
//             }
//         }
//         return S;
//     }

//     // tim kiem theo ma
//     // cau8
//     public HangHoa timKiemTheoMa(String timKiem) {
//         HangHoa x = null;
//         for (int i = 0; i < a.size(); i++) {
//             if (a.get(i).maHang.trim().equalsIgnoreCase(timKiem.trim())) {
//                 x = a.get(i);
//             }
//         }
//         return x;
//     }
//     // cau9
//     // them moi

//     public void dele(int k, int x) {
//         for (int i = x + 1; i < k; i++) {
//             arr[i - 1] = arr[i];
//         }
//     }

//     public void arr() {
//         int k = 0;
//         for (int i = 0; i < a.size(); i++) {
//             boolean kt = false;
//             for (int j = 0; j < a.size(); j++) {
//                 if (a.get(i).ngayThang.getNgay() == a.get(j).ngayThang.getNgay()) {
//                     arr[k] = a.get(i).ngayThang.getNgay();
//                     k++;
//                 }
//             }
//         }
//         for (int i = 0; i < k - 1; i++) {
//             for (int j = i + 1; j < k; j++) {
//                 if (arr[i] == arr[j]) {
//                     dele(k, j);
//                     i--;
//                     k--;
//                 }
//             }
//         }
//         for (int i = 0; i < k; i++) {
//             System.out.println(arr[i]);
//         }
//     }

//     public void tongThanhTien() {
//         int d = 0,t=0;
//         double s = 0;
        
//         for (HangHoa x : a) {
//             if (x.ngayThang.getNgay() == arr[d]) {
//                 System.out.println(x);
//                 d++;
//             }
//         }
//     }

//     void Output() {
//         Scanner kb = new Scanner(System.in);
//         xuatDanhSach("1. Danh sach cac mat hang : ");
//         arr();
//         tongThanhTien();
//         // danhSachHoaDonTN("2. Danh sach hoa don trong nuoc : ");
//         // danhSachHoaDonNK("Danh sach hoa don nhap khau : ");
//         // danhSachHoaDonHangThuCong("Danh sach hoa don hang thu cong : ");
//         // System.out.println("3. Tong tien trong nuoc : " + tongTienTrongNuoc());
//         // System.out.println("Tong tien nhap khau : " + tongTienNhapKhau());
//         // System.out.println("Tong tien thu cong : " + tongTienThuCong());
//         // String ma;
//         // System.out.print("4. Nhap ma can xoa : ");
//         // ma = kb.nextLine();
//         // xoaHoaDonTheoMa(ma);
//         // xuatDanhSach("Danh sach ma da xoa : ");
//         // System.out.println("5. Hoa don co tong thanh tien lon nhat : " +
//         // tongThanhTienLonNhat());
//         // System.out.print("6. Nhap ngay muon tinh tong tien : ");
//         // int ngay = kb.nextInt();
//         // System.out.println("Tong tien hoa don theo ngay : " +
//         // tongTienTheoNgay(ngay));
//         // System.out.print("7. Nhap thang muon tinh tong tien : ");
//         // int thang = kb.nextInt();
//         // kb.nextLine();
//         // System.out.println("Tong tien hoa don theo thang :
//         // "+tongTienTheoThang(thang));
//         // System.out.print("8. Nhap ma de tim kiem :");
//         // String timKiem = kb.nextLine();
//         // System.out.flush();
//         // System.out.println("Ma vua tim duoc la : " + timKiemTheoMa(timKiem));
//         // System.out.println("9. Them moi hang hoa : ");
//         // themMoiHangHoa();
//         // xuatDanhSach("Danh sach hang hoa sau khi duoc them moi la : ");
//     }

//     public static void main(String[] args) {
//         DanhSachHangHoa y = new DanhSachHangHoa();
//         y.docFile("E:\\FileReader\\HangHoa_Lab07.txt");
//         y.Output();
//     }

// }
