public class CNTT extends SinhVien implements LxepLoai {
    private double java, html, css;

    public CNTT(String maSV, String hoTen, boolean gioiTinh, double java, double html, double css) {
        super(maSV, hoTen, gioiTinh);
        this.java = java;
        this.html = html;
        this.css = css;
    }

    public double getCss() {
        return css;
    }

    public void setCss(double css) {
        this.css = css;
    }

    public double getHtml() {
        return html;
    }

    public void setHtml(double html) {
        this.html = html;
    }

    public double getJava() {
        return java;
    }

    public void setJava(double java) {
        this.java = java;
    }

    @Override
    public double getDiemTB() {
        return (css + java * 2 + html) / 4;
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
