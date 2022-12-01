public class HangThuCong extends HangHoa{
    protected String nhaSanXuat;
     @Override
    public double tinhThanhTien() {
        return soLuong * donGia;
    }
    
    public String toString(){
        return "Thu Cong: "+super.toString()+", "+nhaSanXuat+", Thanh tien = "+tinhThanhTien();
    }

    public HangThuCong() {
    }

    public HangThuCong(String nhaSanXuat, String maHang, NgayThang ngayThang, double donGia, double soLuong) {
        super(maHang, ngayThang, donGia, soLuong);
        this.nhaSanXuat = nhaSanXuat;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }
    
    public static void main(String[] args) {
        NgayThang z = new NgayThang(1,3,2020);
        HangThuCong x = new HangThuCong("Nam Son", "Mh001", z, 110, 210);
        System.out.println(x);
    }
}
