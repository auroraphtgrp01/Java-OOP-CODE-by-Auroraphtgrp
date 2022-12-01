public class HoaDon implements lHoaDon {
    String maHD, tenKhach;
    Date ngayHD;
    double donGia;

    public String getTenKhach() {
        return tenKhach;
    }

    public void setTenKhach(String tenKhach) {
        this.tenKhach = tenKhach;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public Date getNgayHD() {
        return ngayHD;
    }

    public void setNgayHD(Date ngayHD) {
        this.ngayHD = ngayHD;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public HoaDon() {
    }

    public HoaDon(String maHD, String tenKhach, Date ngayHD, double donGia) {
        this.maHD = maHD;
        this.tenKhach = tenKhach;
        this.ngayHD = ngayHD;
        this.donGia = donGia;
    }
@Override
public double tinhThanhTien(){
    return donGia;
}
@Override
public String toString() {

    return maHD+ " "+ngayHD+" "+tenKhach+" ";
}
}
