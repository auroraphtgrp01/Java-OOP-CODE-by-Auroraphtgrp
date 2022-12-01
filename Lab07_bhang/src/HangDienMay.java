
public class HangDienMay extends HangHoa {
    protected String noiSanXuat;

    @Override
    public double tinhThanhTien() {
        if (noiSanXuat.equalsIgnoreCase("TN".trim())) {
            return soLuong * donGia;
        } else {
            return (soLuong * donGia * 120) / 100;
        }
    }

    public String toString() {
        return "Dien may: " + super.toString() + ", " + noiSanXuat + ", Thanh tien = " + tinhThanhTien();
    }

    public HangDienMay() {
    }

    public HangDienMay(String noiSanXuat, String maHang, NgayThang ngayThang, double donGia, double soLuong) {
        super(maHang, ngayThang, donGia, soLuong);
        this.noiSanXuat = noiSanXuat;
    }

    public String getNoiSanXuat() {
        return noiSanXuat;
    }

    public void setNoiSanXuat(String noiSanXuat) {
        this.noiSanXuat = noiSanXuat;
    }

    public static void main(String[] args) {
        NgayThang z = new NgayThang(24, 05, 2003);
        HangDienMay x = new HangDienMay("TN", "MH01", z, 100, 200);
       
        System.out.println(x);
        
    }
}
