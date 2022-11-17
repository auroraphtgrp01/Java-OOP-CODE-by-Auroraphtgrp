public abstract class SV {
    protected String maSV, hoTen;
    protected boolean gioiTinh;
    public abstract double tinhDTB();

    public SV(String maSV, String hoTen, boolean gioiTinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
    }
    public SV(){
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    public String xepLoai(){
        if(tinhDTB() < 3.5) return "Kem";
        if(tinhDTB() < 5) return "Yeu";
        if(tinhDTB() < 6.5) return "Trung binh";
        if(tinhDTB() < 8) return "Kha";
        if(tinhDTB() < 9) return "Gioi";
        return "Xuat sac";
    }
    @Override
    public String toString() {
        return maSV +
                ", " + hoTen+
                ", " + (gioiTinh?"Nam":"Nu");
    }
}