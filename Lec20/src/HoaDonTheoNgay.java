public class HoaDonTheoNgay extends HoaDon {
    private double soNgayThue;

    public double getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    public HoaDonTheoNgay(String maHD, String tenKhach, Date ngayHD, double donGia, double soNgayThue) {
        super(maHD, tenKhach, ngayHD, donGia);
        this.soNgayThue = soNgayThue;
    }

    public HoaDonTheoNgay() {
    }
    @Override
    public double tinhThanhTien() {
        // TODO Auto-generated method stub
        return super.tinhThanhTien()*soNgayThue;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "HD NGAY "+super.toString()+soNgayThue+" "+donGia+" TT = "+ tinhThanhTien()+ " ";
    }
 
}
