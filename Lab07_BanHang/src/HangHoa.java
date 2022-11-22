public abstract class HangHoa {
    private String maHang, ngayNhap;
    private double donGia, soLuong;

    public abstract double thanhTien();

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public HangHoa(String maHang, String ngayNhap, double donGia, double soLuong) {
        this.maHang = maHang;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public HangHoa() {
    }

    public double getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return maHang + " " + ngayNhap + " " + donGia + " " + soLuong + " ";
    }
}