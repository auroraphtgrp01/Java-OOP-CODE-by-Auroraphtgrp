public class NgayThang {
    private int ngay, thang, nam;
    public int getNam() {
        return nam;
    }
    public void setNam(int nam) {
        this.nam = nam;
    }
    public int getThang() {
        return thang;
    }
    public void setThang(int thang) {
        this.thang = thang;
    }
    public int getNgay() {
        return ngay;
    }
    public void setNgay(int ngay) {
        this.ngay = ngay;
    }
    public NgayThang(){
        ngay=thang =1;
        nam=2000;
    }
    public NgayThang(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
    public NgayThang(String st){
        String s[] = st.split("/");
        ngay = Integer.parseInt(s[0]);
        thang = Integer.parseInt(s[1]);
        nam = Integer.parseInt(s[2]);
    }
    public String toString(){
        return ngay+"/"+thang+"/"+nam;
    }
    
    
}
