public class KinhTe extends SinhVien implements LxepLoai {
    private double nlkt, mkt;

    public KinhTe(String maSV, String hoTen, boolean gioiTinh, double nlkt, double mkt) {
        super(maSV, hoTen, gioiTinh);
        this.nlkt = nlkt;
        this.mkt = mkt;
    }

    public double getMkt() {
        return mkt;
    }

    public void setMkt(double mkt) {
        this.mkt = mkt;
    }

    public double getNlkt() {
        return nlkt;
    }

    public void setNlkt(double nlkt) {
        this.nlkt = nlkt;
    }

    @Override
    public double getDiemTB(){
        return (nlkt * 2 + mkt) / 3;
    }

    @Override
    public String getHocLuc() {
        if (getDiemTB() < 3.5)
            return "Kem";
        if (getDiemTB() < 5)
            return "Yeu";
        if (getDiemTB() < 6.5)
            return "Trung Binh";
        if (getDiemTB() < 8)
            return "Kha";
        if (getDiemTB() < 9)
            return "Gioi";
        return "Xuat sac";
    }

}
