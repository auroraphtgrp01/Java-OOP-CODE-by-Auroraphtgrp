public abstract class SinhVien {
    private String maSV, hoTen;
    public SinhVien(String maSV, String hoTen, boolean gioiTinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
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
    private boolean gioiTinh;
    public boolean isGioiTinh() {
        return gioiTinh;
    }
    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public abstract double getDiemTB();
    @Override
    public String toString() {
        
        return maSV+", "+hoTen+", "+(gioiTinh?"Nam ":"Nu ");
    }
}
