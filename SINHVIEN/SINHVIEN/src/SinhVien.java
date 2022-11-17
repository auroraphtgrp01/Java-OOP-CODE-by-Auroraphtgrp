public class SinhVien {
    private String maSV, hoTen, ngaySinh, queQuan;
    private boolean gioiTinh;
    private double diemTB;
    public SinhVien(String maSV, String hoTen, String ngaySinh, String queQuan, boolean gioiTinh, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
        this.gioiTinh = gioiTinh;
        this.diemTB = diemTB;
    }

    public SinhVien() {

    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    

    
    public boolean isGioiTinh(boolean gioiTinh)
    {
        return gioiTinh;
    }
    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return maSV + " , " + hoTen + " , " + ngaySinh + " , " + queQuan + ", "+(gioiTinh ?"Nam":"Nu") + ", " + diemTB + ", " +getXepLoai();
    }

    public String getXepLoai() {
        if (diemTB < 3.5)
            return "Kem";
        if (diemTB < 5)
            return "Yeu";
        if (diemTB < 6.5)
            return "TBinh";
        if (diemTB < 8)
            return "Kha";
        if (diemTB < 9)
            return "Gioi";
        return "Xuat sac";
    }

    
}
