public class HangThuCong extends HangHoa {
    private String nhaSanXuat;

    public HangThuCong(String maHang, String ngayNhap, double donGia, double soLuong, String nhaSanXuat) {
        super(maHang, ngayNhap, donGia, soLuong);
        this.nhaSanXuat = nhaSanXuat;
    }

    public HangThuCong(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    @Override
    public double thanhTien() {
        return getSoLuong() * getDonGia();
    }

    @Override
    public String toString() {
        return "Hang TC " + super.toString() + " " + nhaSanXuat + " T.Tien = " + thanhTien();
    }
public static void main(String[] args) {
    HangThuCong x = new HangThuCong("002", "1/1/2001", 1000, 90, "Duy Tan");
    System.out.println(x);
}
}
