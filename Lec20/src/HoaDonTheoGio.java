public class HoaDonTheoGio extends HoaDon{
    private double soGioThue;
    public HoaDonTheoGio() {
    }

    public HoaDonTheoGio(String maHD, String tenKhach, Date ngayHD, double donGia, double soGioThue) {
        super(maHD, tenKhach, ngayHD, donGia);
        this.soGioThue = soGioThue;
    }

    public double getSoGioThue() {
        return soGioThue;
    }

    public void setSoGioThue(int soGioThue) {
        this.soGioThue = soGioThue;
    }
    @Override
    public double tinhThanhTien() {
        // TODO Auto-generated method stub
        return super.tinhThanhTien()*soGioThue;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
       return "HD GIO "+super.toString()+soGioThue+" "+donGia+" TT = "+ tinhThanhTien()+" ";
    }
    
}
