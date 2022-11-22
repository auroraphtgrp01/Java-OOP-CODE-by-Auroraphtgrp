public class HangDienMay extends HangHoa {
    private String noiSanXuat;

    public HangDienMay(String maHang, String ngayNhap, double donGia, double soLuong, String noiSanXuat) {
        super(maHang, ngayNhap, donGia, soLuong);
        this.noiSanXuat = noiSanXuat;
    }
   
    public HangDienMay(String noiSanXuat) {
        this.noiSanXuat = noiSanXuat;
    }

    public String getNoiSanXuat() {
        return noiSanXuat;
    }

    public void setNoiSanXuat(String noiSanXuat) {
        this.noiSanXuat = noiSanXuat;
    }
    @Override
    public double thanhTien() {
        double s=0;
        if(noiSanXuat.trim().equalsIgnoreCase("TN".trim())){
            s=super.getSoLuong()*super.getDonGia();
        } else if(noiSanXuat.trim().equalsIgnoreCase("NK".trim())){
            s=super.getDonGia()*super.getSoLuong()*0.12;
        }
        return s;
    }
    @Override
    public String toString() {
        return "Hang DM " + super.toString() + noiSanXuat + " T.Tien = "+ thanhTien();
    }

    public static void main(String[] args) throws Exception {
        HangDienMay x = new HangDienMay("001", "1/1/2000", 900000, 10, "NK");
        System.out.println(x);
    }

    
}
