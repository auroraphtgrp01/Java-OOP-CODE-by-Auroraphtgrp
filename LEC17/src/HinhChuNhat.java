public class HinhChuNhat extends HinhVuong {

    private double canh2;

    public HinhChuNhat(double canh1, double canh2) {
        super(canh1);
        this.canh2 = canh2;
    }

    public double getCanh2() {
        return canh2;
    }

    public void setCanh2(double canh2) {
        this.canh2 = canh2;
    }

    public double dienTich() {
        double s = 0;
        s = getcanh1() * canh2;
        return s;
    }
    public double chuVi(){ 
        double p=0;
        p=(getcanh1()+canh2)/2;
        return p;
    }
  
    public String toString() {
        
        return "HCN ( "+getcanh1()+" ; "+canh2+" ) S = "+dienTich()+" ; P = "+chuVi();
    }
public static void main(String[] args) {
    HinhChuNhat y = new HinhChuNhat(2, 3);
    System.out.println(y);
}
}