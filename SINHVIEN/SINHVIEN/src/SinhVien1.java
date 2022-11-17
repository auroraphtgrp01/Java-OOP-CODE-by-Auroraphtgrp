public class SinhVien1 {
    private String maSV, hoTen, queQuan;
    public SinhVien1(String maSV, String hoTen, String queQuan, NgayThang ngaySinh, boolean gioiTinh, double diem) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diem = diem;
    }
    private NgayThang ngaySinh;
    private boolean gioiTinh;
    private double diem;
    public String toString(){
        return maSV+", "+hoTen+", "+ngaySinh+", "+queQuan+", "+(gioiTinh?"Nam":"Nu") + " "+diem;
    }
    public static void main(String[] args){
        SinhVien1 x = new SinhVien1("001", "Le Minh Tuan", "Da Nang", new NgayThang("1/11/2003"), true, 10);
        System.out.println(x);
    }
}
