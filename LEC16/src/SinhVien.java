public class SinhVien {
    private String maSV, hoTen;
    private double Toan, Ly, Hoa;
    private boolean gioiTinh;

    public SinhVien(String maSV, String hoTen, boolean gioiTinh, double toan, double ly, double hoa) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.Toan = toan;
        this.Ly = ly;
        this.Hoa = hoa;
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

    public boolean isGioiTinh(boolean gt) {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public double getHoa() {
        return Hoa;
    }

    public void setHoa(double hoa) {
        this.Hoa = hoa;
    }

    public double getLy() {
        return Ly;
    }

    public void setLy(double ly) {
        this.Ly = ly;
    }

    public double getToan() {
        return Toan;
    }

    public void setToan(double toan) {
        this.Toan = toan;
    }

    public SinhVien() {
    }

    public double tinhDTB() {
        double s = 0;
        s = Toan * 2 + Ly + Hoa;
        return s / 4;
    }

    public String xepLoai() {
        if (tinhDTB() < 3.5)
            return "Kem";
        if (tinhDTB() < 5)
            return "Yeu";
        if (tinhDTB() < 6.5)
            return "Trung Binh";
        if (tinhDTB() < 8)
            return "Kha";
        if (tinhDTB() < 9)
            return "Gioi";
        return "Xuat sac";
    }

    public String toString() {
        return maSV + " " + hoTen + "" + (gioiTinh ? " Nam " : " Nu ") + Toan + " " + Ly + " " + Hoa + " " + xepLoai();
    }

    public static void main(String[] args) {
        SinhVien x = new SinhVien("sv001", "Le Minh Tuan", true, 9, 9, 8);
        System.out.println(x);
    }
}
