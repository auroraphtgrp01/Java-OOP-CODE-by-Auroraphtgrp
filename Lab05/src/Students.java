public class Students extends People {
    private double mon1,mon2,mon3;

    public Students(double mon1, double mon2, double mon3) {
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
    }

    public Students(String ma, String hoTen, String ngaySinh, boolean gioiTinh, double mon1, double mon2, double mon3) {
        super(ma, hoTen, ngaySinh, gioiTinh);
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
    }

    public double getMon3() {
        return mon3;
    }

    public void setMon3(double mon3) {
        this.mon3 = mon3;
    }

    public double getMon2() {
        return mon2;
    }

    public void setMon2(double mon2) {
        this.mon2 = mon2;
    }

    public double getMon1() {
        return mon1;
    }

    public void setMon1(double mon1) {
        this.mon1 = mon1;
    }
    public double tinhDTB(){
        return (mon1+mon2+mon3)/3;
    
        
    }
   
    public String toString() {
       return getMa() + " "+getHoTen()+ ""+(isGioiTinh()?"Nam":"Nu")+ " "+getNgaySinh()+ " "+getMon1()+" "+getMon2()+" "+getMon3()+" DTB = "+tinhDTB();
    }
public static void main(String[] args) {
    Students x = new Students("SV001", "Nguyen Thi B", "1/11/2003", false, 9, 9, 9);
    System.out.println(x);
}

}
