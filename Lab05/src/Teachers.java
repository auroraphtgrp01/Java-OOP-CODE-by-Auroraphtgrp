public class Teachers extends People {
    private String monHoc;
    private double soGio, donGia;
    
    public Teachers(String monHoc, double soGio, double donGia) {
        this.monHoc = monHoc;
        this.soGio = soGio;
        this.donGia = donGia;
    }
    public Teachers(String ma, String hoTen, String ngaySinh, boolean gioiTinh, String monHoc, double soGio,
            double donGia) {
        super(ma, hoTen, ngaySinh, gioiTinh);
        this.monHoc = monHoc;
        this.soGio = soGio;
        this.donGia = donGia;
    }
    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public double getSoGio() {
        return soGio;
    }
    public void setSoGio(double soGio) {
        this.soGio = soGio;
    }
    public String getMonHoc() {
        return monHoc;
    }
    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }
    
    public double tienDay(){
        return soGio*donGia;
    }

    public String toString() {
        
        return getMa()+" "+getHoTen()+""+(isGioiTinh()?"Nam":"Nu")+" "+getNgaySinh()+" "+getMonHoc()+" "+getSoGio()+" "+getDonGia();
    }
    public static void main(String[] args) {
        Teachers x = new Teachers("GV001", "Nguyen Van A", "1/1/1999", true, "Toan", 10, 9991);
        System.out.println(x);
    }
}
