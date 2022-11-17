public class CNTT extends SV{
    private double java, css, html;

    public CNTT(String maSV, String hoTen, boolean gioiTinh, double java, double css, double html) {
        super(maSV, hoTen, gioiTinh);
        this.java = java;
        this.css = css;
        this.html = html;
    }
    public CNTT(){

    }
    public double getJava() {
        return java;
    }

    public void setJava(double java) {
        this.java = java;
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

    @Override
    public double tinhDTB() {
        return (java*2 + css + html)/4;
    }

    @Override
    public String toString() {
        return "CNTT:" + super.toString() +
                ", " + java +
                ", " + css +
                ", " + html;
    }

    public static void main(String[] args) {
        CNTT x = new CNTT();
        System.out.println(x);
    }
}