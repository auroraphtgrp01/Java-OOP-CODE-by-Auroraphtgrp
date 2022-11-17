public class KinhTe extends SV{
    private double nLKT, mkt;

    public KinhTe(String maSV, String hoTen, boolean gioiTinh, double nLKT, double mkt) {
        super(maSV, hoTen, gioiTinh);
        this.nLKT = nLKT;
        this.mkt = mkt;
    }
    public KinhTe(){
    }

    public double getnLKT() {
        return nLKT;
    }

    public void setnLKT(double nLKT) {
        this.nLKT = nLKT;
    }

    public double getMkt() {
        return mkt;
    }

    public void setMkt(double mkt) {
        this.mkt = mkt;
    }

    @Override
    public double tinhDTB() {
        return (nLKT*2 + mkt)/3;
    }

    @Override
    public String toString() {
        return "KinhTe:" + super.toString() +
                ", " + nLKT +
                ", " + mkt;
    }

    public static void main(String[] args) {
        KinhTe x = new KinhTe();
    }
}